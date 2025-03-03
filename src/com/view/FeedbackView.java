package com.view;

import java.util.List;
import java.util.Scanner;

import com.controller.FeedbackController;
import com.model.Feedback;

public class FeedbackView {

    FeedbackController feedbackController=new FeedbackController();
public void submitFeedback(int userId) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your rating (1-5):");
    int rating = scanner.nextInt();
    scanner.nextLine(); 

    System.out.println("Enter your comments:");
    String comments = scanner.nextLine();

    boolean isSuccess = feedbackController.submitFeedback(userId, rating, comments);
    if (isSuccess) {
        System.out.println("Thank you for your feedback!");
    } else {
        System.out.println("Failed to submit feedback. Please try again.");
    }
}
    public void giveFeedBack(int UserId){
        @SuppressWarnings("resource")
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Feedback....");
        String comment=scanner.nextLine();
        System.out.println("Give rating out of 5");
        int rating=scanner.nextInt();
        Feedback feedback = new Feedback();
        scanner.nextLine();
        feedback.setComments(comment);
        feedback.setRating(rating);
        feedback.setUserId(UserId);
        feedbackController.submitFeedback(UserId, rating, comment);

    }

    public void showFeedBacks(int loggedInUserId){
        
        List<Feedback> feedbacks=feedbackController.getFeedBacks();
        System.out.println("X------------------X");
        for(Feedback fb:feedbacks){
            System.out.println("Comment :"+fb.getComments());
            System.out.println("Rating :"+fb.getRating());
        }
        System.out.println("X------------------X");
    }
}
