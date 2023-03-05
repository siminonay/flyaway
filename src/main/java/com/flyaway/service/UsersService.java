package com.flyaway.service;

import com.flyaway.dao.UsersDao;
import com.flyaway.entity.Users;

public class UsersService {

    UsersDao ud  = new UsersDao();

    public String storeUsers(Users users) {
        if(ud.storeUsers(users)>0) {
            return "Users stored successfully!";
        } else {
            return "Users store session failed!";
        }
    }

    public Boolean checkUser(Users user){
        return !ud.getUser(user).isEmpty();
    }

    public void updateUser(Users user){
        ud.changePassword(user);
    }


}
