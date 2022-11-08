package main.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop implements Observed {

    private List<String> goods = new ArrayList<>();
    private List<Observer> clients = new ArrayList<>();

    public void addGoods(String goods) {
        this.goods.add(goods);
        notifyAllObservers();
    }

    public void deleteGoods(String goods) {
        this.goods.remove(goods);
        notifyAllObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        clients.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        clients.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer client : clients) {
            client.handleEvent(goods);
        }
    }

}
