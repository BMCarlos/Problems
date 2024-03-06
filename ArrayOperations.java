package work;

import java.util.Arrays;

public class ArrayOperations {
    
    public static void main(String[] args) {
        // Initialize array with 20 elements
        int[] array = {5, 3, 7, 10, 2, 8, 9, 4, 1, 6, 15, 12, 18, 13, 11, 16, 19, 14, 17, 20};
        
        // Traverse the array
        System.out.println("Array elements:");
        traverseArray(array);
        
        // Sort the array
        sortArray(array);
        System.out.println("\nSorted array:");
        traverseArray(array);
        
        // Find the largest value in the array
        int largest = findLargest(array);
        System.out.println("\nLargest value in the array: " + largest);
    }
    
    // Method to traverse the array and print its elements
    public static void traverseArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Method to sort the array
    public static void sortArray(int[] arr) {
        Arrays.sort(arr); // Using Java's built-in sorting method
    }
    
    // Method to find the largest value in the array
    public static int findLargest(int[] arr) {
        int largest = arr[0]; // Assume the first element is the largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) { // If current element is greater than current largest
                largest = arr[i]; // Update largest value
            }
        }
        return largest;
    }
}
