package BasicTopics;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        //Disadvantages of Arrays: Fixed size => mention size at start => similar data type

        //Purpose of Arraylist/Dynamic Arrays : Tackles the first two disadvantages
        //Arraylist automatically resizes according to elements present

        //Syntax for ArrayList
        //ArrayList<Type> Array_name = new ArrayList();

        ArrayList<Integer> arrayList = new ArrayList<>();

        ArrayList<String> languages = new ArrayList<>();

        //adding elements
        languages.add("Java");
        languages.add("Javascript");
        languages.add("Python");
        languages.add("C#");
        languages.add(1,"C++");
        languages.add(1,"jango");
        System.out.println(languages.size());//it automatically resizes itself

        System.out.println(languages);

        //accessing elements
        //Here str is the variable name and string is datatype
        //get method is used to access any particular element
        String str = languages.get(2);
        System.out.println(str);

        //change
        languages.set(1,"C++"); //replaces javascript with C++, 1 is the index we want to change
        System.out.println(languages);

        //remove method is used to delete elements from arraylist
        System.out.println(languages.size());
        languages.remove(3); //removes C#
        System.out.println(languages);
        System.out.println(languages.size());

        //iteration using enhanced for loop\
        //iterating through every element

        for (String language: languages){
            System.out.println(language);
        }




    }
}
