package main.patterns.behavioral.command;

public class EcoSafeCommand implements Command{
    private Functionality functionality;

    public EcoSafeCommand(Functionality functionality) {
        this.functionality = functionality;
    }

    @Override
    public void executeActivity() {
        functionality.ecoSafe();
    }
}
