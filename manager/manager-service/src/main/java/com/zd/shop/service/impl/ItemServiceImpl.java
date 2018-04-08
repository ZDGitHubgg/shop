package com.zd.shop.service.impl;

import com.zd.shop.dao.CategoryCustomMapper;
import com.zd.shop.dao.CategoryMapper;
import com.zd.shop.dao.ProductMapper;
import com.zd.shop.dao.TbItemCustomMapper;
import com.zd.shop.pojo.dto.Page;
import com.zd.shop.pojo.po.Category;
import com.zd.shop.pojo.po.Product;
import com.zd.shop.pojo.po.ProductExample;
import com.zd.shop.pojo.vo.ProCustom;
import com.zd.shop.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //TbItemMapper逆向自动生成的，TbItemCustomMapper自定义的，作为补充
    @Autowired
    private TbItemCustomMapper itemCustomDao;

    @Autowired
    private ProductMapper itemDao;

    @Autowired
    private CategoryCustomMapper categoryCustomDao;

    @Override
    public int editPro(Product product) {
        return itemDao.updateByPrimaryKeySelective(product);
    }

    @Override
    public List<Category> categoryList() {
        return categoryCustomDao.selectAll();
    }

    /**
     * 通过id删除商品
     * @param pro_id
     */
    @Transactional
    @Override
    public int deletePro(int pro_id) {
        Product product = new Product();
        product.setPro_status(3);
        product.setPro_id(pro_id);
        int i = itemDao.updateByPrimaryKeySelective(product);
        return i;
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @Transactional
    @Override
    public int batchUpdate(List<Integer> ids) {
        int i = 0;
        try {
            //创建对象用于更新
            Product record = new Product();
            record.setPro_status(3);
            //创建模板
            ProductExample example = new ProductExample();
            //创建内部类实例
            ProductExample.Criteria criteria = example.createCriteria();
            criteria.andPro_idIn(ids);
            //执行更新
            //i就是受到影响的行数
            i = itemDao.updateByExampleSelective(record, example);
        } catch (Exception e) {
            logger.debug(e.getMessage(), e);
        }
        return i;
    }

    /**
     * 得到分页数据
     * @param page
     * @return
     */
    @Override
    public List<ProCustom> listItems(Page page) {
        List<ProCustom> itemList = null;
        try {
            itemList = itemCustomDao.selectByPage(page);
        } catch (Exception e) {
            logger.debug(e.getMessage(), e);
        }
        return itemList;
    }

    //添加商品
    @Transactional
    @Override
    public int itemAdd(Product product) {
        return itemDao.insert(product);
    }

    /**
     * 得到分页的商品总条数
     * @return
     */
    @Override
    public long countItems() {
        long count = 0;
        try {
            count = itemCustomDao.countItems();
        }catch (Exception e){
            logger.debug(e.getMessage(),e);
        }
        return count;
    }
}
