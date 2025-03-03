package com.Dao;

import com.model.Subscription;
import com.DataBaseConnection;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class SubscriptionDao {

    public void setPlan(int userId,int planId){
        String query="update subscription set planid= ? where userId= ?";
        try(Connection conn=DataBaseConnection.getConnection();
        PreparedStatement stmt=conn.prepareStatement(query)){
        stmt.setInt(1,planId);
        stmt.setInt(2,userId);
        boolean flag=stmt.executeUpdate()>0;
        if(flag){
            System.out.println("Plan Changed Successfully");
        }
        else{
            System.out.println("Plan couldn't be changed!");
        }
    }
        catch(SQLException e){
            System.out.println(e);
        }
        
        }
    public List<Subscription> getSubscriptionsByUserId(int userId) {
        List<Subscription> subscriptions = new ArrayList<>();
        String query = "SELECT * FROM Subscription WHERE UserID = ?";

        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Subscription subscription = new Subscription();
                subscription.setSubscriptionId(rs.getInt("SubscriptionID"));
                subscription.setUserId(rs.getInt("UserID"));
                subscription.setPlanId(rs.getInt("PlanID"));
                subscription.setStartDate(rs.getTimestamp("StartDate").toLocalDateTime());
                subscription.setEndDate(rs.getTimestamp("EndDate") != null ? rs.getTimestamp("EndDate").toLocalDateTime() : null);
                subscription.setStatus(rs.getString("Status"));
                subscription.setSubscriptionType(rs.getString("SubscriptionType"));

                subscriptions.add(subscription);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return subscriptions;
    }
}