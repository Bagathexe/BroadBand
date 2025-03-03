package com.view;
import com.controller.UserController;
import com.model.User;



import java.util.Scanner;

public class UserView {
    private UserController userController;
    
    public UserView(){
        userController= new UserController();
        
    }

        public void signUp(){
            @SuppressWarnings("resource")
            Scanner scanner=new Scanner(System.in);

            System.out.println("Enter your name");
            String name=scanner.nextLine();

            System.out.println("Enter your email");
            String email=scanner.nextLine();

            System.out.println("Enter your password");
            String password=scanner.nextLine();

            System.out.println("Enter your Phone number");
            String phone=scanner.nextLine();

            
            System.out.println("Enter your billing address");
            String address=scanner.nextLine();

            boolean isValid= userController.signUp(name,email,password,phone,address);

            if(isValid){
                System.out.println("Sign-Up Successfully");
            }
            else{
                System.out.println("Sign-Up failed. Please try again.");
            }


        }

        
        public int login(){
            @SuppressWarnings("resource")
            Scanner scanner=new Scanner(System.in);

            System.out.println("Enter your Email");
            String email=scanner.nextLine();
            
            System.out.println("Enter your Password");
            String password=scanner.nextLine();

            User user=userController.login(email,password);

            if(user!=null){
                    System.out.println("Login Successfully");
                    return 1;
                }
                else{
                System.out.println("Login Failed. Invalid email or password");
                
            }
            
            return -1;
        }

}
