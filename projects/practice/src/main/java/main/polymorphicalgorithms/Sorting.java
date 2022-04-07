package main.polymorphicalgorithms;

import java.util.*;

import static main.polymorphicalgorithms.Sorting.Position.*;

public class Sorting {

    public static void main(String[] args) {
        // integers
//        List<Integer> integers = new ArrayList<>(List.of(4, 6, 9, 3, 1));
//        integers.forEach(System.out::print);
//        System.out.println("\n-----------Sorted--------------------");
//        Collections.sort(integers); //Collections.reverseOrder()
//        integers.forEach(System.out::print);

        // custom objects - Comparable
//        List<Player> players = new ArrayList<>(List.of(
//                new Player("Steve McManaman", MIDFIELDER, 50),
//                new Player("Roman Yaremchuk", STRIKER, 26),
//                new Player("Yap Stam", DEFENDER, 49)));
//        players.forEach(System.out::println);
//        System.out.println("\n------------Sorted------------------");
//        Collections.sort(players);
//        players.forEach(System.out::println);

        // custom objects - Comparator
//        List<Player> players = new ArrayList<>(List.of(
//                new Player("Steve McManaman", MIDFIELDER, 50),
//                new Player("Roman Yaremchuk", STRIKER, 26),
//                new Player("Yap Stam", DEFENDER, 49)));
//        players.forEach(System.out::println);
//        System.out.println("\n-------------Sorted------------------");
//        Comparator<Player> stringComparator = (Player player, Player player2) -> player.name.compareTo(player2.name);
//        Collections.sort(players, stringComparator);
//        //Collections.sort(players, Comparator.comparing(player -> player.name));
//        players.forEach(System.out::println);

    }

    private static class Player implements Comparable<Player> {

        private final String name;
        private final Position position;
        private final int age;

        private Player(String name, Position position, int age) {
            this.name = name;
            this.position = position;
            this.age = age;
        }

        @Override
        public int compareTo(Player player) {
            if (age == player.age) {
                return 0;
            } else if (age > player.age) {
                return 1;
            } else {
                return -1;
            }
            //return position.compareTo(player.position);
        }

        @Override
        public String toString() {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", position=" + position +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Player player = (Player) o;

            if (age != player.age) return false;
            if (!Objects.equals(name, player.name)) return false;
            return position == player.position;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (position != null ? position.hashCode() : 0);
            result = 31 * result + age;
            return result;
        }
    }

    public enum Position {
        STRIKER,
        MIDFIELDER,
        DEFENDER
    }

}
