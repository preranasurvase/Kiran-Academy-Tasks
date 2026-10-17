import java.util.Random;
import java.util.Scanner ;
public class CAB_BOOKING_CHATBOT {
    public static void main(String [] args){
           Scanner sc = new Scanner(System.in) ;
           Random random = new Random();

           int choice ;
           int cabChoice ;
            while(true){
            System.out.println("Wel-Come to chatbot") ;
            System.out.println("1.Book Ride") ;
            System.out.println("2.Exit") ;

            System.out.println("Enter the choice = ") ;
            choice = sc.nextInt() ;

            if(choice == 1){
            
                System.out.println("Choose Cab Type ") ;
                System.out.println("1.Auto Rs- 12km") ;
                System.out.println("2.Sedan Rs - 18km") ;
                System.out.println("3.SUV Rs - 25km") ;

                System.out.println("Enter your Cab Type ") ;
                cabChoice = sc.nextInt() ;
                     String cabType =" ";
                     int rate = 0;
                    
                                        if (cabChoice == 1) {
                        cabType = "Auto";
                        rate = 12;
                    }
                    else if (cabChoice == 2) {
                        cabType = "Sedan";
                        rate = 18;
                    }
                    else if (cabChoice == 3) {
                        cabType = "SUV";
                        rate = 25;
                    }
                    else {
                        System.out.println("Invalid cab choice!");
                        continue;
                    }

                System.out.println("\nSelect Route");
                System.out.println("1. Pune Station to Shivajinagar - 5 km");
                System.out.println("2. Swargate to Kothrud - 8 km");
                System.out.println("3. Hinjawadi to Wakad - 10 km");
                System.out.print("Enter route choice: ");
               
                int routeChoice = sc.nextInt() ;
                String source ;
                String destination ;
                int distance ;

                if (routeChoice == 1) {
                    source = "Pune Station";
                    destination = "Shivajinagar";
                    distance = 5;
                }
                else if (routeChoice == 2) {
                    source = "Swargate";
                    destination = "Kothrud";
                    distance = 8;
                }
                else if (routeChoice == 3) {
                    source = "Hinjawadi";
                    destination = "Wakad";
                    distance = 10;
                }
                else {
                    System.out.println("Invalid route choice!");
                    continue;
                }
            int fare = rate * distance;

                System.out.println("\n===== RIDE DETAILS =====");
                System.out.println("Cab Type: " + cabType);
                System.out.println("Source: " + source);
                System.out.println("Destination: " + destination);
                System.out.println("Distance: " + distance + " km");
                System.out.println("Rate: Rs. " + rate + "/km");
                System.out.println("Total Fare: Rs. " + fare);

                // Step 4: Confirm or cancel before sharing OTP
                System.out.println("\n1. Confirm & Share OTP");
                System.out.println("2. Cancel Ride");
                System.out.print("Enter your choice: ");

                int confirmation = sc.nextInt();

                if (confirmation == 2) {
                    System.out.println("Ride cancelled successfully.");
                    System.out.println("No OTP has been shared.");
                }
                else if (confirmation == 1) {

                    // Step 5: Generate a four-digit OTP
                    int otp = 1000 + random.nextInt(9000);

                    System.out.println("\nYour OTP is: " + otp);
                    System.out.println("OTP shared with the user.");
                    System.out.println("Booking confirmed successfully!");
                    System.out.println(
                        "IMPORTANT: Cancellation is NOT allowed after OTP sharing."
                    );
                }
                else {
                    System.out.println("Invalid confirmation choice.");
                    System.out.println("Booking not confirmed. No OTP shared.");
                }
            }
            if(choice == 2){
                System.out.println("Exist") ;
             }
            else{
                System.out.println("The choice is Invalid") ;
            }
        } 

          
    }
}
