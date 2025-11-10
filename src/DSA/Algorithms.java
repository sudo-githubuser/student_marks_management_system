package DSA;

import java.util.ArrayList;
import java.util.Collections;

public class Algorithms {
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");

        Collections.sort(names);
        int index = Collections.binarySearch(names, "Jenny");
        System.out.println("Jenny is at index: " + index);
// **********************************************************************************************//
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));
// **********************************************************************************************//
        ArrayList<String> cards = new ArrayList<>();
        cards.add("Ace");
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");

        Collections.shuffle(cards);
        System.out.println(cards);
// **********************************************************************************************//
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        int count = Collections.frequency(fruits, "Banana");
        System.out.println("Banana appears: " + count + " times");

        System.out.println("Before swapping: " + fruits);
        Collections.swap(fruits, 0, 2); // Swap first and third element
        System.out.println("After swapping: " + fruits);
    }
}
