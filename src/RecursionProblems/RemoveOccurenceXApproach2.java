package RecursionProblems;


//Given a string S of alphabets, write a function recursively that prints a new string which
//has all character of S except any occurrence of 'x'

public class RemoveOccurenceXApproach2 {

    public static void main(String[] args) {

        String str = "abcxxadxacexe";
//        String output = "";

        RemoveX(str,0,"");
    }

    //This approach takes an output as an argument and prints it in the base case itself
    private static void RemoveX(String str, int idx,String output) {

        //Base case
        if (idx >= str.length()) {
            System.out.println(output);
            return;
        }

        //Self work
        if (str.charAt(idx) != 'x')
            RemoveX(str,idx+1,output + str.charAt(idx)); //Here we append the character in the output
        else{
            RemoveX(str,idx+1,output); //If it is x then we do nothing
        }


    }
}
