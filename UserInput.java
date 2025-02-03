// UserInput.java

import java.util.Scanner;

public class UserInput {
    	public static int[] getNumbers() {
        		Scanner scanner = new Scanner(System.in);

        		// Asking the user for the number of elements
        		System.out.print("Enter the number of elements: ");
        		int n = scanner.nextInt();
        		int[] numbers = new int[n];

        		// Accept numbers from the user
        		System.out.println("Enter " + n + " numbers:");
        		for (int i = 0; i < n; i++) {
            			numbers[i] = scanner.nextInt();
        		}
        		return numbers; 
    	}
}
