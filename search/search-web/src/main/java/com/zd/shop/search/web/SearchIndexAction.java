package com.zd.shop.search.web;

import com.zd.shop.commons.util.PropKit;
import com.zd.shop.search.pojo.dto.SearchItemCustomResult;
import com.zd.shop.search.service.SearchIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchIndexAction {

    @Autowired
    private SearchIndexService searchIndexService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public String search(@RequestParam(defaultValue = "1") Integer pageIndex,String keyword,Model model){
        System.out.println(pageIndex);
        Integer pageSize = PropKit.use("db.properties").getInt("search.pageSize");
        SearchItemCustomResult result = searchIndexService.searchIndex(keyword,pageIndex,pageSize);
        model.addAttribute("list",result.getList());
        model.addAttribute("totalCount",result.getRecordCount());
        model.addAttribute("totalPage",result.getTotalPages());
        return "index";
    }

}
