package account;
import account.*;
public class Premium extends Account
{
	private double buySubs;
	
	public void setbuySubs(double buySubs)
	{
		this.buySubs = buySubs;
	}
	public double getbuySubs()
	{
		return buySubs;
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("buySubs: "+buySubs);
	}
}