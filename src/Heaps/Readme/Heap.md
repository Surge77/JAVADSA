# Heap

A *heap* is a specialized binary tree-based data structure that satisfies the *heap property*: in a max-heap, the value of each node is greater than or equal to the values of its children, whereas in a min-heap, the value of each node is less than or equal to the values of its children. Heaps are particularly useful for priority queues, sorting algorithms, and scenarios where fast access to the largest or smallest element is required.

### Characteristics of a Heap

1. **Binary Tree Structure**: Heaps are complete binary trees, meaning every level of the tree is fully filled except possibly for the last level, which is filled from left to right.
2. **Heap Property**:
   * *Max-Heap*: The root (or parent) node is always greater than or equal to its children, which ensures the maximum element is at the root.
   * *Min-Heap*: The root (or parent) node is always less than or equal to its children, ensuring the minimum element is at the root.
3. **Not a Binary Search Tree**: Heaps are not sorted across levels like binary search trees; they only satisfy the heap property with direct children, not across levels.


### Types of Heaps

1. **Max-Heap**:
   * In a max-heap, each parent node is greater than or equal to its children.
   * The largest element is stored at the root of the heap.
   * This type of heap is commonly used in algorithms that need quick access to the maximum element, such as a priority queue.
2. **Min-Heap**:
   * In a min-heap, each parent node is less than or equal to its children.
   * The smallest element is stored at the root of the heap.
   * Min-heaps are used in applications like Dijkstra's algorithm, where the smallest element is required frequently.

### Applications of Heaps

1. **Priority Queues**: Heaps are the underlying structure of priority queues since they allow efficient insertion and extraction of the highest or lowest priority element.
2. **Heap Sort**: This is a sorting algorithm that builds a heap from the input data, then repeatedly extracts the root, which is the maximum or minimum element, to get a sorted sequence.
3. **Graph Algorithms**: Algorithms like Dijkstra's shortest path often utilize heaps to quickly access and remove the smallest element.

## Implementation

Heaps are usually implemented as arrays for efficiency:

* For a node at index `i`, its children are located at indices `2i + 1` and `2i + 2`.
* The parent of a node at index `i` is located at index `(i - 1) / 2`.

### Time Complexity

* **Insertion**: `O(log n)` as it may require moving the element up through the levels.
* **Deletion (of root)**: `O(log n)` as it involves reordering by moving elements down through the levels.
* **Accessing the Root**: `O(1)` since it’s always at the root.
* **Heap Construction**: If building a heap from an unordered array, the time complexity is `O(n)`.
