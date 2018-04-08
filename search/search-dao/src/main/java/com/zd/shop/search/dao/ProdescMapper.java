package com.zd.shop.search.dao;

import com.zd.shop.search.pojo.po.Prodesc;
import com.zd.shop.search.pojo.po.ProdescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdescMapper {
    int countByExample(ProdescExample example);

    int deleteByExample(ProdescExample example);

    int deleteByPrimaryKey(Integer proid);

    int insert(Prodesc record);

    int insertSelective(Prodesc record);

    List<Prodesc> selectByExample(ProdescExample example);

    Prodesc selectByPrimaryKey(Integer proid);

    int updateByExampleSelective(@Param("record") Prodesc record, @Param("example") ProdescExample example);

    int updateByExample(@Param("record") Prodesc record, @Param("example") ProdescExample example);

    int updateByPrimaryKeySelective(Prodesc record);

    int updateByPrimaryKey(Prodesc record);
}