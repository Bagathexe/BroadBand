package com.controller;

import com.Dao.FeedbackDAO;
import com.model.Feedback;
import java.util.List;
public class FeedbackController {
    private FeedbackDAO feedbackDAO;

    public FeedbackController() {
        this.feedbackDAO = new FeedbackDAO();
    }

    
    public boolean submitFeedback(int userId, int rating, String comments) {
        Feedback feedback = new Feedback();
        feedback.setUserId(userId);
        feedback.setRating(rating);
        feedback.setComments(comments);

        return feedbackDAO.addFeedback(feedback);
    }
    public List<Feedback> getFeedBacks(){

        
        return feedbackDAO.getFeedBack();
    }
}