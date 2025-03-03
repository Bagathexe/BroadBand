package com.model;

public class User {
        private int UserID;
        private String username;
        private String password;
        private String email;
        private String phone;
        private String BillingAddress;
        private String RegistrationDate;  
        
        public User(){};

        public User(String username,String password,String email,String phone,String BillingAddress,String RegistrationDate){
            this.username=username;
            this.password=password;
            this.email=email;
            this.phone=phone;
            this.BillingAddress=BillingAddress;
            this. RegistrationDate=RegistrationDate;
        }
        public int getUserId(){
            return UserID;
        }
        public void setUserID(int id){
            UserID=id;
        }
        public void setUserName(String name){
            username=name;
        }
        public void setRegistrationDate(String RegistrationDate){
            this. RegistrationDate=RegistrationDate;
        }
        public void setBillingAddress(String BillingAddress){
            this. BillingAddress=BillingAddress;
        }
        public void setPassword(String password){
            this.password=password;
        }
        
        public void setEmail(String mail){
            email=mail;
        }
        public void setPhoneNumber(String phone){
           this.phone=phone;
        }

        public String getRegistrationDate(){
            return RegistrationDate;
        }
        public String getBillingAddress(){
            return BillingAddress;
        }
        public String getUserName(){
            return username;
        }
        public String getPassword(){
            return password;
        }
        public String getEmail(){
            return email;
        }
        public String getPhoneNumber(){
            return  phone;
        }
}   
