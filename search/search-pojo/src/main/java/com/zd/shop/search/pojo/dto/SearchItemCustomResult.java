package com.zd.shop.search.pojo.dto;

import com.zd.shop.search.pojo.vo.SearchItemCustom;

import java.util.List;

public class SearchItemCustomResult {
    //符合条件的总记录数
    private long recordCount;
    //总页数
    private long totalPages;
    //指定分页的集合
    private List<SearchItemCustom> list;

    public long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public List<SearchItemCustom> getList() {
        return list;
    }

    public void setList(List<SearchItemCustom> list) {
        this.list = list;
    }
}
