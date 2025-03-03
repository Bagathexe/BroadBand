package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Subscription;
import com.controller.SubscriptionController;
import com.controller.PlanController;
import com.view.PlanView;
@SuppressWarnings("unused")
public class SubscriptionView {

    SubscriptionController subscriptionController=new SubscriptionController();
    PlanController planController=new PlanController();
    PlanView planView =new PlanView();

public void displaySubscriptions(int userId) {
    List<Subscription> subscriptions = subscriptionController.getSubscriptionsByUserId(userId);
    for (Subscription subscription : subscriptions) {
        System.out.println("-----------------------------");
        System.out.println("Subscription ID: " + subscription.getSubscriptionId());
        System.out.println("Plan ID: " + subscription.getPlanId());
        System.out.println("Start Date: " + subscription.getStartDate());
        System.out.println("End Date: " + subscription.getEndDate());
        System.out.println("Status: " + subscription.getStatus());
        System.out.println("Type: " + subscription.getSubscriptionType());
        System.out.println("-----------------------------");
    }
}
public void selectPlan(int userId){
    System.out.println("Available Plans...");
    planView.displayPlans();
    @SuppressWarnings("resource")
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a plan choice.. ;)");
    int choice =scanner.nextInt();
    scanner.nextLine();

    subscriptionController.setSubscriptionByUserId(userId,choice);
}
}
