package project1;
import java.util.*;

public class EmailValidation {

	public static void main(String[] args) {
		String[] e = new String[] {"meena@gmail.com","aayansh@gmail.com","ananya@gmail.com","akshaya@gmail.com"};
		
		Scanner s=new Scanner(System.in);
	
		String u;
	do
	{
		System.out.println("Enter emailid: ");
		u = s.next();
	
		
	if(Arrays.asList(e).contains(u))
		{
		
		System.out.println("valid Email id");
		
	}
	else
	{
		System.out.println("not found");
	
	}
	
	}

	while(true);
	
		}
	

}
