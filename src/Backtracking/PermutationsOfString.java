package Backtracking;

//Given a string S, print all the permutations of this string
//A permutations is also called an "arrangement number" or order
//If the input string has n characters => then it would have n! permutations


public class PermutationsOfString {

    public static void main(String[] args) {

        PrintPermuations("abc","");

        PrintpermuatationBacktracking("abc",0,2); 

    }

    //Here we use Recursive approach
    private static void PrintPermuations(String que, String ans) {

        //Base case
        //Whenever we hit base case i.e. there are no more characters left in roq then we print the output string
        if (que.length() == 0){
            System.out.println(ans);
            return;
        }

        //self work
        for (int i=0; i< que.length(); i++){

            //substring method is used to extract a portion of a string.
            //Here 0 is beginning index and i is end  will extract string from 0 to i
            //roq => rest of question or rest of string
            String roq = que.substring(0, i) + que.substring(i + 1);
            // i = 0 -> bc
            // i = 1 -> a + c
            // i = 2 -> ab

            //Recursive call to a smaller problem
            PrintPermuations(roq,ans+ que.charAt(i));
        }
    }

    public static void PrintpermuatationBacktracking(String str,int l,int r){


        if (l == r) {
            System.out.println(str);
            return;
        }

        for (int i=l ; i <= r; i++ ){

            //do
            str = swap(str,l,i);

            //recurse
            PrintpermuatationBacktracking(str,l+1,r);

            //undo
            str = swap(str,l,i);
            //if we swap something again it will unswap it
        }


    }

    private static String swap(String a, int i, int j) {

        //Strings are immutable in java so we need to convert the string to array

        char temp;

        char [] arr = a.toCharArray(); // [a , b , c ]
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return String.valueOf(arr);

    }


}



