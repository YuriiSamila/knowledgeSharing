package main.polymorphicalgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Searching {

    public static void main(String[] args) {

        // binarySearch - assumes that the List is sorted in ascending order according to the natural ordering of its elements
        List<Integer> integers = new ArrayList<>(List.of(1, 3, 4, 7));
        // If the List contains the search key, its index is returned (7)
        // If not, the return value is (-(insertion point) - 1), where the insertion point is:
        // - the point at which the value would be inserted (2)
        // - the index of the first element greater than the value (5)
        // - or list.size() if all elements in the List are less than the specified value (9)
        int index = Collections.binarySearch(integers, 7);
        System.out.println(index);

        // binarySearch with the Comparator - assumes that the List is sorted into ascending order according to the specified Comparator
//        Collections.reverse(integers);
//        int index = Collections.binarySearch(integers, 7, Collections.reverseOrder());
//        System.out.println(index);

    }

}
