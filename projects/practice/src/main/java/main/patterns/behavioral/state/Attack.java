package main.patterns.behavioral.state;

public class Attack implements Strategy{
    @Override
    public void play() {
        System.out.println("Need to score!!!");
    }
}
