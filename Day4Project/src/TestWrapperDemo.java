
public class TestWrapperDemo
{

	public static void main(String[] args)
	{
		int i=10;
		//below java version 5.0
		Integer i1=new Integer(i);   //boxing
		
		int k=i1.intValue();		//unboxing 				//to convert into primitive
		
		//after java version 5.0
		Integer i2=70;				//autoboxing
		
		int z=i1;					//autounboxing
	}

}
