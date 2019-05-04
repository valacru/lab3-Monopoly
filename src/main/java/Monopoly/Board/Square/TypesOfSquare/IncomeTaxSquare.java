package Monopoly.Board.Square.TypesOfSquare;

import Monopoly.Board.Square.Square;

public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare(String newName)
    {
        super(newName);
    }

    public boolean landedOn()
    {
        return true;
    }
}
