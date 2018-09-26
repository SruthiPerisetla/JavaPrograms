import java.util.*;
public class Largest 
{
public static void main(String[] args)
{
	int a,b,c;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the three numbers to find out the largest");
	a =input.nextInt();
	b = input.nextInt();
	c = input.nextInt();
	
	if(a>b && a>c)
	{
		System.out.println("A is largest :"+a);
	}
	else if(b>a && b>c)
	{
		
			System.out.println("B is largest :"+b);
	
	}
	else
	{
		System.out.println("C is largest :"+c);
	}
		
		
}
}
