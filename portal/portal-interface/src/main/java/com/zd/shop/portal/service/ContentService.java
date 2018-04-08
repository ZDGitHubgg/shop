package com.zd.shop.portal.service;

import com.zd.shop.portal.pojo.po.Content;

import java.util.List;

public interface ContentService {
    List<Content> listContentById(Long cid);
}
