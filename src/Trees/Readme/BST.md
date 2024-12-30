# Binary Search Tree (BST);

A Binary Search Tree (BST) is a specialized tree data structure that maintains a specific order among its elements, which allows for efficient searching, insertion, and deletion operations

Properties of Binary Search Trees
The main properties of BSTs that define their structure and functionality are:

Ordering:

For each node:
All values in the left subtree are less than the node's value.
All values in the right subtree are greater than the node's value.
This property is maintained recursively for all nodes.
Uniqueness:

In a standard BST, each value is unique. However, variations exist (like allowing duplicates).
Null References:

Leaf nodes (nodes with no children) have null references for both left and right children.

### 2. Operations on Binary Search Trees

The primary operations on a BST include searching, insertion, deletion, and traversal.

#### 2.1 Searching

To search for a value in a BST, follow these steps:

1. Start at the root.
2. If the current node's value is equal to the target value, return the node.
3. If the target value is less than the current node's value, recursively search the left subtree.
4. If the target value is greater than the current node's value, recursively search the right subtree.

**Time Complexity**:

* Average case: O(log n)
* Worst case: O(n) (when the tree is unbalanced)

#### 2.2 Insertion

To insert a new value into a BST:

1. Start at the root.
2. If the value to insert is less than the current node's value, go to the left child; if greater, go to the right child.
3. When you find a null reference (the position where the new node should go), create a new node with the value and attach it there.

**Time Complexity**:

* Average case: O(log n)
* Worst case: O(n)

#### 2.3 Deletion

To delete a node from a BST, there are three main cases to consider:

1. **Node to delete is a leaf**: Simply remove it.
2. **Node to delete has one child**: Remove the node and link its parent to its child.
3. **Node to delete has two children**: Find the node’s in-order predecessor (maximum value in the left subtree) or in-order successor (minimum value in the right subtree). Replace the node's value with that of the predecessor/successor, then delete the predecessor/successor node.

**Time Complexity**:

* Average case: O(log n)
* Worst case: O(n)

#### Traversal

There are several ways to traverse a BST, each with its own use cases:

1. **In-order Traversal**: Visits nodes in ascending order.
   * Left subtree → Current node → Right subtree
   * Time Complexity: O(n)


**Pre-order Traversal**: Useful for copying the tree.

* Current node → Left subtree → Right subtree
* Time Complexity: O(n)


**Post-order Traversal**: Useful for deleting the tree.

* Left subtree → Right subtree → Current node
* Time Complexity: O(n)
