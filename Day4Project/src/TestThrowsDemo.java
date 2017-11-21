import java.io.IOException;


public class TestThrowsDemo 
{

	public static void main(String[] args) 
	{
		ThrowDemo tt=new ThrowDemo();
		try {
			tt.method1();
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}
}
