package com.dhg.auth.service;

import com.alibaba.fastjson.JSONObject;
import com.dhg.auth.dao.ArticleDao;
import com.dhg.auth.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Pro-dhg
 * @date: 2023/08/10 16:07
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    /**
     * 新增文章
     */
    @Transactional(rollbackFor = Exception.class)
    public JSONObject addArticle(JSONObject jsonObject) {
        articleDao.addArticle(jsonObject);
        return CommonUtil.successJson();
    }

    /**
     * 文章列表
     */
    public JSONObject listArticle(JSONObject jsonObject) {
        CommonUtil.fillPageParam(jsonObject);
        int count = articleDao.countArticle(jsonObject);
        List<JSONObject> list = articleDao.listArticle(jsonObject);
        return CommonUtil.successPage(jsonObject, list, count);
    }

    /**
     * 更新文章
     */
    @Transactional(rollbackFor = Exception.class)
    public JSONObject updateArticle(JSONObject jsonObject) {
        articleDao.updateArticle(jsonObject);
        return CommonUtil.successJson();
    }
}
