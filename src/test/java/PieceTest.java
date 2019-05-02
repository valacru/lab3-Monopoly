import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    void everyPieceOfAGameShouldBeDifferent()
    {
        Piece piece1 = new Piece();
        Piece piece2 = new Piece();

        assertNotEquals(piece1.getPieceName(), piece2.getPieceName());
    }

    @Test
    void everyPieceShouldStartOnGo()
    {
        Piece piece = new Piece();
        assertEquals(piece.getLocation().getSquareName(), "Go");
    }
}