import java.io.IOException;


public class ThrowDemo
{
	public void method1()throws IOException
	{
		System.out.println("I am in method 1 ThrowDemo");
		method2();
	}
	

	public void method2()throws IOException
	{
		System.out.println("I am in method 2 ThrowDemo");
		
		throw new IOException();
	}
}
