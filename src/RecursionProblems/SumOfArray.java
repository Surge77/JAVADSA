package RecursionProblems;

//To find the sum of the array
//This question's logic is almost same as the MaxinArray problem

public class SumOfArray {

    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,1,1,1,1,1};
        System.out.println(Arrsum(arr,0));
        //This means we want to find the sum from index 0 to n - 1

    }

    public static int Arrsum(int[] arr, int idx) {

        if (idx == arr.length - 1) return arr[idx]; //if you are at the last index then it is your answer then we keep comparing backwards to get the sum of array
        return Integer.sum(arr[idx],Arrsum(arr,idx+1));
        //arr[index] is the current element and the later argument delegates the task to next element
        //Here integer.sum is method which returns the sum of its arguments
    }
}
