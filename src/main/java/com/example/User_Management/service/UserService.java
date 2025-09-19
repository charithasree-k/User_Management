package com.example.User_Management.service;

import com.example.User_Management.dao.UserDao;
import com.example.User_Management.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void createUser(User user) {
        userDao.createUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}
