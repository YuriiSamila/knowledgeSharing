package main.patterns.behavioral.command;

public class HandShakeCommand implements Command{
    private Functionality functionality;

    public HandShakeCommand(Functionality functionality) {
        this.functionality = functionality;
    }

    @Override
    public void executeActivity() {
        functionality.handShake();
    }
}
