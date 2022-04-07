package main.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var boardGameCabinet = new BoardGameCabinet();
        List<BoardGame> boardGames = new ArrayList<>();
        boardGames.add(boardGameCabinet.getGame("Chess"));
        boardGames.add(boardGameCabinet.getGame("Chess"));
        boardGames.add(boardGameCabinet.getGame("Chess"));
        boardGames.add(boardGameCabinet.getGame("Jenga"));
        boardGames.add(boardGameCabinet.getGame("Jenga"));
        boardGames.add(boardGameCabinet.getGame("Jenga"));
        boardGames.add(boardGameCabinet.getGame("Beer pong"));
        boardGames.add(boardGameCabinet.getGame("Beer pong"));
        boardGames.add(boardGameCabinet.getGame("Beer pong"));

        for (BoardGame boardGame : boardGames) {
            boardGame.playGame();
        }

    }

}
