import Monopoly.Board.Components.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void sequentialSquareShouldHaveTheCorrectName()
    {
        Square s1 = new Square();
        Square s2 = new Square();
        Square s3 = new Square();

        assertEquals(s1.getSquareName(), "Go");
        assertEquals(s2.getSquareName(), "Monopoly.Board.Components.Square 1");
        assertEquals(s3.getSquareName(), "Monopoly.Board.Components.Square 2");

    }
}