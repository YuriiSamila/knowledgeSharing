package main.patterns.structural.facade;

public class ToyPacking {

    public void packToy(ToyBox toyBox) {
        System.out.println("Pack toy into the " + toyBox.chooseOptimalBox() + " box");
    }

}
