package com.wei.service;

import com.wei.dao.UserDao;
import com.wei.dao.UserDaoImpl;
import com.wei.dao.UserDaoMySQLImpl;

public class UserServiceImpl implements UserService {

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
