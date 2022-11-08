package main.patterns.behavioral.command;

public class GreetingsCommand implements Command{
    private Functionality functionality;

    public GreetingsCommand(Functionality functionality) {
        this.functionality = functionality;
    }

    @Override
    public void executeActivity() {
        functionality.greetings();
    }
}
