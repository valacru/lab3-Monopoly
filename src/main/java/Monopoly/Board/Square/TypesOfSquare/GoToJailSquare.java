package Monopoly.Board.Square.TypesOfSquare;
import Monopoly.Board.Board;
import Monopoly.Board.Square.Square;
import Monopoly.Players.Player;

public class GoToJailSquare extends Square
{
    public GoToJailSquare(String newName)
    {
        super(newName);
    }

    @Override
    public void landedOn(Player player)
    {
        Board board = new Board();
        player.getPiece().setLocation(board.getSimpleSquare(10));
    }
}
