// ArrayExercise.java

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExercise {
    	public static int[][] separateEvenOdd(int[] numbers) {
        		ArrayList<Integer> evens = new ArrayList<>();
        		ArrayList<Integer> odds = new ArrayList<>();

        		// Iterating through the array and classify numbers as even or odd
        		for (int num : numbers) {
            			if (num % 2 == 0) {
                				evens.add(num); 
            			} else {
                				odds.add(num);  
            			}
        		}
        		// Converting ArrayList into a 2D array
        		int[] evenArray = evens.stream().mapToInt(Integer::intValue).toArray();
        		int[] oddArray = odds.stream().mapToInt(Integer::intValue).toArray();
        
        		return new int[][]{evenArray, oddArray}; 
    	}
	public static ArrayList<Integer> findAllSmallestDistancePairs(int[] arr) {
        		ArrayList<Integer> indices = new ArrayList<>();
        
        		if (arr.length < 2) return indices; // Returns empty list if array has less than 2 elements

        		int minDistance = Math.abs(arr[1] - arr[0]);
        		indices.add(0);

        		for (int i = 1; i < arr.length - 1; i++) {
			// Calculates the absolute difference between the current and next element
            			int diff = Math.abs(arr[i + 1] - arr[i]);

			// If the current difference is smaller than the previously found minimum distance
            			if (diff < minDistance) {
                				minDistance = diff; // Updates the minimum distance
                				indices.clear(); // Clears the existing indices as we found a smaller distance
                				indices.add(i); // Stores the index of the current element
            			} 
			// If the current difference is equal to the minimum distance, store this index as well
			else if (diff == minDistance) {
                				indices.add(i);
            			}
        		}

        		return indices;
    	}

    	// Converts an Integer array to an ArrayList
    	public static ArrayList<Integer> convertArrayToArrayList(Integer[] arr) {
        		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        		return arrayList;
    	}

    	// Converts an ArrayList back to an Integer array
    	public static Integer[] convertArrayListToArray(ArrayList<Integer> arrayList) {
        		Integer[] arr = new Integer[arrayList.size()];
        		arrayList.toArray(arr);
        		return arr;
    	}
}
