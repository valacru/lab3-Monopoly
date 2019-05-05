package MonopolyTests.Board.Square.TypesOfSquare;
import Monopoly.Board.Square.TypesOfSquare.GoSquare;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GoSquareTest
{
    @Test
    void aGoSquareShouldBeWellNamed()
    {
        GoSquare goSquare = new GoSquare("Go");
        assertEquals(goSquare.getSquareName(), "Go");
    }
}