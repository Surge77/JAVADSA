package Advanced_Sorting_Algorithms.MergeSort;

/**
 * This is our recurrence of merge sort
 * f(arr,start,end) = f(arr,start,mid) => f(arr,mid+1,end) => merge(arr,start,mid,end)
 */

public class MergeSortUnsortedList {

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

    public static void merge(int[] arr, int start,int mid , int end){

        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];

        int k = 0;
        for (int i = start ; i <= mid ; i++){
            left[k++] = arr[i];
        }

        k = 0;
        for (int i = mid+1; i <= end; i++){
            right[k++] = arr[i];
        }

        int[] res = mergetwoSortedArrays(left,right);

        k = 0;
        for (int i = start; i <= end; i++ ){

            arr[i] = res[k++];
        }


    }

    //Recursive function to sort the array by further dividing it
    public static void f(int[] arr,int start, int end){
        if (end == start) return; // case in which there is single or no element

        int mid = (start + end) / 2;
        f(arr,start,mid); //recursive call to sort left half of array
        f(arr,mid+1,end); //recursive call to sort right half
        merge(arr,start,mid,end);
    }

    public static void mergesort(int[] arr){
        f(arr,0,arr.length - 1);

    }


    public static void main(String[] args) {

        int[] arr = {3,-3,12,9,124,32,9,3,6,46,16};
        mergesort(arr);

        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
