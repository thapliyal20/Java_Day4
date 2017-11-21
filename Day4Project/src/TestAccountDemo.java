import java.util.Scanner;


public class TestAccountDemo
{

	public static void main(String[] args)
	{
		
		int currentBalance=50000;
		try(Scanner sc=new Scanner(System.in)){        //java 8 version we use try
		int withdrawAmt=sc.nextInt();
		if(withdrawAmt>currentBalance)
		{
			try
			{
				throw new LowBalanceException
				("Insufficient Blance in your Account");
			}
			catch (LowBalanceException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println(" You have sufficient balance "+
								"You can Withdraw the money");
		}
	}
      catch(Exception e)
		{
    	  e.printStackTrace();
		}

}
}