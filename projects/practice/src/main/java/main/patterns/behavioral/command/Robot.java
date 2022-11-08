package main.patterns.behavioral.command;

public class Robot {

    private Command greetings;
    private Command handShake;
    private Command sing;
    private Command ecoSafe;

    public Robot(Command greetings, Command handShake, Command sing, Command ecoSafe) {
        this.greetings = greetings;
        this.handShake = handShake;
        this.sing = sing;
        this.ecoSafe = ecoSafe;
    }

    public void greetings() {
        greetings.executeActivity();
    }

    public void handShake() {
        handShake.executeActivity();
    }

    public void sing() {
        sing.executeActivity();
    }

    public void ecoSafe() {
        ecoSafe.executeActivity();
    }

}
