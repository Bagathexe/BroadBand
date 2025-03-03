package com.model;

import java.time.LocalDateTime;

public class Subscription {
    private int subscriptionId;
    private int userId;
    private int planId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String status;
    private String subscriptionType;

    // public Subscription(User user,Plan plan){
    //     this.userId=user;
    //     this.plan=plan;
    //     StartDate=(LocalDate.now().toString());
    //      EndDate=(LocalDate.now().plusMonths(3).toString());
    // }

    public int getSubscriptionId() { return subscriptionId; }
    public void setSubscriptionId(int subscriptionId) { this.subscriptionId = subscriptionId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getPlanId() { return planId; }
    public void setPlanId(int planId) { this.planId = planId; }

    public LocalDateTime getStartDate() { return startDate; }
    public void setStartDate(LocalDateTime startDate) { this.startDate = startDate; }

    public LocalDateTime getEndDate() { return endDate; }
    public void setEndDate(LocalDateTime endDate) { this.endDate = endDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getSubscriptionType() { return subscriptionType; }
    public void setSubscriptionType(String subscriptionType) { this.subscriptionType = subscriptionType; }
}