package com.zd.shop.service;

import com.zd.shop.commons.dto.ResultObject;

public interface SearchItemCustomService {
    //加工数据，添加到索引库
    ResultObject importIndex();
}
