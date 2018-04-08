package com.zd.shop.sso.web;

import com.zd.shop.commons.dto.ResultObject;
import com.zd.shop.commons.util.CookieUtils;
import com.zd.shop.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SSOAction {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String toindex(){
        return "index";
    }

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public ResultObject dologin(String username, String password, HttpServletRequest request, HttpServletResponse response){
        ResultObject resultObject = null;
        try {
            //调用业务逻辑层方法
            resultObject = userService.userlogin(username,password);
            //判断是否登录成功
            if(resultObject.isSuccess()){
                String uuid = resultObject.getData().toString();
                CookieUtils.setCookie(request,response,"TOKEN",uuid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultObject;
    }
}
