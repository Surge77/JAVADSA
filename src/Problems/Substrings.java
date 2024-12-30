package Problems;

public class Substrings {

    public static void main(String[] args) {

        //THe goal is to print the substrings in the given string
        //Suppose the given string is "code"
        //SO the possible substrings will be c,co,cod,code,o,od,ode,d,de,e
        //Only in forward direction
        //Substring in Java is a commonly used method of java. lang. String class that is used to create smaller strings from the bigger one

        substrings("code");
    }

    public static void substrings(String str) {  //If we make the function void we don't need to return anything

        //si is start index and ei is end index
        //here we use two nested loops i.e we use double pointers technique
        //We place the ending index just after the start index
        for (int si = 0; si < str.length(); si++) {
            for (int ei = si + 1; ei <= str.length(); ei++) {
                System.out.println(str.substring(si, ei));
                //Here while printing substrings the ei is not printed so we need to go beyond the ending index
            }
        }
    }
}
