package Heaps;  // Heap implementation using arrays

import java.util.ArrayList;

public class HeapImplementation {
    // ArrayList to store heap elements
    private ArrayList<Integer> data = new ArrayList<>();

    // Add a new item to the heap
    public void add(int item) {
        this.data.add(item);  // Add item to the end of the list
        upHeapify(this.data.size() - 1);  // Adjust to maintain heap property
    }

    // Up-heapify to ensure the min-heap property is maintained
    private void upHeapify(int childIndex) {
        int parentIndex = (childIndex - 1) / 2;

        // Check if child is smaller than parent for min-heap condition
        if (childIndex > 0 && this.data.get(childIndex) < this.data.get(parentIndex)) {
            swap(childIndex, parentIndex);  // Swap child with parent
            upHeapify(parentIndex);  // Recursively heapify the parent
        }
    }

    // Swap elements at two indices in the list
    private void swap(int i, int j) {
        int temp = this.data.get(i);
        this.data.set(i, this.data.get(j));
        this.data.set(j, temp);
    }

    // Remove and return the root element (minimum element for min-heap)
    public int remove() {
        if (data.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }

        swap(0, data.size() - 1);  // Move the last element to the root
        int removedValue = data.remove(data.size() - 1);  // Remove last element

        downHeapify(0);  // Adjust heap to maintain heap property

        return removedValue;  // Return the removed root value
    }

    // Down-heapify to maintain the min-heap property after removal
    private void downHeapify(int parentIndex) {
        int minIndex = parentIndex;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        // Find the smallest among parent, left child, and right child
        if (leftChildIndex < data.size() && data.get(leftChildIndex) < data.get(minIndex)) {
            minIndex = leftChildIndex;
        }
        if (rightChildIndex < data.size() && data.get(rightChildIndex) < data.get(minIndex)) {
            minIndex = rightChildIndex;
        }

        // If parent is not the smallest, swap with the smallest child
        if (minIndex != parentIndex) {
            swap(minIndex, parentIndex);
            downHeapify(minIndex);  // Recursively heapify the affected subtree
        }
    }

    // Display the heap as an array
    public void display() {
        System.out.println(data);
    }

    // Main method to demonstrate heap operations
    public static void main(String[] args) {
        HeapImplementation minHeap = new HeapImplementation();

        // Adding elements to the heap
        minHeap.add(10);
        minHeap.add(15);
        minHeap.add(20);
        minHeap.add(17);
        minHeap.add(8);

        System.out.println("Heap after adding elements:");
        minHeap.display();  // Display heap

        // Removing the root (minimum) element
        System.out.println("Removed element: " + minHeap.remove());

        System.out.println("Heap after removing the root:");
        minHeap.display();  // Display heap after removal
    }
}
