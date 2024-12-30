package Hashmaps;

public class HMImplementClient {

    public static void main(String[] args) {
        HashmapImplementation map = new HashmapImplementation(4);

        // Insert key-value pairs
        map.put("a", 1);
        map.display();
        map.put("b", 2);
        map.display();
        map.put("c", 3);
        map.display();
        map.put("d", 4);

//        // Display the hashmap
//        map.display();
//
//        // Get a value
//        System.out.println("Get value for key 'b': " + map.get("b"));
//
//        // Check if a key exists
//        System.out.println("Contains key 'a': " + map.containsKey("a"));
//
//        // Remove a key-value pair
//        System.out.println("Remove key 'c': " + map.remove("c"));
//
//        // Display the hashmap after removal
//        map.display();
     }
}



