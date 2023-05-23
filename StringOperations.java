import java.util.*;

public class StringOperations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read 10 strings from the console
            String[] strings = new String[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter string number " +(i+1)+ " : ");
                strings[i] = scanner.nextLine();
            }

            // Sort the strings
            Arrays.sort(strings);

            // Print the sorted strings
            System.out.println("\nSorted Strings:");
            for (String str : strings) {
                System.out.println(str);
            }

            // Combine two strings
            String combinedString = strings[0] + strings[1];
            System.out.println("\nCombined String: " + combinedString);

            // Reverse the first string
            String reversedString = reverseString(strings[0]);
            System.out.println("\nReversed First String: " + reversedString);
        }
    }

    // Helper method to reverse a string
    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
