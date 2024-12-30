package Heaps.Problems;
import java.util.*;

//Sort a nearly sorted (or k sorted) array

//Given an array of N elements, where each element is at most k away from its target position.
//Devise an algorithm that sorts in O(N log K) time

//Input: arr[] = {6, 5, 3, 2, 8, 10, 9} K = 3
//Output: arr[] = {2, 3, 5, 6, 8, 9, 10}

//Input: arr[] = {10, 9, 8, 7, 4, 70, 60, 50} K = 4
//Output: arr[] = {4, 7, 8, 9, 10, 50, 60, 70}

public class NearlySortedArray {

    public static void sortNearlySortedArray(int[] arr, int k) {
        // Min-heap to store elements within the current window of k+1 elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add the first k+1 elements to the min-heap
        for (int i = 0; i <= k && i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        int index = 0;
        // For each remaining element in the array, add it to the heap and extract the minimum
        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = minHeap.poll();
            minHeap.add(arr[i]);
        }

        // Extract remaining elements from the heap and place in the array
        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 5, 3, 2, 8, 10, 9};
        int k1 = 3;
        sortNearlySortedArray(arr1, k1);
        System.out.println("Sorted array: " + Arrays.toString(arr1));

        int[] arr2 = {10, 9, 8, 7, 4, 70, 60, 50};
        int k2 = 4;
        sortNearlySortedArray(arr2, k2);
        System.out.println("Sorted array: " + Arrays.toString(arr2));
    }
}
