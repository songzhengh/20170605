package com.bwei.service.Impl;

import com.bwei.dao.IUserDao;
import com.bwei.pojo.User;
import com.bwei.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author songzhen
 * @create 2017-09-14 19:45
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findUser(String name, String password) {
        return userDao.findUser(name,password);
    }

    @Override
    public int addUser() {
        int i = userDao.addUser();
        return i;
    }
}
