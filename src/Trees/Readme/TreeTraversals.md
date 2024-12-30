# Tree Traversals:

Tree traversal is a fundamental operation in tree data structures.
It refers to the process of visiting (or accessing) each node in a tree data structure, exactly once, in a specific order.
Tree traversal is essential for various operations such as searching, printing, or modifying the data contained in the tree.

There are mainly two categories of tree traversals:

### Depth-First Traversal (DFT): Explores as far as possible along each branch before backtracking.

- Inorder Traversal
- Preorder Traversal
- Postorder Traversal

### Breadth-First Traversal (BFT): Explores all nodes at the present depth before moving on to the nodes at the next depth level.

- Level Order Traversal

---

### Depth-First Traversal (DFT):

a) Inorder Traversal (Left, Root, Right) :

In inorder traversal, the nodes are visited in the following order:

1. Traverse the left subtree.
2. Visit the root (current node).
3. Traverse the right subtree.

This traversal is mostly used in binary search trees (BSTs) because it visits the nodes in sorted order.

---

b) Preorder Traversal (Root, Left, Right)

In preorder traversal, the nodes are visited in this order:

1. Visit the root (current node).
2. Traverse the left subtree.
3. Traverse the right subtree.

Preorder traversal is useful when you need to process the root node first before dealing with its children. It’s often used for tasks like copying trees or expression evaluation.

---

c) Postorder Traversal (Left, Right, Root) :

In postorder traversal, the nodes are visited in the following order:

1. Traverse the left subtree.
2. Traverse the right subtree.
3. Visit the root (current node).

Postorder traversal is useful in situations where you need to process children before their parent, like deleting nodes or evaluating postfix expressions.

---

### Breadth-First Traversal (BFT):

Level-Order Traversal (Breadth-First):

In level-order traversal, nodes are visited level by level starting from the root. First, the root node is visited, then its children,then the children’s children, and so on. It’s done using a queue data structure because you need to process nodes in the order they were encountered.

Level-order traversal is useful for finding the shortest path in unweighted trees and for searching nodes layer by layer.

How BFS Works Using a Queue:

- Start at the root (or starting node) of the tree or graph, enqueue it, and mark it as visited.
- Dequeue the front element from the queue (this is the current node).
- Process the current node (e.g., print its value or check for some condition).
- Enqueue all unvisited adjacent nodes (children of the current node in the case of a tree, or connected nodes in the case of a graph).
- Repeat the process until the queue is empty, which means all nodes have been visited.

> Why Queue is Used in BFS?

- FIFO Principle: BFS needs to visit all nodes level by level (i.e., breadth-first), which is naturally supported by a queue's FIFO property.
- Maintaining Order: When visiting a node, its children need to be processed after the current node, so they are enqueued. The first node that was enqueued is processed first, ensuring correct traversal.

Tree traversals are essential for accessing all nodes in a tree structure. Each traversal has different use cases depending on the order in which nodes need to be processed.
Inorder traversal is especially useful for binary search trees, as it visits nodes in sorted order.
Preorder and postorder are useful for tasks where you need to process the root first or last, while level-order traversal is useful for operations involving breadth-first exploration.
