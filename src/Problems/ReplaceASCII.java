package Problems;

public class ReplaceASCII {

    public static void main(String[] args) {

        //Suppose we are given a string str = "cdEfG"
        //The output for the above input will be str = "dcFeH"
        //Here what happened is for even index the character is incremented i.e next alphabet is replaced
        //And for odd index we decrement the ascii value i.e we replace the char with previous alphabet
        //The output letter must be capital if input letter is capital and small if it is small
        //Another simple example can be if the input is "dd" then the output will be "ec"
        //Here StringBuilder concept can be used as we are building up the string

        System.out.println(Replace_Ascii("cdEfG"));


    }

    private static String Replace_Ascii(String str) {

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++){

            char ch = sb.charAt(i);

            if (i % 2 == 0 ){

                ch = (char)(ch + 1); //Here we do the typecasting to char and reassign it back to ch
                sb.setCharAt(i,ch); //setCharAt(int index, char ch) is a method of the StringBuilder and StringBuffer classes
                //It's used to modify a character at a specific index within the StringBuilder or StringBuffer object.
            }
            else{
                ch = (char)(ch - 1); //Here we do the typecasting to char and reassign it back to ch
                sb.setCharAt(i,ch);
            }
        }
        return sb.toString(); //The toString() method returns the string itself.


    }

}
