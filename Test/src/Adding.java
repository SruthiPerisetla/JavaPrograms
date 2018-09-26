import java.util.*;;
public class Adding {

  public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int digits = input.nextInt();
	  System.out.println("The sum is " + sumDigits(digits));
    }

 public static int sumDigits(int n) {
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}
	
 }

