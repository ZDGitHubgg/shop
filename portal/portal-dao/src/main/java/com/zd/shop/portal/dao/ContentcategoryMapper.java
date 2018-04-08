package com.zd.shop.portal.dao;

import com.zd.shop.portal.pojo.po.Contentcategory;
import com.zd.shop.portal.pojo.po.ContentcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentcategoryMapper {
    int countByExample(ContentcategoryExample example);

    int deleteByExample(ContentcategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Contentcategory record);

    int insertSelective(Contentcategory record);

    List<Contentcategory> selectByExample(ContentcategoryExample example);

    Contentcategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Contentcategory record, @Param("example") ContentcategoryExample example);

    int updateByExample(@Param("record") Contentcategory record, @Param("example") ContentcategoryExample example);

    int updateByPrimaryKeySelective(Contentcategory record);

    int updateByPrimaryKey(Contentcategory record);
}