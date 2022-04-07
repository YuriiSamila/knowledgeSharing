package main.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class BoardGameCabinet {

    private static final Map<String, BoardGame> boardGames = new HashMap<>();

    public BoardGame getGame(String gameName) {
        BoardGame boardGame = boardGames.get(gameName);
        if (isNull(boardGame)) {
            switch (gameName) {
                case "Chess":
                    System.out.println("Let's go buy Chess...");
                    boardGame = new Chess();
                    break;
                case "Jenga":
                    System.out.println("Let's go buy Jenga...");
                    boardGame = new Jenga();
                    break;
                case "Beer pong":
                    System.out.println("Let's go by some beer...");
                    boardGame = new BeerPong();
                    break;
            }
            boardGames.put(gameName, boardGame);
        }
        return boardGame;
    }

}
