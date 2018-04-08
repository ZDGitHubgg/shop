package com.zd.shop.pojo.po;

import java.io.Serializable;

public class Orders implements Serializable{

    private Integer order_id;


    private String order_name;


    private Double order_price;


    private Integer order_status;


    private Integer order_number;


    private Integer user_id;


    public Integer getOrder_id() {
        return order_id;
    }


    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }


    public String getOrder_name() {
        return order_name;
    }


    public void setOrder_name(String order_name) {
        this.order_name = order_name == null ? null : order_name.trim();
    }


    public Double getOrder_price() {
        return order_price;
    }


    public void setOrder_price(Double order_price) {
        this.order_price = order_price;
    }


    public Integer getOrder_status() {
        return order_status;
    }


    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }


    public Integer getOrder_number() {
        return order_number;
    }


    public void setOrder_number(Integer order_number) {
        this.order_number = order_number;
    }


    public Integer getUser_id() {
        return user_id;
    }


    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}