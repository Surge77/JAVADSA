package Hashmaps;

import java.util.*;

public class HashmapsLibrary {

    public static void main(String[] args) {

        HashMap<String,Integer> languages = new HashMap<>();

        //add elements to hashmap
        languages.put("java",20);
        languages.put("C++",30);
        languages.put("python",40);
        languages.put("Ruby",40);

        //print
        System.out.println(languages);

        //access
        System.out.println(languages.get("java"));
        System.out.println(languages.keySet()); //keys
        System.out.println(languages.values()); //values

        System.out.println(languages.entrySet()); //both key and values

        //replace a value
        languages.replace("goland",40);

        //remove
        languages.remove("python");
        System.out.println(languages);

        //clear() clears the hashmap
        languages.clear();
        //clone() -> makes copy of hashmap
        //containIsKey() -> checks if a specific key is present
        //size() -> size of hashmap no of key value pairs


    }


}
