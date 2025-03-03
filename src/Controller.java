// import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import model.*;
public class Controller {
    private View view;
    private List<User> user=new ArrayList<>();
    private Plan[] plans;
    private Subscription subscription;
    private Billing billing;
    private List<Feedback> feedbacksList =new ArrayList<>();

    public Controller(View view){
        this.view=view;
        plans = new Plan[]{
            new Plan("Basic",40,499,1000),
            new Plan("Advance",100,899,5000),
            new Plan("Premimum",250,1499,100000)
        };

        billing =new Billing("Monthly",0,"UnPaid",0);

    }
    public void start(){
        while(true){
            view.showMenu();
            int choice =view.getUserChoice();
            
            switch(choice){
                
                case 1:
                user.add( view.getUserDetails());
                System.out.println("User Registrated Successfully");
                break;
                
                case 2:
                    view.ShowPlans(plans);
                    break;
                    
                case 3:
                    
                    if(user == null){
                        System.out.println("Please Register first!");
                        break;
                        }
                    view.displayPlan();
                    int planChoice=view.getPlanChoice();
                    

                    if(planChoice < 1 || planChoice > plans.length) {
                        System.out.println("Invalid plan choice. Please select a valid plan.");
                        break;}
                    
                     else {
                        Plan selectedPlan = plans[planChoice - 1];
                        subscription = new Subscription(user.get(0), selectedPlan);
                        billing = new Billing("Monthly", selectedPlan.getPrice(), "Paid",3);
                        System.out.println("Subscribed to " + selectedPlan.getPlanName() + " plan!");
                        System.out.println();
                    }
                    break;

                case 4:
                if(subscription == null){
                    System.out.println("No Subscription Found!");
                    break;
                }
                view.ShowBillingDetails(billing);
                break;
                
                case 5:
                    
                    Feedback feedback = view.getFeedback();
                    feedbacksList.add(feedback);
                    System.out.println("Thank you for your feedback!");
                    break;
                    
                case 6:
                    view.showFeedback(feedbacksList);
                    break;

                case 7:

                    System.out.println("Exiting Application");
                    for(int i=0;i<19;i++){
                        for(int j=0;j<10000000*5;j++){

                        }
                        
                        System.out.print(".");
                    }
                    return;
                    
                    default:
                System.out.println("Please enter Valid Choice..!");
            }


        }
    }

}
