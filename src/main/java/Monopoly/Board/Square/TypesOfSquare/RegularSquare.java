package Monopoly.Board.Square.TypesOfSquare;
import Monopoly.Board.Square.Square;

public class RegularSquare extends Square {
    public RegularSquare(String newName)
    {
        super(newName);
    }

    public boolean landedOn()
    {
        return true;
    }
}
