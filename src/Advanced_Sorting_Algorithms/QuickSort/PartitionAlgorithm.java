package Advanced_Sorting_Algorithms.QuickSort;


/**
 * Once we randomly pick a pivot element we do the following ->
 * In partition algorithm we segregate elements in the array into 2 parts such that left part
 * has all the elements less than pivot and right has all elements greater or equal to pivot.
 * Left and right parts may not be equal halves.
 * Order of the both halves don't matter
 * This partition algorithm is a part of quick sort
 */

public class PartitionAlgorithm {

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
    

    public static void main(String[] args) {

        int[] arr = {1,4,6,32,-5,91,2,9};
        int p = partition(arr,0,arr.length-1,5);

        for (int i = 0; i < arr.length; i++){

            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println(p);


    }
}
