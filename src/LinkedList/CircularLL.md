# Circular Linked List:

A Circular Linked List (CLL) is a variation of a linked list where the last node in the list points back to the first node, forming a circle. 
Unlike a traditional singly or doubly linked list, where the last node points to null,
in a circular linked list, the next pointer of the last node points to the head of the list. 
This enables continuous traversal through the list without reaching the end.


> There are two types of circular linked lists:

1. Singly Circular Linked List: In this version, each node has a single pointer (next) pointing to the next node, and the last node's next pointer points back to the head node.

2. Doubly Circular Linked List: In this version, each node has two pointers (next and prev), where next points to the next node, 
                                 and prev points to the previous node. The last node's next points to the head, and the head's prev points to the last node.