package main.patterns.behavioral.command;

public class Main {

    public static void main(String[] args) {
        Functionality functionality = new Functionality();
        Robot robot = new Robot(new GreetingsCommand(functionality), new HandShakeCommand(functionality),
                new SingCommand(functionality), new EcoSafeCommand(functionality));
        robot.greetings();
        robot.handShake();
        robot.sing();
        robot.ecoSafe();
    }

}
