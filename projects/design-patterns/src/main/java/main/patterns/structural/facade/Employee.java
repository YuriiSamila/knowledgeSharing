package main.patterns.structural.facade;

public class Employee {

    public void organizeDelivery() {
        var christmasTreeToyFactory = new ChristmasTreeToyFactory();
        christmasTreeToyFactory.createToy();
        var toyBox = new ToyBox();
        toyBox.startChoosingOptimalBox();
        var toyPacking = new ToyPacking();
        toyPacking.packToy(toyBox);
    }

}
