package com.zd.shop.sso.dao;

import com.zd.shop.sso.pojo.po.User;

public interface UserCustomMapper {
    User selectByName(String username);
}
