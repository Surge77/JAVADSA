package Trees;

//The TreeNode class defines the structure of the nodes in the tree

// TreeNode class representing a single node in the tree
public class TreeNode {
    int data;         // Data value stored in the node
    TreeNode left;    // Reference to the left child node
    TreeNode right;   // Reference to the right child node

    // Constructor to initialize a node with a data value
    public TreeNode(int data) {
        this.data = data;
        this.left = null;  // Initialize the left child as null
        this.right = null; // Initialize the right child as null
    }
}
