package Trees;

public class BST {

    // TreeNode class representing each node of the BST
    class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    private TreeNode root;

    // Constructor to initialize the BST
    public BST() {
        root = null;
    }

    // Insert a new value into the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Helper function to recursively insert a value in the BST
    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);  // Create a new node if root is null
            return root;
        }

        // Otherwise, recur down the tree
        if (value < root.val) {
            root.left = insertRec(root.left, value);
        } else if (value > root.val) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    // Search for a value in the BST
    public boolean search(int value) {
        return searchRec(root, value);
    }

    // Helper function to recursively search for a value in the BST
    private boolean searchRec(TreeNode root, int value) {
        if (root == null) {
            return false;  // Value not found
        }

        if (root.val == value) {
            return true;  // Value found
        }

        if (value < root.val) {
            return searchRec(root.left, value);  // Search in the left subtree
        } else {
            return searchRec(root.right, value);  // Search in the right subtree
        }
    }

    // Delete a value from the BST
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    // Helper function to recursively delete a value from the BST
    private TreeNode deleteRec(TreeNode root, int value) {
        if (root == null) {
            return null;
        }

        // Traverse the tree to find the node to be deleted
        if (value < root.val) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.val) {
            root.right = deleteRec(root.right, value);
        } else {
            // Node to be deleted is found

            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.val = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.val);
        }

        return root;
    }

    // Find the minimum value in a given subtree
    private int minValue(TreeNode root) {
        int minVal = root.val;
        while (root.left != null) {
            root = root.left;
            minVal = root.val;
        }
        return minVal;
    }

    // In-order Traversal (Left -> Node -> Right)
    public void inOrderTraversal() {
        inOrderRec(root);
    }

    // Helper function for in-order traversal
    private void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.val + " ");
            inOrderRec(root.right);
        }
    }

    // Pre-order Traversal (Node -> Left -> Right)
    public void preOrderTraversal() {
        preOrderRec(root);
    }

    // Helper function for pre-order traversal
    private void preOrderRec(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Post-order Traversal (Left -> Right -> Node)
    public void postOrderTraversal() {
        postOrderRec(root);
    }

    // Helper function for post-order traversal
    private void postOrderRec(TreeNode root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.val + " ");
        }
    }
}


