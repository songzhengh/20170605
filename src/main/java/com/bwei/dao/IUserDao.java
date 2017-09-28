package com.bwei.dao;

import com.bwei.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author songzhen
 * @create 2017-09-14 19:43
 */
public interface IUserDao {
    public List<User> findUser(String name, String password);
    public int addUser();
}
