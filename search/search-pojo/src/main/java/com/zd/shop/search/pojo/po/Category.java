package com.zd.shop.search.pojo.po;

import java.io.Serializable;

public class Category implements Serializable{
    private Integer catId;

    private String catName;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }
}