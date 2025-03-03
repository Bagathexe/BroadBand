package com.view;

import java.util.List;

import com.controller.BillingController;
import com.model.Billing;

public class BillingView {

    BillingController billingController=new BillingController();

    public void showBilling(int userId) {
    List<Billing> billingList = billingController.getBillingDetails(userId);
    if (billingList.isEmpty()) {
        System.out.println("No billing records found.");
    } else {
        for (Billing billing : billingList) {
            System.out.println("-----------------------------");
            System.out.println("Billing ID: " + billing.getBillingId());
            System.out.println("Billing Cycle: " + billing.getBillingCycle());
            System.out.println("Usage Charges: " + billing.getUsageCharges());
            System.out.println("Total Amount: " + billing.getTotalAmount());
            System.out.println("Payment Status: " + billing.getPaymentStatus());
            System.out.println("Payment Method: " + billing.getPaymentMethod());
            System.out.println("Payment Date: " + billing.getPaymentDate());
            System.out.println("-----------------------------");
        }
    }
}
}