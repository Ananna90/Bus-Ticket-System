package Classes;
import Intarfaces.*;



import java.util.Date;
import java.util.Scanner;

public class Bus implements Inter{
    public String firstName;
    public String lastName;
    private String password;
    private String newPassword;
    private boolean passFlag= true;
    public int AcNonAc;
    public int destination= 0;
    public String PassengerId;
    private static int tickets = 0;
    public int selectNum;
    public int seat = 0;
    public double ticketBalance = 0;
    private int costofticket = 1000;
    public int id = 1000;
    private double discount= 0.0;
    public String des;
    
    //association
    public Departure dep = new Departure();
    public String xoxo= dep.end;

    public void print(){
        System.out.println(xoxo);
    }

    
    //public void associate(Departure d1){
    //    System.out.println("END");
    //}

    public Bus() {
        //
        System.out.println("\n\n\n******Welcome to the bus reservation system!******");
        System.out.println("  ~~~~~~~~~~~~~~|*|*|*|*|*|*|*|*|~~~~~~~~~~~~~~");
        System.out.println("Please Sign In");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter passenger's first name : ");
        this.firstName = in.nextLine();

        System.out.print("Enter passenger's last name : ");
        this.lastName = in.nextLine();
        System.out.print("Enter Password:");
        this.password = in.nextLine();
        while(passFlag) {
            System.out.print("Enter Password for login : ");
            this.newPassword = in.nextLine();
            if (password.equals(newPassword)) {
                System.out.print("\nSign In Successfully !");
                passFlag= false;
            } else {
                System.out.println("Your Password is wrong.\n Try Again!");
            }
        }
        System.out.print("\n\n1-Ena (5% Discount)\n2-Shohag (10% Discount)\n3-Golden Line (15% Discount)\n4-Green LINE (5% Discount)\nEnter your suitable Bus company : ");
        this.selectNum = in.nextInt();
        if(selectNum == 1){
            discount = 0.05;
        }
        else if(selectNum == 2){
            discount = 0.10;
        }
        else if(selectNum == 3){
            discount = 0.15;
        }
        else{
            discount = 0.05;
        }
        setPassengerId();
        System.out.println("Token-->");
        System.out.println(firstName + " " + lastName + " " + selectNum + "\nYour ID NO : " + PassengerId);
    }

    private void setPassengerId() {
        id++;
        this.PassengerId = selectNum + "" + id;
    }

    public void enroll() {
        System.out.println();
        System.out.print("How many seat you want : ");
        Scanner in=new Scanner(System.in);
        this.seat = in.nextInt();
    }

    public int getSeat(){
        return seat;
    }

    public void Facility() {
        Scanner input = new Scanner(System.in);
        System.out.println("1-Ac Bus\n2-Non Ac Bus");
        System.out.print("Enter 1 or 2: ");
        this.AcNonAc = input.nextInt();
        switch(AcNonAc){
            case 1:
            System.out.println("\n\n1)Dhaka to Chittagong   Ticket Price- 1000TK\n2)Dhaka to Cox's Bazar  Ticket Price- 1500TK\n3)Dhaka to Sylhet       Ticket Price- 1000TK");
            System.out.print("\nEnter your Destination : ");
            Scanner in= new Scanner(System.in);
            destination = in.nextInt();
            switch(destination){
                case 1:
                costofticket= 1000;
                des= "Dhaka to Chittagong";
                break;
                case 2:
                costofticket= 1500;
                des= "Dhaka to Cox's Bazar";
                break;
                case 3:
                costofticket= 1000;
                des= "Dhaka to Sylhet";
                break;
                default:
                System.out.println("Enter valid destination");
            }
            break;
            case 2:
            System.out.println("\n\n1)Dhaka to Chittagong   Ticket Price- 700TK\n2)Dhaka to Cox's Bazar  Ticket Price- 1000TK\n3)Dhaka to Sylhet       Ticket Price- 700TK");
            System.out.print("\nEnter your Destination : ");
            destination = input.nextInt();
            switch(destination){
                case 1:
                costofticket= 700;
                des= "Dhaka to Chittagong";
                break;
                case 2:
                costofticket= 1000;
                des= "Dhaka to Cox's Bazar";
                break;
                case 3:
                costofticket= 700;
                des= "Dhaka to Sylhet";
                break;
                default:
                System.out.println("Enter valid destination");
            }
            break;
            default:
            System.out.println("Enter a valid option");
        }
        /*if (AcNonAc == 1) {
            tickets = tickets + seat;
            ticketBalance = tickets * costofacticket;
        }
        else if( AcNonAc== 2){
            tickets = tickets + seat;
            ticketBalance = tickets * costofticket;
        }*/
        System.out.println("Enrolled In : " + seat);
        ticketBalance= (costofticket*seat)-(costofticket*seat*discount);
        System.out.println("Ticket Price is :" + ticketBalance +"TK         with discounts");
    }


    public void viewBalance() {
        System.out.println("Your Ticket Price is: " + ticketBalance + "TK");

    }

    public void thankyou() {
        System.out.println("!!Thank you so much and you are welcome!!");

    }


    public void payment(double foodcost){
        Scanner in= new Scanner(System.in);
        final Date timenow = new Date();
        double sum=0, pay, due;
        String dash= "========================================";
        sum= ticketBalance + foodcost;
        System.out.println(dash);
        System.out.println("                <-Bill->                ");
        System.out.println(dash);
        System.out.println("Issue Date: " + timenow.toString());
        System.out.println();
        System.out.println("1---Ticket price: "+ticketBalance+"TK");
        if(foodcost != 0){
        System.out.println("2---Food   price: "+foodcost+"TK");
        }
        System.out.println("-----------Total- "+ sum+"TK");
        System.out.println();
        System.out.println(dash);
        System.out.println("\nmaking payment------------->");
        System.out.print("Please Enter Your Payment(TK)= ");
        pay= in.nextDouble();
        due= pay-sum;
        if(due == 0.0){
        System.out.println("!!!!!!!!!!!Payment Successful!!!!!!!!!!!");
        }
        else if(due>0) {
        System.out.println("You have "+due+" in return");
        }else if(due<0) {
        System.out.println("You have "+due+" in return");
        }

        thankyou();
        System.out.println(dash);
        
    }
    

    // public void payTution() {

    //     System.out.print("Enter your payment(tk) : ");
    //     Scanner in = new Scanner(System.in);
    //     int payment = in.nextInt();
    //     ticketBalance = ticketBalance - payment;
    //     System.out.println("Thanks for your payment " + payment + " tk");
    //     viewBalance();
    // }
}