package model;

public class Billing {
    private String BillCycle;
    private double usageCharge;
    private String paymentHistory;
    private int planDuration;
    public Billing(String BillCycle,double usageCharge,String paymentHistory,int planDuration){
        this.BillCycle=BillCycle;
        this.usageCharge=usageCharge;
        this.paymentHistory=paymentHistory;
        this.planDuration=planDuration;
    }
    public int getPlanDuration(){
        return  planDuration;
    }
    public void setBillCycle(String BillCylce){
        this.BillCycle=BillCylce;
    }
    public void setUsageCharge(double charge){
        this.usageCharge=charge;
    }
    public void SetPaymentHistory(String history){
        paymentHistory= history;
    }
    public String getBillCycle(){
        return BillCycle;
    }
    public double getUsageCharge(){
        return usageCharge;
    }
    public String getPaymentHistory(){
        return paymentHistory;
    }
    
}
