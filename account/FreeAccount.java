package account;
import account.*;
public class FreeAccount extends Account
{
	private String add="Advertistement .....";
	

	public void showDetails()
	{
		super.showDetails();
		System.out.println(add);
	}
}