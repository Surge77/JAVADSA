package Sorting_Algorthms;

public class SelectionSort {

    //This function returns the index of the minimum element in arr in the range(start , n-1)
    //[1,2,3,4,9,6,8,5,4,9] -> start = 3 minIndex = 7, i  = 8
    public static int GetMinimumIndex(int[] arr, int start) {
        int minIndex = start; // Initially we assume that the start index has the minimum value
        for (int i = start + 1; i < arr.length; i++) {
            // we go in the remaining array from [start+1 , n-1]
            if (arr[i] < arr[minIndex]) {
                //compare if current element is better than the last found minimum element
                minIndex = i;
            }

        }
        return minIndex;
    }

    //This function applies selection sort on the given array and arranges element in increasing order
    public static void SelectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = GetMinimumIndex(arr, i); //get the minimum element from unsorted region i.e [i, n-1]
            //This is just plane swapping
            if (i != minIndex) { // if ith element is the min don't swap i.e if the element is same no need to swap
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }

    }

    public static void main(String[] args) {

        int[] arr = {14,2,54,-2,32,17,63};
        SelectionSort(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}