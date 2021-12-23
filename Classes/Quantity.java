package Classes;
import Intarfaces.*;
import java.util.Scanner;

public class Quantity {

    public double quantity(double itemPrice, Scanner input) {
        System.out.print("Enter quantity : ");
        final double quantity = input.nextDouble();
        Food.subtotal(quantity, itemPrice);
        System.out.println("quantity = " + quantity);
        return quantity;
    }
}