package com.dhg.auth.dao;

import com.alibaba.fastjson.JSONObject;
import com.dhg.auth.dto.session.SessionUserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

/**
 * @author: Pro-dhg
 * @description: 登录相关dao
 * @date: 2023/08/10 11:02
 */
public interface LoginDao {
    /**
     * 根据用户名和密码查询对应的用户
     */
    JSONObject checkUser(@Param("username") String username, @Param("password") String password);

    SessionUserInfo getUserInfo(String username);

    Set<String> getAllMenu();

    Set<String> getAllPermissionCode();
}
