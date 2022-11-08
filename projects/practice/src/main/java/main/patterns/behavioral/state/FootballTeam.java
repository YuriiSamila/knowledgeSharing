package main.patterns.behavioral.state;

public class FootballTeam {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy() {
        if (strategy instanceof Defence) {
            setStrategy(new Possession());
        } else if (strategy instanceof Possession) {
            setStrategy(new Attack());
        } else if (strategy instanceof Attack) {
            setStrategy(new Shoot());
        } else {
            setStrategy(new Defence());
        }
    }

    public void play() {
        strategy.play();
    }

}
