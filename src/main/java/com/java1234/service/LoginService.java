package com.java1234.service;

import com.java1234.entity.Control;

import java.util.List;

/**
 * 登录service接口层
 */
public interface LoginService {

    /**
     * 获得请求的所有数据
     * @return
     */
    public List<Control> getControlAll();
}
