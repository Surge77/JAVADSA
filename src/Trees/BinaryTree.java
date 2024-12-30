package Trees;

//The BinaryTree class defines the tree operations like insertion and traversal.

// BinaryTree class to manage the tree and its operations
public class BinaryTree {

    TreeNode root;  // Root node of the tree

    // Constructor to initialize an empty binary tree
    public BinaryTree() {
        root = null;
    }

    // Method to insert a new node into the binary tree
    public void insert(int data) {
        root = insertRec(root, data);  // Recursive insert method
    }

    // Recursive function to insert a new value in the binary tree
    private TreeNode insertRec(TreeNode root, int data) {
        // Base case: If the tree is empty, create a new node
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        // Otherwise, recur down the tree
        if (data < root.data) {
            root.left = insertRec(root.left, data);  // Insert into the left subtree, if data is less than root node
        } else if (data > root.data) {
            root.right = insertRec(root.right, data); // Insert into the right subtree, if data is greater than root node
        }

        // Return the unchanged root pointer
        return root;
    }

    // Method to perform inorder traversal (left, root, right)
    public void inorder() {
        inorderRec(root);  // Helper method to start the traversal from the root
    }

    // Recursive method for inorder traversal
    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);           // Visit left subtree
            System.out.print(root.data + " "); // Print the root node's data
            inorderRec(root.right);          // Visit right subtree
        }
    }

    // Method to perform preorder traversal (root, left, right)
    public void preorder() {
        preorderRec(root);
    }

    // Recursive method for preorder traversal
    private void preorderRec(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " "); // Print root node
            preorderRec(root.left);            // Visit left subtree
            preorderRec(root.right);           // Visit right subtree
        }
    }

    // Method to perform postorder traversal (left, right, root)
    public void postorder() {
        postorderRec(root);
    }

    // Recursive method for postorder traversal
    private void postorderRec(TreeNode root) {
        if (root != null) {
            postorderRec(root.left);           // Visit left subtree
            postorderRec(root.right);          // Visit right subtree
            System.out.print(root.data + " "); // Print root node
        }
    }

    // Method to search for an element in the binary tree
    public boolean findElement(TreeNode node, int target) {
        // Base case: if the node is null, element is not found
        if (node == null) {
            return false;
        }

        // Check if the current node's data matches the target
        if (node.data == target) {
            return true;
        }

        // Recursively search in the left and right subtrees
        boolean foundInLeftSubtree = findElement(node.left, target);
        boolean foundInRightSubtree = findElement(node.right, target);

        // Return true if found in either subtree
        return foundInLeftSubtree || foundInRightSubtree;
    }

    // Function to calculate the height of the binary tree
    public int height(TreeNode node) {
        // Base case: if the tree is empty, return -1
        if (node == null) {
            return -1;
        }

        // Recursively find the height of the left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Return the maximum of leftHeight and rightHeight plus 1
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
