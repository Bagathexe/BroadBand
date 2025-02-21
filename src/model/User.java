package model;

public class User {
        private String username;
        private String password;
        private String email;
        private String phone;
        
        public User(String username,String password,String email,String phone){
            this.username=username;
            this.password=password;
            this.email=email;
            this.phone=phone;
        }
        public void setUserName(String name){
            username=name;
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
