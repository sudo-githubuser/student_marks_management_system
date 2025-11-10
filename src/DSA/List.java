package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class List {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(31);
        numbers.add(25);
        numbers.add(333);
        numbers.add(41);
        numbers.add(15);

        Collections.sort(numbers);
        System.out.println(numbers);

        var names = new LinkedList<String>();
        names.add("Alpine");
        names.add("Pentine");
        names.add("Octane");
        names.add("Fluorine");
        names.add("Kiwi");
        names.add("Mango");
        names.add("Strawberry");

        for(String i : names){
            System.out.println(i);
        }

        Collections.sort(names);
        System.out.println(names);

        names.sort(Collections.reverseOrder()); // or this one  Collections.sort(names, Collections.reverseOrder())
        System.out.println(names);

        Comparator<String> sortByLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        names.sort(sortByLength); // or this one  Collections.sort(names, sortByLength)
        System.out.println(names);

    }
}
