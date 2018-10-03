import java.util.Scanner;
public class ReverseStringRecursive {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter a string you want to reverse: ");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		scan.close();
		String reversed = reverseString(str);
        System.out.println("Reversed String is :"+reversed);
	}

	public static String reverseString(String str) {
		if(str.isEmpty())
		return str;
		return reverseString(str.substring(1))+ str.charAt(0);
	}

}
