package main.polymorphicalgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindingExtremeValues {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(1, 78, 60, 14, 50, 61, 7));

        // max/min
        Integer max = Collections.max(integers);
        System.out.println("Max number: " + max);

        // max/min with the Comparator
        Integer min = Collections.min(integers, Integer::compareTo);
        System.out.println("Min number: " + min);


    }

}
