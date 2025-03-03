package com.view;

import java.util.List;

import com.controller.PlanController;
import com.model.Plan;

public class PlanView {
    PlanController planController=new PlanController();

    
    public void displayPlans() {
    List<Plan> plans = planController.getAllPlans();
    for (Plan plan : plans) {
        System.out.println("Plan ID: " + plan.getPlanId());
        System.out.println("Plan Name: " + plan.getPlanName());
        System.out.println("Speed: " + plan.getSpeed());
        System.out.println("Data Limit: " + plan.getLimit());
        System.out.println("Price: " + plan.getPrice());
        System.out.println("Contract Duration: " + plan.getContractDuration());
        System.out.println("-----------------------------");
    }
}
}