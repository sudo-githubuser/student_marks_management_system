package DSA;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args){
        /* Unordered set of unique elements
         */
        var names = new HashSet<String>();
        names.add("Alpine");
        names.add("Pentine");
        names.add("Octane");
        names.add("Alpine"); // No duplicates will be allowed
        names.add("Kiwi");
        names.add("Mango");
        names.add("Strawberry");

        for(String i : names){
            System.out.println(i);
        }
        System.out.println(names.size());
        System.out.println(names.contains("Kiwi"));

        names.remove("Kiwi");
        System.out.println(names.size());
        System.out.println(names.contains("Kiwi"));

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(11);
        numbers.add(7);
        numbers.add(4);

        System.out.println(numbers);

        for(int i = 1; i <= 10; i++){
            if(numbers.contains(i)){
                System.out.println(i + " is in the set");
            }else{
                System.out.println(i + " is not in the set");
            }
        }

        /* Ordered set of unique elements
          */
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println(fruits);

        /* Ordered set of unique elements with insertion order
         */
        LinkedHashSet<String> fruits_01 = new LinkedHashSet<>();
        fruits_01.add("Cherry");
        fruits_01.add("Banana");
        fruits_01.add("Apple");
        fruits_01.add("Orange");
        fruits_01.add("Mango");

        System.out.println(fruits_01);
    }
}
