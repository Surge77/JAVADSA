package Trees.Problems;
import java.util.*;

// Given a binary tree, find the path from the root to any node in the tree

/***
 * To be able to find the path, the node should be present in the tree.
 * We are going to take an ArrayList which we will fill with the answer.
 * While checking the path, we also simultaneously fill the ArrayList.
 */

public class PathFindingSolution {

    // Method to find the path from the root to a target node in the binary tree
    public List<Integer> findPath(TreeNode root, int target) {
        List<Integer> path = new ArrayList<>();

        // If the helper function finds the target node, the path will be filled, otherwise path remains empty
        findPathHelper(root, target, path);

        return path;  // Return the path (empty if target is not found)
    }

    // Helper function to find the path
    private boolean findPathHelper(TreeNode node, int target, List<Integer> path) {
        if (node == null) {
            return false;  // Return false if the current node is null
        }

        // Add the current node's value to the path
        path.add(node.val);

        // If the current node is the target, return true
        if (node.val == target) {
            return true;
        }

        // Recursively check if the target is in the left or right subtree
        if (findPathHelper(node.left, target, path) || findPathHelper(node.right, target, path)) {
            return true;  // If target is found in either subtree, return true
        }

        // Backtrack by removing the current node if target not found in this path
        path.remove(path.size() - 1);
        return false;  // Return false if the target is not found in this path
    }

    // Definition for a binary tree node
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Driver method for testing
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

        PathFindingSolution solution = new PathFindingSolution();
        int target = 5;

        // Find the path from the root to the target node
        List<Integer> path = solution.findPath(root, target);

        // Print the path
        System.out.println("Path to node " + target + ": " + path);
    }
}
