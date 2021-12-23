package Classes;
import Intarfaces.*;


import java.util.Scanner;

public class Departure {
  public String dtime;
  public String ddate;
  public String end= "                   END";
  Departure(){
  }
  Scanner in= new Scanner(System.in);
  public void setDepartureInfo(){
    System.out.print("Enter the date of departure: ");
    ddate= in.nextLine();
    System.out.print("Enter the time of departure: ");
    dtime= in.nextLine();
  }
  public void getDepartureInfo(){
    System.out.println("Departure Date: "+ddate +"          Departure Time: "+ dtime);
  }
  //for polymorphism->
  public void poly(){
    System.out.println("Good Bye!!!");
  }

}
