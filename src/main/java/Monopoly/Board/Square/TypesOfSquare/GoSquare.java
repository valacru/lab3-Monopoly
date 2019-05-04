package Monopoly.Board.Square.TypesOfSquare;

import Monopoly.Board.Square.Square;
import Monopoly.Players.Player;

public class GoSquare extends Square {

    public GoSquare(String newName)
    {
        super(newName);
    }

    @Override
    public void landedOn(Player player)
    {
        player.addCash(200);
    }
}
