package com.union.unioninfo.controllers;

import com.union.unioninfo.dao.UserDao;
import com.union.unioninfo.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class InfoController {
    private static Logger logger = LoggerFactory.getLogger(InfoController.class);
    @Resource
    private UserDao userDao;
    @RequestMapping("getCarInfo")
    public Object getCarInfo(){
        logger.info("user request getCarInfo，uuid={}",1234);
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("chenpengfei");
        userEntity.setPassword("1234567");
        userDao.insert(userEntity);
        return userDao.selectByPrimaryKey(1);
    }
}
