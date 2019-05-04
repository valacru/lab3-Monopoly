package Monopoly;

import Monopoly.Board.Board;
import Monopoly.Elements.Die;
import Monopoly.Players.Player;

import java.util.LinkedList;

public class MonopolyGame {
    private int nbPlayers;
    private Board board;
    private Die die;
    private LinkedList<Player> players;
    private static final int roundCount = 20;

    public MonopolyGame(int newNbPlayers)
    {
        players = new LinkedList<Player>();
        nbPlayers = newNbPlayers;


        die = new Die();
        board = new Board();
        String baseName = "Monopoly.Players.Player";

        for(int i = 1; i <= nbPlayers; ++i)
        {
            players.add(new Player(baseName + i));
        }
    }

    public Board getBoard()
    {
        return board;
    }

    public Die getDie()
    {
        return die;
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public Player getPlayer(int id)
    {
        return players.get(id);
    }

    public void playRound(Player player)
    {
        player.takeTurn(board, die);
    }

    public void playGame()
    {
        for(int i = 0; i < roundCount; ++i)
        {
            playRound(players.get(roundCount % nbPlayers));
        }
    }
}
