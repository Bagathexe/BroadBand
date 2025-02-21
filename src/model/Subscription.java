package model;
import java.time.LocalDate;
public class Subscription {
    private User user;
    private Plan plan;
    private String StartDate;
    private String EndDate;

    public Subscription(User user,Plan plan){
        this.user=user;
        this.plan=plan;
        StartDate=(LocalDate.now().toString());
        EndDate=(LocalDate.now().plusMonths(3).toString());
    }
    public void setUser(User user){
        this.user=user;
        
    }
    public String getStartDate(){
        return StartDate;
    }
    public void setStartDate(String date){
        StartDate=date;
    }
    public String getEndDate(){
        return EndDate;
    }
    public void setEndDate(String date){
        EndDate=date;
    }
    public void setPlan(Plan plan){
        this.plan=plan;
    }
    public User getUser(){
        return user;
    }
    public Plan getPlan(){
        return plan;
    }

}
