package Classes;
import Intarfaces.*;

import java.util.Scanner;
import java.util.Date;

public class Reservation extends Departure{

    private static int noseat;
    private static int[] seats = new int[20];
    public Reservation(int s){
        this.noseat = s;
    }
    public Reservation() {

        // Create an array of 12 seats, 6 window and 6 aisle.
        System.out.println("\n\n");
        // Lets start by setting all seats equal to 0 ( Empty)
        for (int i = 0; i < 20; i++) {
            seats[i] = 0;
        }
        setDepartureInfo();
        System.out.println("\n");
        // Setup our scanner and default the choice to window.
        final Scanner s = new Scanner(System.in);
        int choice = 1;
        // Ask user for a window or an aisle seat and store their choice.
        
        // While choice is not 0, execute our booking.
        //while(choice != 0) 
        for(int i=1; i<= noseat ; i++){
            System.out.println("For passenger "+i+" :");
            System.out.print("Please enter 1 for window or 2 for aisle seat: ");
        choice = s.nextInt();
            int seatnumber = 0;
            // If they chose a window seat, attempt to book it.
            if (choice == 1) {
                seatnumber = bookWindow();
                // No window seats available, try booking an aisle seat for them instead.
                if (seatnumber == -1) {
                    seatnumber = bookAisle();
                    if (seatnumber != -1) {
                        System.out.println("Sorry, we were not able to book a window seat. But do have an aisle seat.");
                        printBoardingPass(seatnumber);
                    }
                } else {
                    // Booking a window seat was successful.
                    System.out.println("You are in luck, we have a window seat available!");
                    printBoardingPass(seatnumber);
                }
            }
            else if (choice == 2) {
                // If they chose booking an isle, check to see if it is available.
                seatnumber = bookAisle();
                // If not available, see if we have window seats available.
                if (seatnumber == -1) {
                    seatnumber = bookWindow();
                    if (seatnumber != -1) {
                        System.out.println("Sorry, we were not able to book an aisle seat. But do have a window seat.");
                        printBoardingPass(seatnumber);
                    }
                }
                else {
                    // Booking an aisle seat was successful.
                    System.out.println("You are in luck, we have an aisle seat available!");
                    printBoardingPass(seatnumber);
                }
            }
            else {
                // Print an error message if they did not choose 1, 2, or 0 for their choice.
                System.out.println("Invalid choice made. Please try again!");
                choice = 0;
            }
            // No window or aisle seats were available.
            if (seatnumber == -1) {
                System.out.println("We are sorry, there are no window or aisle seats available.");
                System.out.println();
            }
            // Reprompt for a choice
            // System.out.print("Please enter 1 for window, 2 for aisle: ");
            // choice = s.nextInt();
        }
    }
    // This function checks for window seats and returns seat number or -1 if full.

    private static int bookWindow() {
        for (int i = 0; i < 10; i++) {
            if (seats[i] == 0) {
                seats[i] = 1;
                return i + 1;
            }
        }
        return -1;
    }
    // This function checks to see if aisle seats were available, -1 if full.
    private static int bookAisle() {
        for (int i = 10; i < 20; i++) {
            if (seats[i] == 0) {
                seats[i] = 1;
                return i + 1;
            }
        }
        return -1;
    }
    
    // This simply prints out a nice little boarding pass message with their seat
    // number and date of issue.
    private void printBoardingPass(final int seatnumber) {
        final Date timenow = new Date();
        System.out.println();
        System.out.println("Issue Date: " + timenow.toString());
        String dash= ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(dash);
        System.out.println("              Boarding pass for seat number: " + seatnumber);
        System.out.println(dash);
        getDepartureInfo();
        System.out.println("#######This ticket is non-refundable and non-transferable######");
        System.out.println("******Please be courteous, do not smoke. Enjoy your trip.******");
        System.out.println(dash);
        System.out.println();
    }
    //for polymorphism->
    public void poly(){
        System.out.println("                Good Luck");
    }
}