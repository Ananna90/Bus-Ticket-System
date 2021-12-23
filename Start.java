
import Classes.*;
import account.Test;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class Start  {
    public static void main(String[] args){
		
		
		
		 Test t2= new Test();
       
		
        try {
            
            Bus b = new Bus();
            b.enroll();
            b.Facility();
            int seat = b.seat;
            new Reservation(seat);
            Reservation r = new Reservation();
            b.viewBalance();
            Food f = new Food();
            System.out.println("FOOD TOTAL COST--->" + f.sum);
            b.payment(f.sum);

            //poly method calling
            r.poly();
            // assoiciation relation
            b.print();

            //definnig all the string type variables to write in the txt file
            final Date timenow = new Date();
            String name= b.firstName +" "+ b.lastName;
            String noseat= String.valueOf(b.seat);
            String foodcost= String.valueOf(f.sum);
            String ticketcost= String.valueOf(b.ticketBalance);
            String total= String.valueOf(f.sum + b.ticketBalance);
            String issuedate= timenow.toString();
            String deptime= r.dtime;
            String depdate=r.ddate;
            String aircon= "ERROR";
            if(b.AcNonAc == 1){
                aircon= "AC-Bus";
            }
            else{
                aircon= "NonAC-Bus";
            }
            String id= b.PassengerId;
            String destination= b.des;
            
            // File Handling
            FileWriter writer= new FileWriter("Demo_output_file.docx");
            writer.write("\nIssue date: "+issuedate+"\nName: "+name+"	ID: "+id+"\nDestination: "+destination+"\nDeparture date: "+depdate+"   Departure time: "+deptime+"\nNumber of seats: "+noseat+"        Ac or NonAc: "+aircon+"\nTicket price= "+ticketcost+"TK         Food price= "+foodcost+"TK\n                 Total= "+total+"TK");
            writer.close();

        }
        catch (Exception e) {
            System.out.println("\n\n!!!Execption: "+e);
      
	   }
	   
	   
    }
	
}