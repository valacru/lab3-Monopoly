package Monopoly.Board.Square.TypesOfSquare;
import Monopoly.Board.Square.Square;
import Monopoly.Players.Player;

public class RegularSquare extends Square {
    public RegularSquare(String newName)
    {
        super(newName);
    }

    @Override
    public void landedOn(Player player) {
    }
}
