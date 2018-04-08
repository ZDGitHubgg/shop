package com.zd.shop.portal.service.impl;

import com.zd.shop.commons.jedis.JedisClient;
import com.zd.shop.commons.util.JsonUtils;
import com.zd.shop.commons.util.StrKit;
import com.zd.shop.portal.dao.ContentMapper;
import com.zd.shop.portal.pojo.po.Content;
import com.zd.shop.portal.pojo.po.ContentExample;
import com.zd.shop.portal.service.ContentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ContentMapper contentDao;
    @Autowired
    private JedisClient jedisClient;


    @Override
    public List<Content> listContentById(Long cid) {
        //1 先查缓存服务器
        //若有，从缓存中取，返回
        //若无，从MYSQL中查
        try {
            String jsonString = jedisClient.hget("CONTENT_LIST", cid + "");
            if(StrKit.notBlank(jsonString)){
                //jsonString不为空，从缓存服务器中获取
                List<Content> list = JsonUtils.jsonToList(jsonString, Content.class);
                return list;
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        //2 主业务：通过CID查询CONTENT
        //创建模板
        ContentExample example = new ContentExample();
        ContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(cid);
        List<Content> contentList = contentDao.selectByExample(example);
        //3 从MYSQL中查询出来之后存放一份到缓存服务器中
        try {
            jedisClient.hset("CONTENT_LIST",cid+"",JsonUtils.objectToJson(contentList));
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return  contentList;
    }
}
