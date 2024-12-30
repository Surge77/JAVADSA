package Sorting_Algorthms;

public class BubbleSort {

    public static void BubbleSort(int[] arr){

        int n = arr.length;

        for (int i = 0; i < n - 1; i++){
            boolean isSwapped = false; //this variable tracks whether we did any swap during the iteration or not
            //If we do not swap,and this remains false,that shows array is sorted
            for (int j = 0; j < n - i - 1; j++){
                //this loop goes in the unsorted starting part,and swaps adjacent elements to move bigger on the right side
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) return;
        }

    }

    public static void main(String[] args) {

        int[] arr = {14,2,54,-2,32,17,63};
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        BubbleSort(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
