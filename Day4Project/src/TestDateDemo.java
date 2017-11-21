import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class TestDateDemo 
{

	public static void main(String[] args) 
	{
		LocalDate today=LocalDate.now();
		System.out.println(" Today Is : "+today);
		
		
		//System.out.println(" Today is in dd-mmm-yyyy"+
		//today.format(DateTimeFormatter.ofPattern(" dd-MMM-yyyy")));
		
		System.out.println(" My Date Of Joining : ");
		LocalDate myDoj=LocalDate.of(2013, 11, 21);
		System.out.println(" My date Of Joining is : "+myDoj);
		
		System.out.println(" Date after 2 Days : "+today.plusDays(2));
		
		Period per=Period.between(myDoj, today);
		
		System.out.println(" My experience In Capgemini is : "+per.getYears() +
							" Years "+ per.getMonths()+ " Months " +per.getDays() +
							"  Days");
		
		String myDOBS="20-Sep-1994";
		DateTimeFormatter myFormater=DateTimeFormatter.ofPattern("dd-MMM-uuuu");
		//DateTimeFormatter myFormater=DateTimeFormatter.ofPattern("dd MM yyyy");
		
		LocalDate myDOB=LocalDate.parse(myDOBS,myFormater);
		//System.out.println(" My Date Of Birth is : "+myDOB);
		System.out.println(" My Date Of Birth Is : "+myDOB);
		System.out.println(" My Date Of Birth Is :"+myDOB.format(myFormater));
		
	}

}
