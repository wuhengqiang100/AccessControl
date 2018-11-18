package com.java1234.service.impl;

import com.java1234.dao.UserDao;
import com.java1234.entity.Control;
import com.java1234.entity.User;
import com.java1234.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    public User getUserByLoginUser(Control control) {
        return userDao.getUserByLoginUser(control);
    }
}
