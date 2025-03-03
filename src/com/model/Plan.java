package com.model;
public class Plan {

    private int planId;
    private String planName;
    private String speed;
    private double price;
    private String limit;
    private String ContractDuration;

    public Plan(){};
    public Plan(String planName,String speed,double price,String limit,String ContractDuration){
        this.planName=planName;
        this.speed=speed;
        this.price=price;
        this.limit=limit;
        this.ContractDuration=ContractDuration;
    }
    
    public int getPlanId() { return planId; }
    public void setPlanId(int planId) { this.planId = planId; }

    public String getContractDuration(){
        return ContractDuration;
    }
    public void setContractDuration(String ContractDuration){
        this.ContractDuration=ContractDuration;
    }
    public void setPlanName(String name){
        planName=name;
    }
    public void setSpeed(String speed){   
        this.speed=speed;
    }
    public void setLimit(String limit){
        this.limit=limit;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getPlanName(){
        return planName;
    }
    public String getSpeed(){
        return speed;
    }
    public double getPrice(){
        return price;
    }
    public String getLimit(){
        return limit;
    }
}
