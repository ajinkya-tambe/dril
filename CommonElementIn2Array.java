import java.util.*;

public class CommonElementIn2Array
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("This program will find the common elements between two arrays.");
		
		System.out.print("\nEnter the size of first array: ");
		int size1 = sc.nextInt();
		int arr1[] = getArray(size1);
		
		
		System.out.print("\nEnter the size of second array: ");
		int size2 = sc.nextInt();
		int arr2[] = getArray(size2);

		System.out.print("\nFirst array: ");
		printArray(arr1);
		System.out.print("\nSecond array: ");
		printArray(arr2);

		if(size1 == 0 || size2 == 0)
		{
			System.out.println("\n\nNo common elements as one of the array is empty!");
		}
		else
		{
			System.out.print("\n\nCommon elements are: ");
			for(int i = 0; i < size1; i++)
			{
				for(int j = 0; j < size2; j++)
				{
					if(arr1[i] == arr2[j])
						System.out.print(arr1[i]+ " ");
				}
			}
		}
	}
	
	public static int[] getArray(int size)
	{
		int arr[] = new int[size];
		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter the element at index- " +i+ " : ");
			arr[i] = sc.nextInt();
		}

		return arr;
	}

	public static void printArray(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	
}










