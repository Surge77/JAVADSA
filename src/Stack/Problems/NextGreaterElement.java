package Stack.Problems;
import java.util.*;

/***
 * Problem : Next Greater Element
 *
 * Find the first greater element on the right side of every element
 * Eg : 4,5,2,25
 * output : 5,25,25,-1
 *
 * The brute force approach can be we keep a i pointer and iterate from the i+1 index to find the next greater element and just stop there and add
 * This solution has TC of O(n^2)
 * SC is O(1)
 *
 * Approach 2:
 */

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] arr = {4,5,2,25};
        int[] result = nge(arr);

        for(int num: result){
            System.out.print(num+" ");
        }
    }

    private static int[] nge(int[] arr){

        int n = arr.length;

        int[] output = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(0);

        for(int i=0; i< n; i++){

            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                output[st.peek()] = arr[i];
                st.pop();
            }

            st.push(i);
        }


        while (!st.isEmpty()){

            int topidx = st.peek();
            output[topidx] = -1;
            st.pop();
        }

        return output;
    }


}
