import java.util.*;
public class PrimeNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no, i, respo=0;
		do
		{
			System.out.print("\nEnter the number: ");
			no = sc.nextInt();
			boolean flag = true;
			if(no ==1)
				flag= false;
			else
			{	
				for(i=2; i<=no/2; i++)
				{
					if(no%i == 0)
					{
						flag = false;
						break;
					}
				}
			}
			if(flag == true)
				System.out.println(no+" is a prime number.");
			else
				System.out.println(no+" is not a prime number.");	
			System.out.print("\nDo you want to contiune (0/1)? ");
			respo = sc.nextInt();
		}while(respo == 1);
	}
}