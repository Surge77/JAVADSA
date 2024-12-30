package Trees;

//The Client class shows how the tree works by performing basic operations.

public class BinaryTreeClient {
    public static void main(String[] args) {

        // Create an instance of BinaryTree
        BinaryTree tree = new BinaryTree();

        // Insert nodes into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Perform inorder traversal (left, root, right)
        System.out.print("Inorder traversal: ");
        tree.inorder();  // Output: 20 30 40 50 60 70 80
        System.out.println();

        // Perform preorder traversal (root, left, right)
        System.out.print("Preorder traversal: ");
        tree.preorder(); // Output: 50 30 20 40 70 60 80
        System.out.println();

        // Perform postorder traversal (left, right, root)
        System.out.print("Postorder traversal: ");
        tree.postorder(); // Output: 20 40 30 60 80 70 50
        System.out.println();

        System.out.println(tree.findElement(tree.root,40));

        System.out.println(tree.height(tree.root));
    }
}
