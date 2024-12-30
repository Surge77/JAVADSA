package RecursionProblems;

//Problem link : https://leetcode.com/problems/house-robber/description/
//We have solved this using recursion but this requires an optimised solution thorough dynamic programming

public class HouseRobberLeetcode198 {

    public static void main(String[] args) {

        int[] arr = {3,1,1,9};

        System.out.println(HRobber(arr,0));
    }

    private static int HRobber(int[] arr, int idx) {

        if (idx >= arr.length) return 0;
        return Math.max(arr[idx] + HRobber(arr,idx+2), 0 + HRobber(arr,idx+1));
        //Here we have two choice either we rob or not rob for each house
        //If we rob the house the case would be arr[idx] + HRobber(arr,idx+2)
        //If we don't rob then there will be no profit so the case would be 0 + HRobber(arr,idx+1)
        //If we exceed the index then naturally there won't be any profit
    }
}
