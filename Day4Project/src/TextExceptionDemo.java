import java.util.Scanner;

class Calculator
{
	int num1;
	int num2;
	public Calculator(){}
	public Calculator(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public float divide()
	{
		float result=0.0f;
		try
		{
			result =num1/num2;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(" " +"Please check the divisor should not be 0");
		}
		catch(ArrayIndexOutOfBoundsException aex)
		{
			System.out.println("" + "Please check the array size");
		}
		catch(Exception e)
		{
			System.out.println(" "+ "Other Exception" );
			e.printStackTrace();
		}
		finally{
			System.out.println("The block is always executed.");
		}
		return result;
	}
}

public class TextExceptionDemo 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter num1 :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		Calculator c=new Calculator(num1,num2);
		System.out.println("Division od 2 numbers is : "+c.divide());
		System.out.println("***************MAIN ENDS HERE*******************");
	}

}
