package com.example.demojishi.service;

import com.example.demojishi.bean.User;
import com.example.demojishi.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserDao userDao;
    public int reg(String username,String userpwd){
       int i= userDao.reg(username,userpwd);
        if (i>0){
            return i;

        }
        return 0;
    }
    public User login(String username,String userpwd){
        User user=userDao.login(username,userpwd);
        if (user.getUsername().equals(username)&&user.getUserpwd().equals(userpwd))
        {
            return user;
        }
        return null;
    }

}
