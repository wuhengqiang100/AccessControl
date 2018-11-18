package com.java1234.service;

import com.java1234.entity.Control;
import com.java1234.entity.User;

/**
 * 用户service接口
 */
public interface UserService {
    /**
     * 根据表单实体查用户信息
     * @param control
     * @return
     */
    public User getUserByLoginUser(Control control);
}
