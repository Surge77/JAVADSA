package LinkedList;

import java.util.LinkedList;

public class Builtin_Collection {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("Zebra");
        animals.add("Titan");
        animals.add("Snake");

        System.out.println(animals);

        animals.add(1,"Lion");

        System.out.println(animals.get(2));
        System.out.println(animals.get(3));

        System.out.println(animals);

        animals.remove(1);
        System.out.println(animals);

        for (String animal : animals){
            System.out.println(animal);
        }
    }
}
