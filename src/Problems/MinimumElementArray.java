package Problems;


public class MinimumElementArray {

    public static void main(String[] args) {

        //Given an array find the minimum element

        int[] arr = {10,20,30,40,50};

        minimumElement(arr);


    }

    public static void minimumElement(int[] arr){

        int min = Integer.MAX_VALUE; //will give the max value in the array

        for (int i = 0; i < arr.length; i++){

            if (arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
