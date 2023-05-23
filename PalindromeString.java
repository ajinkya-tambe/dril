import java.util.*;

public class PalindromeString
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
			
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();

		if(s.equals(sb.toString()))
			System.out.print("\n\nString is a palindrome!");
		else
			System.out.print("\n\nString is not a palindrome!");	
	}
}