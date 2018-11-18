package com.java1234.dao;

import com.java1234.entity.Control;
import com.java1234.entity.User;

import java.util.Map;

/**
 * 用户dao层
 */
public interface UserDao {
    /**
     * 登录的表单实体查,系统用户实体
     * @param control
     * @return
     */
    public User getUserByLoginUser(Control control);
}
