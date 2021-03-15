package com.example.JavaEETest.db;

import com.example.JavaEETest.logic.User;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private static Users users;
    private List<User> u;

    private Users(){
        u = new ArrayList<>();
    }
    public static Users getUsers(){
        if(users==null){
            return new Users();
        }
        return users;
    }

    public void addUser(User user){
        u.add(user);
    }

    public List<User> getU() {
        return u;
    }
}
