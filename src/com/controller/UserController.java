package com.controller;
import com.Dao.*;
import com.model.*;
public class UserController {
    private UserDao userDao;

    public UserController(){
        this.userDao=new UserDao();

    }
    public boolean signUp(String name,String email,String password,String phonenumber,String billingAddress){
        User user=new User();
        user.setUserName(name);
        user.setEmail(email);
        user.setPassword(password); 
        user.setPhoneNumber(phonenumber);
        user.setBillingAddress(billingAddress);

        return userDao.createUser(user);
    }
    public  User login(String email,String password){
        User user=userDao.getUserByEmail(email);

        if(user!=null && user.getPassword().equals(password)){
             
            return user;
        }
        return null;
    }

    
}
