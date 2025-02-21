package model;
public class Plan {

    private String planName;
    private int speed;
    private double price;
    private int limit;

    public Plan(String planName,int speed,double price,int limit){
        this.planName=planName;
        this.speed=speed;
        this.price=price;
        this.limit=limit;
    }

    public void setPlanName(String name){
        planName=name;
    }
    public void setSpeed(int speed){    
        this.speed=speed;
    }
    public void setLimit(int limit){
        this.limit=limit;
    }
    public void setLimit(double price){
        this.price=price;
    }
    public String getPlanName(){
        return planName;
    }
    public int getSpeed(){
        return speed;
    }
    public double getPrice(){
        return price;
    }
    public int getLimit(){
        return limit;
    }
}
