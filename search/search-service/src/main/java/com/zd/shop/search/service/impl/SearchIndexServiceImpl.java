package com.zd.shop.search.service.impl;

import com.zd.shop.search.dao.SearchIndexDao;
import com.zd.shop.search.pojo.dto.SearchItemCustomResult;
import com.zd.shop.search.service.SearchIndexService;
import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchIndexServiceImpl implements SearchIndexService {

    @Autowired
    private SearchIndexDao searchIndexDao;

    @Override
    public SearchItemCustomResult searchIndex(String keyword, Integer pageIndex, Integer pageSize) {
        SearchItemCustomResult result = null;
        try {
            //创建solrQuery
            SolrQuery solrQuery = new SolrQuery();
            //设置查询内容
            solrQuery.setQuery(keyword);
            //设置分页条件
            solrQuery.setStart((pageIndex-1)*pageSize);
            solrQuery.setRows(pageSize);
            //设置查询字段
            solrQuery.set("df","item_keywords");
            //设置高亮
            solrQuery.setHighlight(true);
            solrQuery.addHighlightField("pro_name");
            solrQuery.setHighlightSimplePre("<span style='color:red;'>");
            solrQuery.setHighlightSimplePost("</span>");
            result = searchIndexDao.searchIndex(solrQuery,pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
