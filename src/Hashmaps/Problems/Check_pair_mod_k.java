package Hashmaps.Problems;
import java.util.*;

//Given an integer array and a number k, return true/false if the given array can be divided
//into pairs such that sum of every pair is divisible by k.
//Suppose the array is [9,7,5,3] and k = 6
//output -> true (9,3) -> 12 % k is completely divisible
// similarly (7,5) -> 12 % k is completely divisible
//This problem will require a bit of math

public class Check_pair_mod_k {

    public static void main(String[] args) {

        int[] arr = {20, 25, 10, 3, 15, 27};

        // Test if the array can be divided into pairs where the sum of each pair is divisible by 10
        System.out.println(canMakePair(arr, 10));
    }

    //SC -> O(k)
    //TC -> O(n + k)
     private static boolean canMakePair(int[] arr, int k) {

        // Array to store the frequency of each remainder when elements are divided by k
        int[] freq = new int[k];

        // Iterate through each element in the array
        for (int num : arr) {
            // Calculate the remainder when the element is divided by k
            num = num % k;

            // If the remainder is negative, convert it to a positive equivalent
            if (num < 0) num += k;

            // Increase the frequency count for this remainder
            freq[num]++;
        }

        // Check if the frequency of remainder 0 is even, as pairs must sum to be divisible by k
        if (freq[0] % 2 != 0) return false;

        // Check pairs of remainders from 1 up to k/2
        for (int i = 1; i <= k / 2; i++) {
            // Ensure the frequency of remainder i matches that of remainder (k - i)
            // For instance, if k = 10, remainder 3 must pair with remainder 7, and so on
            if (freq[i] != freq[k - i]) return false;
        }

        // If all conditions are satisfied, return true (indicating pairs can be formed)
        return true;
    }
}
