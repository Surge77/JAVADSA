package Advanced_Sorting_Algorithms.MergeSort;

public class MergeSortAlternate {

    public static int[] mergetwoSortedArrays(int[] a, int [] b){

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


    public static int[] f(int[]arr,int start,int end){

        if (end == start){
            int[] res = new int[1];
            res[0] = arr[start];
            return res;
        }

        int mid = (start + end) / 2;
        int[] left = f(arr,start,mid);
        int[] right = f(arr,mid+1,end);
        return mergetwoSortedArrays(left ,right);


    }

    public static void mergesort(int[] arr){
        //This function does a merge sort on array from [start...end]
        /**
         * Time : O(nlogn)
         * Space : O(n)
         */

        int[] result = f(arr,0,arr.length-1);

        for (int i = 0; i < result.length; i++){
            arr[i] = result[i];
        }

    }

    public static void main(String[] args) {

        int[] arr = {21,5,2,9,34,12};
        mergesort(arr);

        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
