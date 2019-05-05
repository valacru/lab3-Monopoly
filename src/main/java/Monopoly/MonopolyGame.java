package Monopoly;

import Monopoly.Board.Board;
import Monopoly.Elements.Cup;
import Monopoly.Elements.Die;
import Monopoly.Players.Player;

import java.util.LinkedList;

public class MonopolyGame {
    private int nbPlayers;
    private Board board;
    private Cup cup;
    private LinkedList<Player> players;
    private static final int roundCount = 20;

    public MonopolyGame(int newNbPlayers)
    {
        players = new LinkedList<Player>();
        nbPlayers = newNbPlayers;

        int nbDice = 2;
        cup = new Cup(nbDice);
        board = new Board();
        String baseName = "Player";

        for(int i = 1; i <= nbPlayers; ++i)
        {
            players.add(new Player(baseName + i));
        }
    }

    public Board getBoard()
    {
        return board;
    }

    public Cup getCup() {
        return cup;
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public void playRound(Player player)
    {
        player.takeTurn(board, cup);
    }

    public void playGame()
    {
        for(int i = 0; i < roundCount; ++i)
        {
            playRound(players.get(roundCount % nbPlayers));
        }
    }
}
