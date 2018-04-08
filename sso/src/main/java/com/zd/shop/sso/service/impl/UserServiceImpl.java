package com.zd.shop.sso.service.impl;

import com.zd.shop.commons.dto.ResultObject;
import com.zd.shop.commons.jedis.JedisClient;
import com.zd.shop.commons.util.JsonUtils;
import com.zd.shop.commons.util.StrKit;
import com.zd.shop.sso.dao.UserCustomMapper;
import com.zd.shop.sso.dao.UserMapper;
import com.zd.shop.sso.pojo.po.User;
import com.zd.shop.sso.pojo.po.UserExample;
import com.zd.shop.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserCustomMapper userCustomDao;
    @Autowired
    private JedisClient jedisClient;

    @Override
    public ResultObject userlogin(String username, String password) {
        ResultObject resultObject = null;
        try {
            User user = userCustomDao.selectByName(username);
            //判断集合是否为空
            if(user==null || user.equals("")){
                //如果不存在
                resultObject = new ResultObject();
                resultObject.setMessage("用户名不存在！");
                resultObject.setSuccess(false);
                return resultObject;
            }
            //用户名存在
            //User user = userList.get(0);
            System.out.println(user.getUserPassword());
            String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
            if(!md5DigestAsHex.equals(user.getUserPassword())){
                //密码错误
                resultObject = new ResultObject();
                resultObject.setSuccess(false);
                resultObject.setMessage("用户名或密码错误");
                return resultObject;
            }
                //用户名密码正确,将登陆信息存放在Redis里
                String uuid = StrKit.uuid();
                user.setUserPassword(null);
                jedisClient.set("TOKEN"+uuid, JsonUtils.objectToJson(user));
                //设置有效时间
                jedisClient.expire("TOKEN"+uuid,1800);
                //操作完成之后形成resultObject
                resultObject = new ResultObject();
                resultObject.setSuccess(true);
                resultObject.setMessage("登录成功");
                resultObject.setData(uuid);
                return resultObject;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  resultObject;
    }
}
