package main.patterns.behavioral.observer;

public class Main {
    //Define a one-to-many dependency so that if one object changes, all dependent objects
    //are notified as well and changed
    public static void main(String[] args) {
        OnlineShop onlineShop = new OnlineShop();
        onlineShop.addGoods("Refrigerator");
        onlineShop.addGoods("Vacuum cleaner");
        onlineShop.addGoods("TV");
        Subscriber vasyl = new Subscriber("Vasyl");
        Subscriber kateryna = new Subscriber("Kateryna");
        onlineShop.addObserver(vasyl);
        onlineShop.addObserver(kateryna);

        //onlineShop.addGoods("Laptop");
    }

}
