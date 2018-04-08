package com.zd.shop.pojo.po;

import java.io.Serializable;
import java.sql.Date;

public class Product implements Serializable{

    private Integer pro_id;


    private String pro_name;


    private Double pro_price;


    private String pro_image;


    private String pro_desc;


    private Date pro_date;


    private Integer pro_status;


    private Integer cat_id;


    public Integer getPro_id() {
        return pro_id;
    }


    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }


    public String getPro_name() {
        return pro_name;
    }


    public void setPro_name(String pro_name) {
        this.pro_name = pro_name == null ? null : pro_name.trim();
    }


    public Double getPro_price() {
        return pro_price;
    }


    public void setPro_price(Double pro_price) {
        this.pro_price = pro_price;
    }


    public String getPro_image() {
        return pro_image;
    }


    public void setPro_image(String pro_image) {
        this.pro_image = pro_image == null ? null : pro_image.trim();
    }


    public String getPro_desc() {
        return pro_desc;
    }


    public void setPro_desc(String pro_desc) {
        this.pro_desc = pro_desc == null ? null : pro_desc.trim();
    }


    public Date getPro_date() {
        return pro_date;
    }


    public void setPro_date(Date pro_date) {
        this.pro_date = pro_date;
    }


    public Integer getPro_status() {
        return pro_status;
    }


    public void setPro_status(Integer pro_status) {
        this.pro_status = pro_status;
    }


    public Integer getCat_id() {
        return cat_id;
    }


    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }
}