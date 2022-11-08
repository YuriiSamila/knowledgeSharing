package main.patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> goods) {
        System.out.println("Mr/Mrs " + name + ", our goods updated");
        System.out.println(goods);
        System.out.println("--------------------------------------------");
    }
}
