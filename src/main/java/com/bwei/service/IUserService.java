package com.bwei.service;

import com.bwei.pojo.User;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author songzhen
 * @create 2017-09-14 19:45
 */
public interface IUserService {
    public List<User> findUser(String name, String password);
    public int addUser();
}
