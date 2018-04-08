package com.zd.shop.search.pojo.po;

import java.io.Serializable;

public class Prodesc implements Serializable{
    private Integer proid;

    private String prodesc;

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getProdesc() {
        return prodesc;
    }

    public void setProdesc(String prodesc) {
        this.prodesc = prodesc == null ? null : prodesc.trim();
    }
}