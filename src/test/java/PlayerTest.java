import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void playerShouldHaveTheCorrectName()
    {
        String lambdaName = "Elodie";
        Player player = new Player(lambdaName);
        assertEquals(player.getPlayerName(), lambdaName);
    }

    @Test
    void playerShouldHaveAnExistingPiece()
    {
        int index = 0;
        String pieceNameToTest = null;
        Player player = new Player("Guris");
        for(; index < 8; ++index)
        {
            if(player.getPiece().getPieceName().equals(player.getPiece().getPiecesName(index)))
            {
                pieceNameToTest = player.getPiece().getPiecesName(index);
                break;
            }
        }
        assertEquals(player.getPiece().getPieceName(), pieceNameToTest);
    }

}