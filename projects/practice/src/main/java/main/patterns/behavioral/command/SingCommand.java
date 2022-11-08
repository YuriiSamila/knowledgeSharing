package main.patterns.behavioral.command;

public class SingCommand implements Command{
    private Functionality functionality;

    public SingCommand(Functionality functionality) {
        this.functionality = functionality;
    }

    @Override
    public void executeActivity() {
        functionality.sing();
    }
}
