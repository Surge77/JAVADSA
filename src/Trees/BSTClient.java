package Trees;

import java.util.Scanner;

public class BSTClient {
    public static void main(String[] args) {
        BST bst = new BST();  // Create an instance of the Binary Search Tree
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Binary Search Tree Operations ---");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. In-order Traversal");
            System.out.println("5. Pre-order Traversal");
            System.out.println("6. Post-order Traversal");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertVal = scanner.nextInt();
                    bst.insert(insertVal);
                    System.out.println(insertVal + " inserted.");
                    break;
                case 2:
                    System.out.print("Enter value to search: ");
                    int searchVal = scanner.nextInt();
                    boolean found = bst.search(searchVal);
                    if (found) {
                        System.out.println(searchVal + " found in the BST.");
                    } else {
                        System.out.println(searchVal + " not found in the BST.");
                    }
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    int deleteVal = scanner.nextInt();
                    bst.delete(deleteVal);
                    System.out.println(deleteVal + " deleted if it was in the tree.");
                    break;
                case 4:
                    System.out.println("In-order Traversal:");
                    bst.inOrderTraversal();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Pre-order Traversal:");
                    bst.preOrderTraversal();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Post-order Traversal:");
                    bst.postOrderTraversal();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
