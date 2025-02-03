import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    	public static void main(String[] args) {
        		Scanner scanner = new Scanner(System.in);

        		// Getting user input
        		System.out.print("Enter the number of elements: ");
        		int n = scanner.nextInt();
        		int[] numbers = new int[n];

        		System.out.println("Enter " + n + " numbers:");
        		for (int i = 0; i < n; i++) {
            			numbers[i] = scanner.nextInt();
        		}

        		// 1. Separate Even and Odd numbers
        		int[][] evenOddArrays = ArrayExercise.separateEvenOdd(numbers);
        		System.out.println("Even numbers: " + Arrays.toString(evenOddArrays[0]));
        		System.out.println("Odd numbers: " + Arrays.toString(evenOddArrays[1]));

        		// 2. Find the closest pair in user-entered array
        		ArrayList <Integer> indices = ArrayExercise.findAllSmallestDistancePairs(numbers);
        		System.out.println("Index/Indices of the first number(s) in the closest pair(s): " + indices);

        		// 3. Convert Array to ArrayList and vice versa
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int num : numbers) {
    			arrayList.add(num);
		}
		System.out.println("Converted Array to ArrayList: " + arrayList);

		// Demonstrating the flexibility of ArrayList by adding and removing an element
		System.out.print("Enter a number to add: ");
		int newElement = scanner.nextInt();
		arrayList.add(newElement);
		System.out.println("Updated ArrayList after adding: " + arrayList);

		System.out.print("Enter a number to remove: ");
		int removeElement = scanner.nextInt();
		if (arrayList.contains(removeElement)) {
    			arrayList.remove(Integer.valueOf(removeElement));
    			System.out.println("Updated ArrayList after removing: " + arrayList);
		} else {
    			System.out.println("Element not found!");
		}

        		System.out.println("Array converted to ArrayList: " + arrayList);

		int[] updatedArray = arrayList.stream().mapToInt(i -> i).toArray();
		System.out.println("Final Array after modifications: " + Arrays.toString(updatedArray));


        		scanner.close();
    	}
}
