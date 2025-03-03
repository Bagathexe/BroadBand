package com;

import com.view.*;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        UserView userView = new UserView();
        SubscriptionView subscriptionView = new SubscriptionView();
        FeedbackView feedbackView = new FeedbackView();
        PlanView planView = new PlanView();
        BillingView billingView = new BillingView();



        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int loggedInUserId = -1; 

        while (true) {
            if (loggedInUserId == -1) {
                
                System.out.println("1. Login");
                System.out.println("2. Sign Up");
                System.out.println("3. Exit");
                System.out.println("Enter your choice:");

                int choice=-1;
                choice=scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        loggedInUserId = userView.login();
                        break;
                    case 2:
                        userView.signUp();
                        break;
                    case 3:

                        System.out.println("Exiting");
                        for(int i=0;i<10;i++){
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.print(".");
                        }System.out.println();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                
                System.out.println("1. View Plans");
                System.out.println("2. View Subscriptions");
                System.out.println("3. Choose Plan");
                System.out.println("4. Give Feedback");
                System.out.println("5. Show Bills");
                System.out.println("6. Show Feedbacks");
                System.out.println("7. Logout");
                System.out.println("Enter your choice:");
                int choice=-1;
                
                choice = scanner.nextInt();
                 scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        planView.displayPlans();
                        break;
                    case 2:
                        subscriptionView.displaySubscriptions(loggedInUserId);
                        break;
                    case 3:
                        subscriptionView.selectPlan(loggedInUserId);
                        break;
                    case 4:
                        feedbackView.giveFeedBack(loggedInUserId);
                        break;
                    case 5:
                            billingView.showBilling(loggedInUserId);
                            break;
                    case 6:
                        feedbackView.showFeedBacks(loggedInUserId);
                        break;
                    case 7:
                        loggedInUserId = -1; 
                        System.out.println("Logged out successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}