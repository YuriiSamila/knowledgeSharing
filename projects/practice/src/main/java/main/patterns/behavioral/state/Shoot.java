package main.patterns.behavioral.state;

public class Shoot implements Strategy {
    @Override
    public void play() {
        System.out.println("Hit shoot!!!");
    }
}
