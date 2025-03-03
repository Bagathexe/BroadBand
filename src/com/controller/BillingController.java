package com.controller;

import com.Dao.BillingDao;
import com.model.Billing;

import java.util.List;

public class BillingController {
    private BillingDao billingDAO;

    public BillingController() {
        this.billingDAO = new BillingDao();
    }
    
    public List<Billing> getBillingDetails(int userId) {
        return billingDAO.getBillingByUserId(userId);
    }
}