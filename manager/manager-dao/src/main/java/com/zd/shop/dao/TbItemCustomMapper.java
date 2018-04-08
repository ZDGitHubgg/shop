package com.zd.shop.dao;

import com.zd.shop.pojo.dto.Page;
import com.zd.shop.pojo.po.Product;
import com.zd.shop.pojo.vo.ProCustom;
import com.zd.shop.pojo.vo.SearchItemCustom;

import java.util.List;

public interface TbItemCustomMapper {

    List<ProCustom> selectByPage(Page page);

    long countItems();

    int batchUpdate(Product product);

    List<SearchItemCustom> getSearchItemList();
}
