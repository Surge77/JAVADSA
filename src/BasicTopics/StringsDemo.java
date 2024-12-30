package BasicTopics;

import java.lang.String;

public class StringsDemo {

    public static void main(String[] args) {


        String First = "HEllo there";  //standard way of creating a string
        String ts = new String("Welcome Intellij"); //Created string using new keyword

        System.out.println(ts);
        System.out.println(First);

        //String operations and methods

        String Greet = "Bonjour";
        System.out.println("String: " + Greet);

        //The java.lang.String class provides many useful methods

        //Length of string or number of characters in string
        System.out.println(Greet.length());

        //concatenate method
        String joinedstring = Greet.concat(" Tejz"); //These two strings are joined and assigned to the variable
        System.out.println(joinedstring);

        String First1 = "Java";
        String second = "Java";

        //Comparing two strings
        boolean compre = First1.equals(second);
        System.out.println(compre);

        String str1 = new String("Pr1");
        String str2 = new String("Pr1");

        boolean r1 = (str1 == str2); //false because this compares the references to the object
        boolean r2 = str1.equals(str2); //true bcoz this one compares the actual contents of the string

        System.out.println(r1);
        System.out.println(r2);

        //The escape character for string
        //In case of there is a double quote inside double quote we use the escape character
        String title = "THis is \"very\" important project";

        System.out.println(title);
        //In java strings are immutable i.e we cannot change them.


        String newstr = "Hello";
        //substring
        //Range => 0 -> length

        System.out.println(newstr.substring(1,4));
        //This actually gives the index from 1 to 3rd it skips the last one
        //If we just mention the beginning index it will print the whole string

        System.out.println(newstr.lastIndexOf('l'));
        System.out.println(newstr.startsWith("Hel")); //returns boolean value
    }

}
