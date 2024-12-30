package Trees.Problems;
import java.util.*;

/***
 * To find the distance between two nodes a and b in a binary tree, you can break the problem into three steps:
 *
 * Find the Lowest Common Ancestor (LCA) of the two nodes.
 * Find the distance from the LCA to a and from the LCA to b.
 * Add both distances to get the total distance between a and b
 *
 *
 * findLCA: This function finds the Lowest Common Ancestor (LCA) of two nodes a and b. The LCA is the deepest node that is an ancestor of both a and b.
 * findLevel: This function finds the distance (level) from the given root to the target node by traversing the tree and counting the levels.
 * findDistance: This function calculates the total distance between nodes a and b by first finding the LCA and then adding the distances from the LCA to a and from the LCA to b.
 */

class DistanceBwTwoNodes {

    // Method to calculate the distance between two nodes a and b
    public int findDistance(TreeNode root, TreeNode a, TreeNode b) {
        // Step 1: Find the Lowest Common Ancestor (LCA) of nodes a and b
        TreeNode lca = findLCA(root, a, b);

        // Step 2: Find the distance from the LCA to node a
        int distA = findLevel(lca, a, 0);

        // Step 3: Find the distance from the LCA to node b
        int distB = findLevel(lca, b, 0);

        // Step 4: The total distance between a and b is the sum of distA and distB
        return distA + distB;
    }

    // Helper function to find the Lowest Common Ancestor (LCA) of two nodes
    private TreeNode findLCA(TreeNode root, TreeNode a, TreeNode b) {
        if (root == null || root == a || root == b) {
            return root;
        }
        TreeNode left = findLCA(root.left, a, b);
        TreeNode right = findLCA(root.right, a, b);

        // If both left and right are non-null, this is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null result
        return left != null ? left : right;
    }

    // Helper function to find the distance between two nodes, starting from a given node
    // It returns the level (distance from the root) of the target node
    private int findLevel(TreeNode root, TreeNode target, int level) {
        if (root == null) {
            return -1;
        }
        if (root == target) {
            return level;
        }

        // Search in the left subtree
        int left = findLevel(root.left, target, level + 1);
        if (left != -1) {
            return left;
        }

        // Search in the right subtree
        return findLevel(root.right, target, level + 1);
    }

    // Driver code to test the implementation
    public static void main(String[] args) {
        // Create a sample binary tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        DistanceBwTwoNodes solution = new DistanceBwTwoNodes();
        TreeNode a = root.left.left;  // Node 4
        TreeNode b = root.left.right; // Node 5

        // Find the distance between node 4 and node 5
        int distance = solution.findDistance(root, a, b);

        // Output the distance
        System.out.println("Distance between node 4 and node 5: " + distance);
    }
}

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
