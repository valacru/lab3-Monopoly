import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void squareShouldBeCorrectlyGeneratedOnBoard()
    {
        Board board = new Board();

        assertEquals(board.getSquare(null, 0).getSquareName(), "Go");
    }

}