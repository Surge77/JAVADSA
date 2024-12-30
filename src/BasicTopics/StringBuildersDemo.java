package BasicTopics;

public class StringBuildersDemo {

    public static void main(String[] args) {

        //Java StringBuilder class is used to create mutable (modifiable) String.
        // The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. It is available since JDK 1.5.

        String str = "Daytona";

        //Method to create string builder

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(str); //This is converting a string to stringbuilder


        //length
        System.out.println(sb1);
        System.out.println(sb1.length());

        //append
        sb1.append("abc");
        System.out.println(sb1);

        //we can also insert a string at a given position through insert method

        sb1.insert(0,"z");
        System.out.println(sb1);
        //to add at the end
        sb1.insert(sb1.length(),"z");
        System.out.println(sb1);

        //the SetCharAt() is used to replace a string at a given position not add

        sb1.setCharAt(0, 'y');  //here we should add string in single quote
        System.out.println(sb1);

        //To convert a Stringbuilder back to string

        String str1 = sb1.toString();
        
    }
}
