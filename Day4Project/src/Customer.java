
public class Customer implements Printable,Sortable
{
	private int custId;
	private String custName;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

@Override
public void print()
{
	System.out.println("CustId : "+custId);
	System.out.println("CustName : "+custName);
}
@Override
public Sortable sort(Sortable[] list) 
{
	System.out.println("Sortable");
	return null;
}

public String sayHi()
{
	return "WELCOME ALL";
}
}