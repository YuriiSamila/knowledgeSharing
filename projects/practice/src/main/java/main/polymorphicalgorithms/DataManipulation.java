package main.polymorphicalgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DataManipulation {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        //reverse
//        integers.forEach(System.out::print);
//        Collections.reverse(integers);
//        System.out.println("\n--------------Reversed--------------");
//        integers.forEach(System.out::print);

        //fill
//        integers.forEach(System.out::print);
//        Collections.fill(integers, 9);
//        System.out.println("\n--------------Filled--------------");
//        integers.forEach(System.out::print);

        //copy
//        List<Integer> targetList = new ArrayList<>(List.of(8, 8, 8, 8, 8, 8, 8)); // size matters
//        System.out.println("Target list:");
//        targetList.forEach(System.out::print);
//        System.out.println("\nSource list:");
//        integers.forEach(System.out::print);
//        Collections.copy(targetList, integers);
//        System.out.println("\nNew target list:");
//        targetList.forEach(System.out::print);

        //nCopies
//        List<Random> randoms = Collections.nCopies(5, new Random());
//        randoms.forEach(random -> System.out.println(random.nextInt()));

        //swap
//        integers.forEach(System.out::print);
//        Collections.swap(integers, 4, 6);
//        System.out.println("\n-----------Swapped-------------------");
//        integers.forEach(System.out::print);

    }

}
