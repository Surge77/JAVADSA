package Searching;

/*
  Complexity Analysis =>

  Time Complexity:
  Best Case: O(1) – when the target is the middle element.
  Average Case: O(log n) – the search space is halved with each iteration.
  Worst Case: O(log n) – occurs when the target is not present.

  Space Complexity:
  O(1) for the iterative approach, as it uses a constant amount of space.
  O(log n) for the recursive approach due to the call stack.

 */

/**
 * Binary search is an efficient algorithm for finding a target value in a sorted array by repeatedly dividing the search interval in half.
 *  It starts with two pointers, left and right, and calculates the middle index, comparing the middle element with the target.
 * If the target is less than the middle element, the search continues in the left half; if greater,
 * it continues in the right half, until the target is found or the search space is exhausted.
 */

/*
  -> Conditions for applying binary search:

  If we are applying binary search on array or function it should be a monotonic function

  Monotonicity => The monotonicity of a function tells if a function is increasing or decreasing

  Monotonic function => Function is increasing on its entire domain or it is decreasing on its entire domain

  Non-monotonic function => It is function which is increasing or decreasing in different intervals of time
 */
public class Binary_search {

    public static void main(String[] args) {

        //Always input a sorted array for binary search
        int[] arr = {2, 7, 9, 12, 28, 43, 51, 98};

        System.out.println(BinarySearch(arr,2));

    }

    public static int BinarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){

            int mid = (left + right) / 2; // This should be inside loop to update the values of mid after every iteration

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] < target ) {

                left = mid + 1;

            }else {
                right = mid - 1;
            }
        }
        return -1 ;


    }


}
