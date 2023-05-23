import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = sc.nextInt();
            
        System.out.println("\nMultiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) 
        	System.out.println(number + " x " + i + " = " + (number * i));
        
    }
}
