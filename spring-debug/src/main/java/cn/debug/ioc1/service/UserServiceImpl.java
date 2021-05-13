package cn.debug.ioc1.service;

import cn.debug.ioc1.dao.UserDao;


public class UserServiceImpl implements UserService{


    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}
