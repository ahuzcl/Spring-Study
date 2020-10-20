package com.cunliang.service;

import com.cunliang.dao.UserDao;
import com.cunliang.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();

    }
}
