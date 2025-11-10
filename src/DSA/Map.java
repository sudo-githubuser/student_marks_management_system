package DSA;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args){

        /* Key value pairs
          Keys in the hashmap should be unique */
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("Austria", "Wien");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Norway"));

        // Print keys
        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }

        // Print values
        for(String i : capitalCities.values()){
            System.out.println(i);
        }

        // Print keys and values
        for(String i : capitalCities.keySet()){
            System.out.println("The capital city of " + i + " is " + capitalCities.get(i));
        }


        TreeMap<Integer, String> seatAllocation = new TreeMap<>();
        seatAllocation.put(1, "John");
        seatAllocation.put(2, "Doe");
        seatAllocation.put(3, "Aaras");
        seatAllocation.put(4, "Bekal");
        seatAllocation.put(5, "Manorama");

        System.out.println(seatAllocation);

        for(int i : seatAllocation.keySet()){
            System.out.println(seatAllocation.get(i) + " is seated in seat No.: " + i);
        }

        LinkedHashMap<String, String> capitalCities_01 = new LinkedHashMap<>();

        capitalCities_01.put("England", "London");
        capitalCities_01.put("India", "New Dehli");
        capitalCities_01.put("Austria", "Wien");
        capitalCities_01.put("Norway", "Oslo");
        capitalCities_01.put("Norway", "Oslo"); // Duplicate
        capitalCities_01.put("USA", "Washington DC");

        System.out.println(capitalCities_01);

    }
}
