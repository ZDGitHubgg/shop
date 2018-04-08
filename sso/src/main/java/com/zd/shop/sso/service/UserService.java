package com.zd.shop.sso.service;

import com.zd.shop.commons.dto.ResultObject;

public interface UserService {

    ResultObject userlogin(String username, String password);
}
