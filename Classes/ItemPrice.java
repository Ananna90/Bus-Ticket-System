package Classes;
import Intarfaces.*;
import java.util.Scanner;

public class ItemPrice {
    public double itmprice = 0;

    public double itemPrice(final int foodItem, Scanner input) {
        if (foodItem == 1) {
            System.out.println("You've ordered a burger");
            itmprice = 350;
        }
        if (foodItem == 2) {
            System.out.println("You've ordered fries");
            itmprice = 100;
        }
        if (foodItem == 3) {
            System.out.println("You've ordered a soda");
            itmprice = 80;
        }
        Quantity qlt = new Quantity();
        return qlt.quantity(itmprice, input);
    }
}