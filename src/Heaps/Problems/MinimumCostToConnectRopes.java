package Heaps.Problems;
import java.util.*;

/**
 * Problem: Connect N Ropes with Minimum Cost
 *
 * Given N ropes of different lengths, the task is to connect these ropes into one single rope with the minimum cost.
 * The cost to connect two ropes is equal to the sum of their lengths.
 *
 * Example:
 * Input: arr[] = {4, 3, 2, 6}, N = 4
 *
 * Output: 29
 *
 * Explanation:
 *
 * Connect ropes of lengths 2 and 3. The cost is 2 + 3 = 5. Now, the ropes are [4, 5, 6].
 * Connect ropes of lengths 4 and 5. The cost is 4 + 5 = 9. Now, the ropes are [6, 9].
 * Connect the remaining ropes 6 and 9. The cost is 6 + 9 = 15.
 * The total cost is 5 + 9 + 15 = 29.
 *
 * Use a Min-Heap (Priority Queue) to always connect the smallest two ropes at each step.
 * The greedy approach ensures that smaller costs are added earlier, minimizing the total cost.
 *
 * Steps:
 *
 * - Insert all rope lengths into a Min-Heap.
 * - While there is more than one rope in the heap:
     * Remove the two smallest ropes.
     * Compute their cost (sum of their lengths).
     * Add this cost to the total.
     * Insert the combined rope length back into the heap.
 * - The final accumulated cost is the minimum cost to connect all ropes
 */

import java.util.PriorityQueue;

public class MinimumCostToConnectRopes {

    public static int minCost(int[] ropes) {
        // Create a min-heap (priority queue)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all ropes to the min-heap
        for (int rope : ropes) {
            minHeap.add(rope);
        }

        int totalCost = 0;

        // Continue until only one rope remains
        while (minHeap.size() > 1) {
            // Remove the two smallest ropes
            int first = minHeap.poll();
            int second = minHeap.poll();

            // Calculate the cost to connect them
            int cost = first + second;
            totalCost += cost;

            // Add the new rope back to the heap
            minHeap.add(cost);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        System.out.println("Minimum cost to connect ropes: " + minCost(ropes));
    }
}

