package Advanced_Sorting_Algorithms.MergeSort;

public class MergeSort {

    /**
     *
     * Time complexity : O(n + m)
     * Space complexity : O(1)
     *
     */
    //The function merges two given sorted arrays of different length
    public static int[] merge(int[] a, int [] b){

        int n = a.length; // i pointer for tracking this array
        int m = b.length; // j pointer for tracking this array
        int i = 0, j = 0, k = 0;
        int[] result = new int[n + m]; //creates an array of length n + m
        //k pointer for tracking result array which is the merged array

        while (i < n && j < m){
            if (a[i] < b[j]){
                result[k++] = a[i++];
            }else{
                result[k++] = b[j++];
            }
        }

        //if b gets exhausted
        while (i < n){
            result[k++] = a[i++];
        }

        //if a gets exhausted
        while(j < m){
            result[k++] = b[j++];
        }

        return result;

    }

    public static void main(String[] args) {

        int[] a = {1,3,5,7,8,9,11,16,20};
        int[] b = {2,4,7,10,25};
        int[] result = merge(a,b);

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }




    }
}
