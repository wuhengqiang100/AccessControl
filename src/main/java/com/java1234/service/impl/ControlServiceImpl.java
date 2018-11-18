package com.java1234.service.impl;


import com.java1234.dao.ControlDao;
import com.java1234.entity.Control;
import com.java1234.service.ControlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("ControlService")
public class ControlServiceImpl implements ControlService {

    @Resource
    private ControlDao controlDao;

    public List<Control> getControlAll() {
        return controlDao.getControlAll();
    }

    public List<String> getRequestAimAll() {
        return controlDao.getRequestAimAll();
    }

    public Map getControlMapById(Integer id) {
        return controlDao.getControlMapById(id);
    }

    public Control getControlById(Integer id) {
        return controlDao.getControlById(id);
    }

}
