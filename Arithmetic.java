package project1;

import java.util.Scanner;

class Calc {
	double result;
	public double Add(int x,int y)
	{
		
		result = x + y;
		return result;
			}
	public double subtract(int x,int y)
	{
		result = x - y;
		return result;
			}
	public double product(int x,int y)
	{
		result = x * y;
		return result;
			}
	public double div(int x,int y)
	{
		result = x / y;
		return result;
		
			}
	
}


public class Arithmetic
	
	{
	public static void main(String args[])
	{
	Calc c = new Calc();
		int a , b ;
		String x;
		char operator;
		Scanner s = new Scanner(System.in);
		
	do
	{
		System.out.println("Enter a value:");
		a = s.nextInt();
		System.out.println("Enter b value:");
		b = s.nextInt();
		System.out.println("Enter a operator (+,-,*,/):");
		operator = s.next().charAt(0);
		
	switch(operator)
	{
	case '+':
		System.out.println("The sum is:"+c.Add(a,b));
		
			break;	
	case '-':
		System.out.println("The subtraction is:"+c.subtract(a,b));
		break;
	case '*':
		System.out.println("The production is:"+c.product(a,b));
		break;
	case '/':
		System.out.println("The division is:"+c.div(a,b));
	break;
	default:
		System.out.println("Error operator");
		return;
		
		
				}
	System.out.println("Do you want to continue yes/no:");
    x = s.next();
        
        
	}
	
	
	while(x.equals("yes"));
	
				
	s.close();	
		
	}

}

