# Sorting =>

Permutations -> Arrangements

Arranging data in a particular permutation (this depends on requirement) is called as sorting.
The order can be either ascending or descending, and it typically follows a well-defined comparison rule.

Common Sorting Algorithms:

Sorting:

Comparison based Sorting:
   1. Bubble Sort
   2. Selection Sort
   3. Insertion Sort
   4. Shell Sort
   5. Merge Sort
   6. Quick Sort

Counting based sorting:
   1. Bucket Sort
   2. Counting Sort
   3. Radix Sort
   4. Heap Sort


- Bubble Sort: Repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

- Merge Sort: Divides the list into halves, recursively sorts each half, and then merges the sorted halves.

- Quick Sort: Picks a "pivot" element and partitions the other elements into two sub-arrays according to whether they are less than or greater than the pivot, then recursively sorts the sub-arrays.

- Insertion Sort: Builds the final sorted array one item at a time, picking the next element and inserting it into its correct position.

- Selection Sort: Repeatedly selects the smallest (or largest) element from the unsorted portion and places it at the beginning.

- Counting Sort: Counts the occurrences of each unique element and calculates positions based on these counts.

- Heap Sort : Converts the array into a heap structure, repeatedly extracts the maximum element, and rebuilds the heap.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

=> Worst Sorting Approach :

Suppose we are given n integer values,arrange them in increasing order

Ex -> [14,2,54,-2,32,17,63] in the form of array

# Brute force => We can generate all possible permutations and filter out your required ones

Now this operation would take O(n!) which is very bad and all the other sorting algorithms runs faster than this
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Stability of sorting algorithms: 

After a stable sort the data which has the same values retains the same relative order as it was before sorting