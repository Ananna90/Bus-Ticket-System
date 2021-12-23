package account;


public class Account
{
	private int accountNumber;
	private String accountHolderName;
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
		
	}
	public int getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	
	public void showDetails(){
	System.out.println(getAccountHolderName());
	System.out.println(getAccountNumber());
	}
	
}