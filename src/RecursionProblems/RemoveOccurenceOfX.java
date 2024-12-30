package RecursionProblems;

//Given a string S of alphabets, write a function recursively that prints a new string which
//has all character of S except any occurrence of 'x'

public class RemoveOccurenceOfX {

    public static void main(String[] args) {

        String str = "abcxxadxacexe";

        RemoveX(str,0);
    }

    private static void RemoveX(String str, int idx) {

        //Base case
        if (idx >= str.length()) return;

        if (str.charAt(idx) != 'x') //self-work
            System.out.print(str.charAt(idx));
        RemoveX(str,idx+1); //recursive call

    }
}
