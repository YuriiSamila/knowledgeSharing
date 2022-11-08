package main.patterns.behavioral.state;

public class Defence implements Strategy {
    @Override
    public void play() {
        System.out.println("Don't miss a goal!!!");
    }
}
