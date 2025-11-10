package DSA;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_01 {

    public static void main(String[] args){

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        do {
            System.out.println(it.next());
        } while (it.hasNext());
    }
}
