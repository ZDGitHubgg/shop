package com.zd.shop.search.pojo.vo;

import java.io.Serializable;

public class SearchItemCustom implements Serializable{
    private String id;
    private String proDesc;
    private String proName;
    private String catName;
    private String proImage;
    private Double proPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getProImage() {
        return proImage;
    }

    public void setProImage(String proImage) {
        this.proImage = proImage;
    }

    public Double getProPrice() {
        return proPrice;
    }

    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }
}
