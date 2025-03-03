package com.Dao;

import com.model.Feedback;
import com.DataBaseConnection;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

public class FeedbackDAO {
    
    public boolean addFeedback(Feedback feedback) {
        String query = "INSERT INTO Feedback (UserID, Rating, Comments) VALUES (?, ?, ?)";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
                    
            stmt.setInt(1, feedback.getUserId());
            stmt.setInt(2, feedback.getRating());
            stmt.setString(3, feedback.getComments());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public List<Feedback> getFeedBack(){
        List<Feedback> feedbacks=new ArrayList<>();
        String query="select * from feedback";
        try(Connection conn=DataBaseConnection.getConnection();
            PreparedStatement stmt=conn.prepareStatement(query))
        {       ResultSet rs=stmt.executeQuery();

            while(rs.next()){
                Feedback feedback=new Feedback();
                feedback.setFeedbackId(rs.getInt("FeedbackID"));
                feedback.setUserId(rs.getInt("UserId"));
                feedback.setComments(rs.getString("comments"));
                feedback.setFeedbackDate(rs.getTimestamp("FeedbackDate")!=null? rs.getTimestamp("FeedbackDate").toLocalDateTime():null);
                feedback.setRating(rs.getInt("Rating"));
                
                feedbacks.add(feedback);
                
            }
            return feedbacks;
        }
        catch(SQLException e){
            System.out.println(e);
            System.out.println("Problem in getting feedbacks");
        }   
        return feedbacks;
    }
}