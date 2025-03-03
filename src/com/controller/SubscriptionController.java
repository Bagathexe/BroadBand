package com.controller;

import com.Dao.SubscriptionDao;
import com.model.Subscription;

import java.util.List;

public class SubscriptionController {
    private SubscriptionDao subscriptionDAO;

    public SubscriptionController() {
        this.subscriptionDAO = new SubscriptionDao();
    }

    public List<Subscription> getSubscriptionsByUserId(int userId) {
        return subscriptionDAO.getSubscriptionsByUserId(userId);
    }
    public void setSubscriptionByUserId(int userId,int planchoice){

        subscriptionDAO.setPlan(userId,planchoice);
    }
}