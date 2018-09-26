/**
 * @author Sruthi
 *
 */

import java.util.*;
public class Swaping {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int a,b,temp;
Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
a = input.nextInt();

System.out.println("Enter the second number");
b = input.nextInt();


System.out.println("Numbers before swapping "+a+" and " +b);

temp =a;
a = b;
b = temp;

System.out.println("Numbers after swapping " +a+" and " +b);


	}

}
