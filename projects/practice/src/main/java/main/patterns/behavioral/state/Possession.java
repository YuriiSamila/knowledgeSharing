package main.patterns.behavioral.state;

public class Possession implements Strategy {
    @Override
    public void play() {
        System.out.println("Keep possession!");
    }
}
