import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
	  int size = sc.nextInt();
	
	  System.out.println();
	  int arr[] = new int[size];
	  for(int i = 0; i < size; i++)
	  {
		System.out.print("Enter the element at index-" +i+ " : ");
		arr[i] = sc.nextInt();
	  }
	
	  System.out.print("\nYour array: ");
	  for(int i = 0; i < size; i++)
	  {
		System.out.print(arr[i] + " ");
		
	  }
	
        int[] result = removeDuplicates(arr);

        System.out.print("\n\nArray without duplicates:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArr = new int[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        int[] result = Arrays.copyOf(uniqueArr, uniqueCount);
        return result;
    }
}
