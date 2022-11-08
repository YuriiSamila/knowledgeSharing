package main.patterns.behavioral.state;

public class Main {
    //Allow to manage object behavior depending on state
    //Behavior changing during run time
    public static void main(String[] args) {
        FootballTeam footballTeam = new FootballTeam();
        var strategy = new Defence();
        footballTeam.setStrategy(strategy);
        for (int i = 0; i < 10; i++) {
           footballTeam.play();
           footballTeam.changeStrategy();
        }
    }

}
