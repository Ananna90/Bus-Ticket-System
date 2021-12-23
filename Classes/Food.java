package Classes;
import Intarfaces.*;
import java.util.Scanner;

public class Food {
    public double subTotal;
    public static double sum=0;
    public double runningTotal;
    private double itemPrice;
    boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    public static double j = 0.0;

    public Food() {
        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);
        double runningTotal = 0;
        System.out.println("\n\n----------------WELCOME TO FOOD COURT SECTION----------------");
        while (ordering) {
            //menu();
            System.out.println("1. Burger (350 tk) \n2. Fries (100tk)\n3. Soda (80tk) \n4. Done");
            System.out.print("Enter your option:");
            menuOption = input.nextInt();
            ItemPrice IP = new ItemPrice();
            switch (menuOption) {
                case 1:
                    foodItem = 1;
                    runningTotal += IP.itemPrice(foodItem, input);
                    break;
                case 2:
                    foodItem = 2;
                    runningTotal += IP.itemPrice(foodItem, input);
                    break;
                case 3:
                    foodItem = 3;
                    runningTotal += IP.itemPrice(foodItem, input);
                    break;
                case 4:
                    done(runningTotal);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public void menu() {
        System.out.println("Welcome \n1. Burger (350TK) \n2. Fries (100TK)\n3. Soda (80TK) \n4. Done");
    }


    public static double subtotal(final double quantity, final double itemPrice) {
        final double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: " + subTotal + "tk");
        j = subTotal;
        sum= sum+ subTotal;
        return subTotal;
    }

    public  void done(final double runningTotal) {
        ordering = false;
        System.out.println("Enjoy your meal");
    }

    public double quantity(double itemPrice) {
        System.out.println("Enter quantity");
        final double quantity = input.nextDouble();
        subtotal(quantity, itemPrice);
        System.out.println("quantity=" + quantity);
        return quantity;
    }
}
