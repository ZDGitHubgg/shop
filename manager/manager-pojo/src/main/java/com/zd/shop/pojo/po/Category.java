package com.zd.shop.pojo.po;

import java.io.Serializable;

public class Category implements Serializable{

    private Integer cat_id;


    private String cat_name;


    public Integer getCat_id() {
        return cat_id;
    }


    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }


    public String getCat_name() {
        return cat_name;
    }


    public void setCat_name(String cat_name) {
        this.cat_name = cat_name == null ? null : cat_name.trim();
    }
}