package Monopoly.Board.Square;

import Monopoly.Players.Player;

public abstract class Square
{
    private String squareName;

    public Square(String newSquareName)
    {
        squareName = newSquareName;
    }

    public String getSquareName()
    {
        return this.squareName;
    }

    public abstract void landedOn(Player player);

}
