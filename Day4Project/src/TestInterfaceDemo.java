
public class TestInterfaceDemo
{

	public static void main(String[] args) 
	{	
		/*Printable pArr[]=new Printable[2];
		pArr[0]=new Customer(111,"Kritika");
		pArr[1]=new Customer(222,"Kanika");
		pArr[0].print();
		pArr[1].print();
		*/
		
		Printable p1=new Customer(111,"Kritika");
		
		p1.print();
		System.out.println(((Customer)p1).sayHi());
				
	}

}
