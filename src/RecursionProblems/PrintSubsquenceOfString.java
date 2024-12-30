package RecursionProblems;

//Given a string S, print all possible subsequences of the string.Order of the
//Output doesn't matter for eg : S = "abc"
//"abc" , "ab" , "ac" , "bc" , "a" , "b" , "c" , ""

public class PrintSubsquenceOfString {

    public static void main(String[] args) {

        String str = "abc";

        SubseqRecursive(str,0,"");

    }

    private static void SubseqRecursive(String str, int idx, String output) {

        //Base case
        if (idx == str.length()){
            System.out.println(("[" + output + "]")); // "[" + output + " ]" => We use this for printing in square brackets
            return;
        }
        //Here the approach is we always have two choices for the character whether to include or not include it
        //So we keep delegating the task till an empty string
        //Recursive call
        SubseqRecursive(str,idx+1,output+str.charAt(idx)); //We include character
        SubseqRecursive(str,idx+1,output); //We exclude character and print the output as it is
    }
}
