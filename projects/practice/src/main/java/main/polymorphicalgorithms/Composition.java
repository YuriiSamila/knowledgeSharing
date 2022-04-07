package main.polymorphicalgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Composition {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 7));

        // frequency
        int frequency = Collections.frequency(integers, 7);
        System.out.println(frequency);

        // disjoint
//        List<Integer> integers2 = new ArrayList<>(List.of(8, 9, 10, 11, 12, 13, 14, 7));
//        List<Integer> integers3 = new ArrayList<>(List.of(8, 9));
//        boolean isDisjoint = Collections.disjoint(integers, integers2);
//        System.out.println("Is disjoint with integers2: " + isDisjoint);
//        boolean isDisjoint2 = Collections.disjoint(integers, integers3);
//        System.out.println("Is disjoint with integers3: " + isDisjoint2);

    }

}
