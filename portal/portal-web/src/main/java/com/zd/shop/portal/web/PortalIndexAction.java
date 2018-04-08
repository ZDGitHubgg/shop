package com.zd.shop.portal.web;

import com.zd.shop.commons.util.PropKit;
import com.zd.shop.portal.pojo.po.Content;
import com.zd.shop.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PortalIndexAction {
    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        //调用业务逻辑层方法查询首页轮播图
        //1、注入service
        //2、调用方法
        //3、创建service实现类（三步：先去redis集群中查询，若有，直接返回，若没有，先去mysql查，存入redis缓存）
        Long cid = PropKit.use("db.properties").getLong("carousel.cid");
        List<Content> list = contentService.listContentById(cid);
        System.out.println(list.size());
        model.addAttribute("contentList",list);
        return "index";
    }

}
