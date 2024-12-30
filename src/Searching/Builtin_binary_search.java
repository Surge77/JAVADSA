package Searching;
import java.util.Arrays;

public class Builtin_binary_search {

    public static void main(String[] args) {

        char vowels[] = {'a','e','i','o','u'};

        System.out.println(Arrays.binarySearch(vowels,'o'));


        int[] arr = {1,2,4,5,6,6,7};

        System.out.println(Arrays.binarySearch(arr,3));

        //Suppose if the element is not present in the array it returns the following
        // (- (insertionPoint) - 1) => ( -2 - 1 ) -> -3
        //insertion point is the position where the element would have been if present in array
    }
}
