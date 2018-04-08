package com.zd.shop.service.impl;

import com.zd.shop.commons.dto.ResultObject;
import com.zd.shop.dao.TbItemCustomMapper;
import com.zd.shop.pojo.vo.SearchItemCustom;
import com.zd.shop.service.SearchItemCustomService;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class SearchItemCustomServiceImpl implements SearchItemCustomService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbItemCustomMapper itemCustomDao;

    @Autowired
    private SolrServer solrServer;

    @Override
    public ResultObject importIndex() {
        ResultObject resultObject = new ResultObject();
        resultObject.setSuccess(false);
        //采集数据
        List<SearchItemCustom> list = itemCustomDao.getSearchItemList();
        try {
            //遍历采集后的数据
            for (SearchItemCustom searchItem:list) {
                //solr的文档域
                SolrInputDocument document = new SolrInputDocument();
                //向文档对象中添加域：对应schema.xml配置文件中的域名
                document.addField("id",searchItem.getId());
                document.addField("pro_desc",searchItem.getProDesc());
                document.addField("pro_price",searchItem.getProPrice());
                document.addField("pro_image",searchItem.getProImage());
                document.addField("cat_name",searchItem.getCatName());
                document.addField("pro_name",searchItem.getProName());
                //写入索引库
                solrServer.add(document);
            }
            //提交索引库
            solrServer.commit();
            resultObject.setSuccess(true);
            resultObject.setMessage("恭喜你，一键导入成功！");
        } catch (SolrServerException e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        } catch (IOException e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return resultObject;
    }
}
