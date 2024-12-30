package Problems;

import java.util.*;
//The line import java.util.*;
// is a directive in Java used to include all the classes and interfaces from the java.util package in your program.

public class SetMatrixZero1 {

        //We are given and nXm matrix which can be equal or unequal
        //The matrix contains only 1 and 0 i.e it is a  and binary matrix
        //In the matrix once we find out zeroes we go to the corresponding row and column and mark everyone as 0
        //Note:From the marked zeroes we do not do anything on them
        //We perform operation only on zeroes from original matrix
        //Three approaches Brute force => better => optimal
        //Let us see brute force approach
        //In brute force method we traverse through each element and when we find 0 then we mark every element in that
        //corresponding row and column as -1 as converting them directly to zero can lead to error and confusion
        //then after marking -1 everywhere we convert every -1 to zero
        //The time complexity of brute force method is not very good

    /*
        The steps are the following:

        First, we will use two loops(nested loops) to traverse all the cells of the matrix.
        If any cell (i,j) contains the value 0, we will mark all cells in row i and column j with -1 except those which contain 0.
        We will perform step 2 for every cell containing 0.
        Finally, we will mark all the cells containing -1 with 0.
        Thus the given matrix will be modified according to the question.
        Note: Here, we are assuming that the matrix does not contain any negative numbers.
         But if it contains negatives, we need to find some other ways to mark the cells instead of marking them with -1.
     */

     /*
        Time Complexity: O((N*M)*(N + M)) + O(N*M), where N = no. of rows in the matrix and M = no. of columns in the matrix.
        Reason: Firstly, we are traversing the matrix to find the cells with the value 0. It takes O(N*M). Now, whenever we find any such
        cell we mark that row and column with -1. This process takes O(N+M). So, combining this the whole process, finding and marking, takes O((N*M)*(N + M)).
        Another O(N*M) is taken to mark all the cells with -1 as 0 finally.

        Space Complexity: O(1) as we are not using any extra space.
     */

    static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
        // set all non-zero elements as -1 in the row i:
        for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        // set all non-zero elements as -1 in the col j:
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // Set -1 for rows and cols that contains 0. Don't mark any 0 as -1:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    markRow(matrix, n, m, i);
                    markCol(matrix, n, m, j);
                }
            }
        }
        // Finally, mark all -1 as 0:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
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







    

