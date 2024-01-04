package data_structures;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args){
        setDemo();
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
}
