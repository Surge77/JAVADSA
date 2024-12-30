# Doubly Linked List:


A doubly linked list is a type of data structure that consists of a sequence of nodes. Each node in a doubly linked list contains three components:

- Data: The value that the node holds.
- Next Pointer: A reference (or pointer) to the next node in the list.
- Previous Pointer: A reference (or pointer) to the previous node in the list.

- This allows traversal of the list in both directions—forward (from the head to the tail) and backward (from the tail to the head), unlike a singly linked list where you can only move in one direction.


> Key Points to Remember:

1. Bidirectional Traversal: A doubly linked list can be traversed in both forward and backward directions.
2. Extra Memory Overhead: It requires extra memory due to the additional prev pointer in each node.
3. More Flexibility: Easier to implement deletion and insertion of nodes, especially from the middle of the list, since you have access to both the previous and next nodes.