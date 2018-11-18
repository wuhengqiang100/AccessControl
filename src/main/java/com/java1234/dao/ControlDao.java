package com.java1234.dao;

import com.java1234.entity.Control;
import com.java1234.entity.User;

import java.util.List;
import java.util.Map;

/**
 * 访问控制Dao层
 */
public interface ControlDao {
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
    /**
     * 登录的表单实体查,令牌实体
     * @param user
     * @return
     */
    public Control getControlByLoginUser(User user);

}
