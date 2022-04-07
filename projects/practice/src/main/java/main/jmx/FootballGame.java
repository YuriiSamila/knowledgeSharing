package main.jmx;

public class FootballGame implements FootballGameMBean {

    private String playerName;

    @Override
    public void playFootball(String club) {
        System.out.println(playerName + " are playing for " + club);
    }

    @Override
    public String getPlayerName() {
        System.out.println("Player name is: " + playerName);
        return playerName;
    }

    @Override
    public void setPlayerName(String playerName) {
        System.out.println("Set player name to '" + playerName + "'");
        this.playerName = playerName;
    }
}
