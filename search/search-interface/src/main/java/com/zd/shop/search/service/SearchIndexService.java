package com.zd.shop.search.service;

import com.zd.shop.search.pojo.dto.SearchItemCustomResult;

public interface SearchIndexService {
    SearchItemCustomResult searchIndex(String keyword, Integer pageIndex, Integer pageSize);
}
