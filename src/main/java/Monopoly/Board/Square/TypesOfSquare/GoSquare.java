package Monopoly.Board.Square.TypesOfSquare;

import Monopoly.Board.Square.Square;

public class GoSquare extends Square {

    public GoSquare(String newName)
    {
        super(newName);
    }

    public boolean landedOn()
    {
        return true;
    }
}
