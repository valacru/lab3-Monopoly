package MonopolyTests.BoardTests;

import Monopoly.Board.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void squareShouldBeCorrectlyGeneratedOnBoard()
    {
        Board board = new Board();

        assertEquals(board.getSquare(null, 0).getSquareName(), "Go");
    }

    @Test
    void aBoardShouldHaveASize()
    {
        Board board1 = new Board();
        int taille1 = board1.getSquaresSize();
        assertNotNull(taille1);
    }

    @Test
    void aBoardInitializedWithAnotherBoardShouldBeTheSame()
    {
        Board b1 = new Board();
        Board b2 = b1;
        assertIterableEquals(b1.getArraySquares(), b2.getArraySquares());
    }

}