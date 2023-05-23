import java.util.*;

public class StringReverse
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		
		int len = s.length();
	
		System.out.print("\n\nReverse of given string " +s+ " is ");
		for(int i = len -1; i >= 0; i--)
		{
			System.out.print(s.charAt(i));
		}

		//OR
		//StringBuffer sb = new StringBuffer(s);
		//System.out.print("\n\nReverse is: " +sb.reverse());
	}
}