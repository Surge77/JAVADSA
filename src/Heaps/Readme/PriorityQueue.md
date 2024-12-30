# Priority Queue

Using heap we can implement priority queue.

> Facts about heap

- Heap is a binary tree
- Heap is a complete binary tree
- Heap will maintain mental model of complete Binary tree but will be very easily implemented using arrays
- As this is a tree parent has higher priority than children

> Priority -> Max -> Maxheap -> Root node has highest priority element
>
> Priority -> Min -> Minheap

A *priority queue* is an abstract data type that operates similarly to a regular queue but with an added feature: each element in the queue has a priority level. Instead of processing elements in a strict FIFO (first-in, first-out) order, a priority queue dequeues elements based on their priority. This makes priority queues useful in applications where tasks with higher priority need to be processed before others, such as in operating systems, networking, or graph algorithms.

### Characteristics of a Priority Queue

1. **Element Priority**: Each element has an associated priority. Higher-priority elements are dequeued before lower-priority ones.
2. **Not Always FIFO**: While a regular queue follows FIFO, a priority queue allows elements with higher priority to bypass this order and be processed earlier.
3. **Dynamic**: Priorities can be dynamically adjusted, meaning elements with initially lower priorities can later be given higher priorities.

### Types of Priority Queues

1. **Max-Priority Queue**: Elements with higher values (or priorities) are dequeued before elements with lower values.
2. **Min-Priority Queue**: Elements with lower values (or priorities) are dequeued before elements with higher values.

### Implementing a Priority Queue Using a Heap

Heaps are an ideal data structure for implementing priority queues due to their efficient insertion and deletion operations. By using a heap, we can maintain the priority queue’s properties while ensuring fast access to the element with the highest (or lowest) priority.

#### Max-Heap and Min-Heap in Priority Queues

* **Max-Heap**: A max-heap is used for a max-priority queue. The element with the highest priority is always located at the root of the heap, which allows it to be accessed and removed efficiently.
* **Min-Heap**: A min-heap is used for a min-priority queue, where the element with the lowest priority is always at the root.

#### Priority Queue Operations Using a Heap

1. **Insertion (`O(log n)`)**:

   * Insert the new element at the end of the heap (array) to keep it a complete binary tree.
   * Perform the "heapify up" operation to ensure the heap property is maintained. If the new element has higher priority than its parent, swap them and continue until the heap property is restored.
2. **Extract-Max or Extract-Min (`O(log n)`)**:

   * Extracting the highest (or lowest) priority element involves removing the root of the heap.
   * Replace the root with the last element in the heap, then remove the last element.
   * Perform the "heapify down" operation to restore the heap property by swapping the misplaced root down with its highest-priority child until the property is restored.
3. **Peek (`O(1)`)**:

   * Access the element with the highest (or lowest) priority. This is simply the root of the heap, so it can be accessed directly in `O(1)` time.
4. **Change Priority (`O(log n)`)**:

   * To change the priority of an element, adjust its value and then perform either "heapify up" or "heapify down" as appropriate to restore the heap property.
