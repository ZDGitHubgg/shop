package com.zd.shop.web;

import com.zd.shop.pojo.po.Category;
import com.zd.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryAction {
    @Autowired
    private ItemService itemService;

    @ResponseBody
    @RequestMapping(value = "/category/categorySelect",method = RequestMethod.GET)
    public List<Category> categoryList(){
        List<Category> categories = null;
        try {
            categories = itemService.categoryList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return categories;
    }
}
