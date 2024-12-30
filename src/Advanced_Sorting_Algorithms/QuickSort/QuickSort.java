package Advanced_Sorting_Algorithms.QuickSort;

/**
 * Once we randomly pick a pivot element we do the following ->
 * In partition algorithm we segregate elements in the array into 2 parts such that left part
 * has all the elements less than pivot and right has all elements greater or equal to pivot.
 * Left and right parts may not be equal halves.
 * This partition algorithm is a part of quick sort
 * After partitioning the array into two we recursively repeat the same process for the both halves until the array gets sorted
 */

public class QuickSort {

    public static void swap(int[] arr, int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static int partition(int[] arr, int l, int r, int pi){

        int pivot = arr[pi];  // remember our pivot element
        swap(arr,pi,r); // store the pivot element at last index
        int m = l;
        for (int i=l; i <= r - 1; i++){

            if (arr[i] < pivot){
                swap(arr,i,m);
                m++;
            }
        }
        swap(arr,m,r);
        return m;
    }

    public static int getRandom(int l, int r){
        return (int)((Math.random()*(r-l)) + l);
    }


    public static void f(int[] arr, int l, int r){

        if (l > r) return;
        int pi = getRandom(l,r);
        int x = partition(arr,l,r,pi);
        f(arr,l,x-1); // recursively applying to left side
        f(arr,x+1,r); // .... to right side

    }

    public static void quicksort(int[] arr){

        f(arr,0,arr.length - 1);


    }

    public static void main(String[] args) {

        int[] arr = {1,4,6,32,-5,91,2,9};
        quicksort(arr);

        for (int i = 0; i < arr.length; i++){

            System.out.print(arr[i] + " ");
        }

    }
}
