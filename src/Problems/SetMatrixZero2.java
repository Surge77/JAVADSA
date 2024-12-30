package Problems;

import java.util.*;

public class SetMatrixZero2 {

    //Here we will follow an Better approach
    //In the previous approach, we were marking the row and column with -1 while traversing the matrix.
    // Here we will reduce the time complexity by marking the cells after the traversal.
    
    //Approach (Using two extra arrays):

    //The steps are as follows:
    //First, we will declare two arrays: a row array of size N and a col array of size M and both are initialized with 0.
    //Then, we will use two loops(nested loops) to traverse all the cells of the matrix.
    //If any cell (i,j) contains the value 0, we will mark ith index of row array i.e. row[i] and jth index of col array col[j] as 1. It signifies that all the elements in the ith row and jth column will be 0 in the final matrix.
    //We will perform step 3 for every cell containing 0.
    //Finally, we will again traverse the entire matrix and we will put 0 into all the cells (i, j) for which either row[i] or col[j] is marked as 1.
    //Thus we will get our final matrix.

    /*
        Time Complexity: O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
        Reason: We are traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity.

        Space Complexity: O(N) + O(M), where N = no. of rows in the matrix and M = no. of columns in the matrix.
        Reason: O(N) is for using the row array and O(M) is for using the col array.
     */

    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] row = new int[n]; // row array
        int[] col = new int[m]; // col array

        // Traverse the matrix:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark ith index of row wih 1:
                    row[i] = 1;

                    // mark jth index of col wih 1:
                    col[j] = 1;
                }
            }
        }

        // Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
