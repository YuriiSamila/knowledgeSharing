package main.patterns.structural.facade;

public class Main {

    public static void main(String[] args) {
        var christmasTreeToyFactory = new ChristmasTreeToyFactory();
        christmasTreeToyFactory.createToy();
        var toyBox = new ToyBox();
        toyBox.startChoosingOptimalBox();
        var toyPacking = new ToyPacking();
        toyPacking.packToy(toyBox);

//        var employee = new Employee();
//        employee.organizeDelivery();
    }

}
