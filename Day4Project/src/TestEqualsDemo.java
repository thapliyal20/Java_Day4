
public class TestEqualsDemo 
{

	public static void main(String[] args) 
	{
		Integer i1=new Integer(10);
		Integer i2=new Integer(20);
		Integer i3=new Integer(30);
		
		if(i1.equals(i3))
		{
			System.out.println(" They are Equals");
			System.out.println(" hash Code of i1: "+i1.hashCode());
			System.out.println(" hash Code of i2: "+i2.hashCode());
			System.out.println(" hash Code of i3: "+i3.hashCode());
		}
		else
		{
			System.out.println(" They are not Equals");
			System.out.println(" hash Code of i1: "+i1.hashCode());
			System.out.println(" hash Code of i2: "+i2.hashCode());
			System.out.println(" hash Code of i3: "+i3.hashCode());
		}
		
		System.out.println("***********:String comparison************");
		String comp1="Capgemini";
		String comp2= new String("iGate");
		String comp3="Ltd";
		String comp4=new String("Capgemini");
		String comp5="Capgemini";
		String comp6=new String("Capgemini");
		StringBuffer city=new StringBuffer("Pune");
		
		System.out.println(" hash Code of comp1: "+comp1.hashCode());
		System.out.println(" hash Code of comp2: "+comp2.hashCode());
		System.out.println(" hash Code of comp3: "+comp3.hashCode());
		System.out.println(" hash Code of comp4: "+comp4.hashCode());
		System.out.println(" hash Code of comp5: "+comp5.hashCode());
		System.out.println(" hash Code of comp6: "+comp5.hashCode());
		System.out.println(" hash Code of city: "+city.hashCode());
		
		System.out.println("Is comp1 == comp2 ? "+(comp1 == comp2));
		System.out.println("Is comp1 == comp4 ? "+(comp1 == comp4));
		System.out.println("Is comp1 == comp5 ? "+(comp1 == comp5));
		System.out.println("Is comp4 == comp6 ? "+(comp4 == comp6));
		System.out.println("Is comp1 equals comp2 ? "+(comp1.equals(comp2)));
		System.out.println("Is comp1 equals comp4 ? "+(comp1.equals(comp4)));
		System.out.println("Is comp1 equals comp5 ? "+(comp1.equals(comp5)));
		System.out.println("Is comp4 equals comp6 ? "+(comp4.equals(comp6 )));
	}

}
