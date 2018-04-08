package com.zd.shop.service;

import com.zd.shop.pojo.dto.Page;
import com.zd.shop.pojo.po.Category;
import com.zd.shop.pojo.po.Product;
import com.zd.shop.pojo.vo.ProCustom;

import java.util.List;

public interface ItemService {
    /**
     * 分页数据
     * @param page
     * @return
     */
    List<ProCustom> listItems(Page page);

    /**
     * 查询商品条数
     * @return
     */
    long countItems();

    /**
     * 修改所选商品（删除）
     * @param ids
     * @return
     */
    int batchUpdate(List<Integer> ids);

    int deletePro(int pro_id);

    int itemAdd(Product product);

    List<Category> categoryList();

    int editPro(Product product);
}
