import model.*;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class View {
    private Scanner scanner=new Scanner(System.in);

    public void showMenu(){
        System.out.println("1. Register");
        System.out.println("2. ShowPlans");
        System.out.println("3. Subscribe to a Plan");
        System.out.println("4. View Billing Details");
        System.out.println("5. Provide Feedback");
        System.out.println("6. View Feedback");
        System.out.println("7. EXIT");

    }

    public  int getUserChoice(){
        try{
        System.out.println("Enter your choice");}
        catch (InputMismatchException e){
    System.out.println("Please enter only Number!");
    
}
        return scanner.nextInt();
    }
    public User getUserDetails(){
        scanner.nextLine();
        System.out.println("Enter Username: ");
        String username=scanner.nextLine();
        System.out.println("Enter password: ");
        String password=scanner.nextLine();
        System.out.println("Enter email: ");
        String email=scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String number=scanner.nextLine();
        return new User(username,password,email,number);
    }
    public void ShowPlans(Plan plans[]){
        for(Plan plan:plans){
            System.out.println("Plan: "+plan.getPlanName()+", Speed: "+plan.getSpeed()+", Price: "+plan.getPrice()+", Limit: "+plan.getLimit());
        }
    }
    public void displayPlan(){
        System.out.println("Choose a plan (1 ,2 , etc..): ");
        // return scanner.nextInt();  
    }
    public  int getPlanChoice(){
        // System.out.println("Enter your Plan Choice");
        return scanner.nextInt();
    }
    public  int getPlanDuration(){
         System.out.println("Enter Plan Duration!(in months)");
        return scanner.nextInt();
    }

    public  void ShowBillingDetails(Billing billing){
        System.out.println("Billing Cycle: "+billing.getBillCycle());
        System.out.println("Usage Charge ($): "+billing.getUsageCharge());
        System.out.println("Payment History: "+billing.getPaymentHistory());
        System.out.println("Plan Duration: "+billing.getPlanDuration());
    }
    public Feedback getFeedback() {
        scanner.nextLine(); 
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Rate the service (1-5): ");
        float rating = scanner.nextFloat();
        scanner.nextLine(); 
        System.out.print("Enter your feedback: ");
        String comment = scanner.nextLine();
        return new Feedback(username, rating, comment);
    }

    
    public void showFeedback(List<Feedback> feedbackList) {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
            return;
        }
        System.out.println("<<== Feedback ==>>");
        for (Feedback feedback : feedbackList) {
            System.out.println("User: " + feedback.getUsername());
            // if(feedback.getRating()%1.00 == 0)
            System.out.println("Rating: " + feedback.getRating() + "/5");
            System.out.println("Comment: " + feedback.getComment());
            System.out.println("-X-X-X-X-X-X-X-");
        }
    }
}
