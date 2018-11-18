package com.java1234.service;

import com.java1234.entity.Control;

import java.util.List;
import java.util.Map;

/**
 * 访问请求service层
 */
public interface ControlService {
    /**
     * 获得请求的所有数据
     * @return
     */
    public List<Control> getControlAll();


    /**
     * 获得所有的请求名称
     * @return
     */
    public List<String> getRequestAimAll();

    /**
     * 根据id获取请求信息
     * @param id
     * @return Map
     */
    public Map getControlMapById(Integer id);

    /**
     * 根据id获取请求信息
     * @param id
     * @return Control
     */
    public Control getControlById(Integer id);
}
