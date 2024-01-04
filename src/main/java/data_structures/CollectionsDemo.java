package data_structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args){
//        setDemo();
        listDemo();
    }

    public static void setDemo(){
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");

        System.out.println(fruits);
        fruits.remove("lemon");
        System.out.println("Contains lemon? "+ fruits.contains("lemon"));

        System.out.println("size: " + fruits.size());

//        Set.of is an immutable set
        Set moreFruits = Set.of("pear", "cherry", "raisin");
    }

    public static void listDemo(){
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "grape");
        fruits.add("lemon");
//        fruits.remove("lemon"); //removes the first found
//        fruits.remove(3);

        System.out.println("index 2: " + fruits.get(2));
        System.out.println("index of grape: " + fruits.indexOf("grape"));
        System.out.println("last index of lemon: " + fruits.lastIndexOf("lemon"));
        System.out.println(fruits);

        List moreFruit = List.of("cherry", "plum"); //immutable
    }
}
