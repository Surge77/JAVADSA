# Trees 

- Unlike other data structures like stack,linked list,queue,Hashmaps,Array which store data linearly or continuous manner
- Trees store the data in hierarchical manner
- Trees are also called as recursive data structure

A tree is a widely used abstract data structure that simulates a hierarchical tree structure with a set of nodes, where each node has a value, and nodes are connected by edges. 
Trees are used to represent hierarchical relationships, and they have many important applications in computer science.

### Key Concepts of Trees:

- Node: A node in a tree is a basic element that contains a value or data, and links (references) to other nodes (children).
Every node in a tree has a parent node (except the root) and zero or more child nodes.

- Root: The root is the topmost node in a tree. It is the starting point of the tree, and it has no parent.
In a tree, there is only one root node.

- Child: A child node is any node that is directly connected to another node when moving away from the root.

- Parent: A parent node is one that has one or more child nodes.

- Edge: An edge is a link between two nodes, typically from a parent to a child. It represents the relationship between nodes.

- Leaf (External Node): A leaf is a node that has no children (i.e., it is at the bottom level of the tree).

- Subtree: A subtree is a portion of a tree that is itself a tree. A node and all of its descendants form a subtree.

- Depth: The depth of a node is the number of edges from the root node to that node. The root node has a depth of 0.
To imagine depth draw a flat line above root node.The root node is now at depth zero and so on.. as we go down the tree

- Height: The height of a node is the number of edges on the longest path from that node to a leaf. The height of a tree is the height of the root node.
To visualize height remember that we always measure height from the ground i.e from the leaf node, the leaf node has the height 0 and the root node has the maximum height

- Level: The level of a node represents the depth of that node plus 1. So, the root is at level 1, its children are at level 2, and so on.
depth of node + 1 = level

## Types of Binary trees :

- Binary Tree: A binary tree is a tree in which each node has at most two children, referred to as the left child and right child.

- Binary Search Tree (BST): A binary search tree is a binary tree with a specific property: for any given node, the values of all nodes in its left subtree are less than the node’s value, and the values of all nodes in its right subtree are greater.
This property makes searching efficient.

- Balanced Tree: A balanced tree is a tree where the height difference between the left and right subtrees of any node is small (often by at most 1). Examples include AVL trees and Red-Black trees.
Balanced trees ensure that operations like searching, insertion, and deletion are efficient (usually O(log n)).

- Complete Binary Tree: A complete binary tree is a binary tree where all levels, except possibly the last, are completely filled, and all nodes are as far left as possible.

- Full Binary Tree: A full binary tree is a binary tree where every node has either 0 or 2 children. No node has only one child.

- Perfect Binary Tree: A perfect binary tree is a binary tree where all internal nodes have exactly two children, and all leaf nodes are at the same level.

- N-ary Tree: An N-ary tree is a tree where each node can have up to N children. A binary tree is a specific case of an N-ary tree where N = 2.

### A Trivial Question:

Q -> What is the maximum no of nodes at level 'l' of a binary tree
Ans -> 2 ^ (l-1)