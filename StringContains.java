import java.util.*;

public class StringContains
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
	
		s = s.toLowerCase();
		boolean flag = false;
		
		int len = s.length();
		//System.out.print("Length of the string: " +len);

		System.out.print("\nEnter the character you want to find in the string: ");
		char ch = sc.next().charAt(0); 	

		ch = Character.toLowerCase(ch);
		for(int i = 0; i < len; i++)
		{
			if(s.charAt(i) == ch)
			{
				System.out.println("\n\nGiven string does contain " +ch);	
				flag = true;
				break;	
			}
		}
	
		if(flag == false)
			System.out.println("\n\nGiven string does not contain " +ch);


		//if(s.contains("e"))
		//	System.out.println("\n\nGiven string does contain " +ch);
	}
}