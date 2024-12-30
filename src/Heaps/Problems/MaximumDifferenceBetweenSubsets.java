package Heaps.Problems;

/**
 * Problem: Maximum Difference Between Two Subsets of m Elements
 *
 * Description:
 * Given an array of n integers and a number m, the task is to
 * find the maximum possible difference between the sums of two subsets of m elements chosen from the given array.
 *
 * Example : input : arr[] = {1,2,3,4,5}
 * m = 4
 * output : 4
 *
 * Explanation :
 *
 * The maximum m elements are [2,3,4,5] with a sum of 2+3+4+5 = 14
 * The minimum m elements are [1,2,3,4] with a sum of 1+2+3+4 = 10
 * The difference is 14 - 10 = 4
 *
 */

/**
 * Approach Using Heaps:
 *
 * We will use two heaps:
 *
 * A min-heap to get the m smallest elements.
 * A max-heap to get the m largest elements.
 * We can leverage the heap's property that allows us to efficiently insert elements and remove the smallest/largest elements.
 *
 * Steps Using Heaps:
 * To get the m smallest elements:
 *
 * Use a max-heap (where the largest element is at the top) to store the smallest
 * m elements. Once the heap exceeds size m, remove the largest element to keep the heap size constant at
 * To get the m largest elements:
 *
 * Use a min-heap (where the smallest element is at the top) to store the largest
 * m elements. Once the heap exceeds size m, remove the smallest element to keep the heap size constant at  m.
 * Compute the sums of both heaps (smallest and largest elements) and find their difference.
 *
 *
 * Time complexity : O(n log m)
 * Space complexity : O(m)
 *
 */



//



import java.util.PriorityQueue;

public class MaximumDifferenceBetweenSubsets {

    public static int maxDifference(int[] arr, int m) {
        // Max-heap for the m smallest elements (we use a negative to simulate max-heap in Java)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Max-heap for the m largest elements (we use a negative to simulate max-heap in Java)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Insert elements into the respective heaps
        for (int num : arr) {
            // For smallest m elements, use a min-heap
            minHeap.add(num);
            if (minHeap.size() > m) {
                minHeap.poll(); // Remove the largest element if size exceeds m
            }

            // For largest m elements, use a max-heap
            maxHeap.add(num);
            if (maxHeap.size() > m) {
                maxHeap.poll(); // Remove the smallest element if size exceeds m
            }
        }

        // Calculate the sum of the smallest m elements
        int minSum = 0;
        while (!minHeap.isEmpty()) {
            minSum += minHeap.poll();
        }

        // Calculate the sum of the largest m elements
        int maxSum = 0;
        while (!maxHeap.isEmpty()) {
            maxSum += maxHeap.poll();
        }

        // Return the difference between the two sums
        return maxSum - minSum;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int m1 = 4;
        System.out.println("Maximum difference: " + maxDifference(arr1, m1));

        // Example 2
        int[] arr2 = {5, 8, 11, 40, 15};
        int m2 = 2;
        System.out.println("Maximum difference: " + maxDifference(arr2, m2));
    }
}
