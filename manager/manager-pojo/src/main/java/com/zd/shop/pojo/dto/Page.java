package com.zd.shop.pojo.dto;

import java.io.Serializable;

public class Page implements Serializable{
    //当前页的页码
    private int page;
    //每页的显示条数pageSize
    private int limit;

    public int getOffset() {
        return (page-1)*limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
