package Monopoly.Players;

import Monopoly.Board.Board;
import Monopoly.Elements.Die;
import Monopoly.Elements.Piece;

public class Player {
    private String playerName;
    private Piece piece;
    private int cash;

    public Player(String newPlayerName)
    {
        playerName = newPlayerName;
        piece = new Piece();
        cash = 1500;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public Piece getPiece()
    {
        return piece;
    }

    public int getCash()
    {
        return cash;
    }

    public void takeTurn(Board board, Die die)
    {
        int nbMove = die.roll() + die.roll();
        String oldLoc = piece.getLocation().getSquareName();
        piece.setLocation(board.getSquare(oldLoc, nbMove));

        System.out.println("Player : " + playerName);
        System.out.println(playerName + " is on square " + oldLoc);
        System.out.println("Rolled : " + nbMove);
        System.out.println(playerName + " is now on " + piece.getLocation().getSquareName());
    }
}
