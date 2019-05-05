package Monopoly.Board.Square.TypesOfSquare;

import Monopoly.Board.Square.Square;
import Monopoly.Players.Player;

public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare(String newName)
    {
        super(newName);
    }

    @Override
    public void landedOn(Player player) {
        player.reduceCash();
    }
}
