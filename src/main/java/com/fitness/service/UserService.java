package com.fitness.service;

import com.fitness.dao.UserDao;
import com.fitness.model.User;
import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDao();

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
