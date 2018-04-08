package com.zd.shop.search.dao;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zd.shop.search.pojo.dto.SearchItemCustomResult;
import com.zd.shop.search.pojo.vo.SearchItemCustom;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SearchIndexDao {

    @Autowired
    private SolrServer solrServer;

    public SearchItemCustomResult searchIndex(SolrQuery solrQuery, Integer pageSize) {
        SearchItemCustomResult result = new SearchItemCustomResult();
        try {
            //获取到查询索引库的响应
            QueryResponse response = solrServer.query(solrQuery);
            //通过响应获取文档域
            SolrDocumentList solrDocumentList = response.getResults();
            //通过响应获取到高亮的结果集
            Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();
            //numfound
            long numFound = solrDocumentList.getNumFound();
            //创建一个空集合 solrDocumentList-->itemList
            List<SearchItemCustom> itemList = new ArrayList<SearchItemCustom>();
            for (SolrDocument document:solrDocumentList) {
                SearchItemCustom item = new SearchItemCustom();
                //给对象设置
                item.setId((String) document.get("id"));
                item.setCatName((String) document.get("cat_name"));
                item.setProImage((String) document.get("pro_image"));
                item.setProName((String) document.get("pro_name"));
                item.setProPrice((Double) document.get("pro_price"));
                //通过ID获取map
                List<String> stringList = highlighting.get(document.get("id")).get("pro_desc");
                String title = "";
                if(stringList!=null && stringList.size()>0){
                    title = stringList.get(0);
                }else{
                    title = (String) document.get("pro_desc");
                }
                item.setProDesc(title);
                itemList.add(item);
            }
            //退一进一
            long totalPages = (numFound+pageSize-1)/pageSize;
            result.setList(itemList);
            result.setRecordCount(numFound);
            result.setTotalPages(totalPages);
        } catch (SolrServerException e) {
            e.printStackTrace();
        }
        return result;
    }
}
