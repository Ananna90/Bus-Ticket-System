package account;
import account.*;
import java.util.Scanner;
public class Test
{
	
		public Test(){	
		
		int  count;
		 Scanner goB = new Scanner(System.in);
		do{
	 
		System.out.println("What do you want to do?");
			System.out.println("1. Make Premium account ");
			System.out.println("2. NO");
			System.out.print("Your Option: ");
			int option = goB.nextInt();
			
			
			if (option == 1){
		   System.out.println("-----------------------------------------");
					System.out.println("You have choosen Premium account");
					System.out.println("-----------------------------------------");
		
		Customer c = new Customer();
		Account p1 = new Premium();
		
	
		c.addAccount(p1);
		
		
		}
		else if (option == 2){
			
		   System.out.println("-----------------------------------------");
					System.out.println("Your account  Free account now Advertisement may show");
					 FreeAccount f1= new FreeAccount();
					 	Customer c1 = new Customer();
					 c1.addAccount(f1);
					System.out.println("-----------------------------------------");
	
			}
     System.out.println("1 Try again ");			
     System.out.println("2 Go to next step ");			

	 count = goB.nextInt();
	
	}while(count == 1);
	
   
		}
		
		

	
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

		
		
		
		