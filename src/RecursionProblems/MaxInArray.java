package RecursionProblems;

import java.util.*;
//Given an array calculate the maximum element of the array
public class MaxInArray {

    public static int MaxinArr(int[] arr,int idx) { //array and index are two parameters

        //Base case
        if (idx == arr.length - 1) return arr[idx]; //if you are at last index it is your answer and after that we keep comparing backwards for the greatest element
        return Math.max(arr[idx],MaxinArr(arr,idx+1)); // MaxinArr(arr,idx+1) ->here we delegated the task to find the maximum in the remaining elements
        //max() is an inbuilt method in Java which is used to return Maximum or Largest value from the given two arguments.
        //Above arr[idx] and MaxinArr(arr,idx+1) are the two arguments of max method

    }

    public static void main(String[] args) {

        int[] arr = {21,3,-3,-12,100,-90,65,12,31,9};

        System.out.println(MaxinArr(arr,0));
        //This means we want to find the greatest element from 0 to the last index

    }


}
