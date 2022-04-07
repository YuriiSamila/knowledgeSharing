package main.patterns.structural.facade;

import java.util.Random;

public class ToyBox {

    public void startChoosingOptimalBox() {
        System.out.println("Choosing optimal box...");
    }

    public String chooseOptimalBox() {
        int randomToyBoxIndex = new Random().nextInt(ToyBoxes.values().length);
        ToyBoxes toyBox = ToyBoxes.values()[randomToyBoxIndex];
        return toyBox.toString();
    }

}
