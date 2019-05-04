import Monopoly.Board.Square.Square;
import Monopoly.Board.Square.TypesOfSquare.GoSquare;
import Monopoly.Board.Square.TypesOfSquare.RegularSquare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void sequentialSquareShouldHaveTheCorrectName()
    {
        Square s1 = new GoSquare("Go");
        Square s2 = new RegularSquare("Square 1");
        Square s3 = new RegularSquare("Square 2");

        assertEquals(s1.getSquareName(), "Go");
        assertEquals(s2.getSquareName(), "Square 1");
        assertEquals(s3.getSquareName(), "Square 2");

    }
}