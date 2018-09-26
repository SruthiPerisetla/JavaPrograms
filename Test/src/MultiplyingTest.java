import java.util.*;
public class MultiplyingTest 
{
public static void main(String[] args)
{
	System.out.println("Hello World");
	int i;
	System.out.println("Enter the number youwish to multiply");
	Scanner input = new  Scanner(System.in);
	int n = input.nextInt();
	for(i=1;i<=10;i++)
	{
	
		System.out.println(n+"X"+(i)+"="+(n * (i)));
	}
	
}
}
