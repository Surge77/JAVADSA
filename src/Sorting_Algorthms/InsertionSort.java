package Sorting_Algorthms;

public class InsertionSort {

    public static void insertionSort(int[] arr){

        for (int i = 1; i < arr.length; i++){

            int currElement = arr[i];
            int j = i - 1; //we want to go on the left side of i and insert currElement at it's correct position

            while (j >= 0 && arr[j] > currElement){
                arr[j+1] = arr[j]; // shifting the elements
                j--;
            }
            arr[j+1] = currElement;
        }
    }

    public static void main(String[] args) {

        int[] arr = {14,2,54,-2,32,17,63};
        insertionSort(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
