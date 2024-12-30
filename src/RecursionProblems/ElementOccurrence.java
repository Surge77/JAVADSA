package RecursionProblems;

//Given an array and an element x,find the index where the first occurrence of x is, return -1 if no occurrence
public class ElementOccurrence {

    public static void main(String[] args) {

        int[] arr = {21,3,-3,-12,100,-90,65,12,31,9};
        int x = 98;
        System.out.println(FirstIndex(arr,0,x));



    }

    private static int FirstIndex(int[] arr, int idx, int x) {

        if (idx == arr.length) return -1;
        return (arr[idx] == x ) ? idx : FirstIndex(arr,idx+1,x);
        //This is a ternary operator i.e if arr[idx] == x is true we return idx then it compares if it's false then returns
        //FirstIndex(arr,idx+1,x)

    }
}
