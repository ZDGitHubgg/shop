package com.zd.shop.pojo.vo;

import com.zd.shop.pojo.po.Product;

import java.io.Serializable;

public class ProCustom extends Product implements Serializable{
    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    private String cat_name;

    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
