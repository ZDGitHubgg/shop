package com.zd.shop.web;

import com.zd.shop.commons.dto.ResultObject;
import com.zd.shop.pojo.dto.MessageResult;
import com.zd.shop.pojo.dto.Page;
import com.zd.shop.pojo.po.Product;
import com.zd.shop.pojo.vo.ProCustom;
import com.zd.shop.service.ItemService;
import com.zd.shop.service.SearchItemCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

@Controller
public class ItemAction {

    @Autowired
    private ItemService itemService;
    @Autowired
    private SearchItemCustomService  searchItemCustomService;

    @ResponseBody
    @RequestMapping(value = "/item/import",method = RequestMethod.POST)
    public ResultObject importIndex(){
        return searchItemCustomService.importIndex();
    }

    //分页商品数据
    @ResponseBody
    @RequestMapping(value = "/items" ,method = RequestMethod.GET)
    public MessageResult<ProCustom> listItemsToJson(Page page){
        //从后台把所有商品的数据查询到List，把List封装MessageResult
        MessageResult<ProCustom> messageResult = new MessageResult<ProCustom>();
        try {
            //调用业务逻辑层方法查询所有商品列表(page=? litmit=?)
            List<ProCustom> tbItemList = itemService.listItems(page);
            long count = itemService.countItems();
            //封装MessageResult
            messageResult.setCode(0);
            messageResult.setCount(count);
            messageResult.setMsg("success");
            messageResult.setData(tbItemList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return messageResult;
    }

    //批量删除
    @ResponseBody
    @RequestMapping(value = "/item/batch",method = RequestMethod.POST)
    public int batchUpdate(@RequestParam(value = "ids[]") List<Integer> ids){
        int i = 0;
        try {
            //调用业务逻辑层方法
            i = itemService.batchUpdate(ids);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    //添加商品
    @RequestMapping("/add")
    public String itemAdd(){
        return "";
    }

    //通过id删除商品
    @ResponseBody
    @RequestMapping(value = "/item/delete" ,method = RequestMethod.POST)
    public int deletePro(@RequestParam(value = "pro_id") int pro_id){
        int i = 0;
        try {
            //调用业务逻辑层方法
            i = itemService.deletePro(pro_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(i==0){
            return 0;
        }else {
            return 1;
        }
    }

    //通过id编辑商品
    @ResponseBody
    @RequestMapping(value = "/item/edit",method = RequestMethod.POST)
    public int editPro(Product product){
        int i = 0;
        try {
            i = itemService.editPro(product);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(i==0){
            return 0;
        }else{
            return 1;
        }
    }

    //添加商品
    @ResponseBody
    @RequestMapping(value = "/item/add",method = RequestMethod.POST)
    public int proAdd(Product product){
        int i =0;
        try {
            i = itemService.itemAdd(product);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(i==0){
            return 0;
        }else{
            return 1;
        }
    }


}
