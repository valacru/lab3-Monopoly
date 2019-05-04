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

    @Test
    void differentPlayersShouldHaveDifferentPieces()
    {
        int index = 0;
        String pieceNameToTest1 = null, pieceNameToTest2 = null;
        Player player1 = new Player("Guris");
        Player player2 = new Player("Elodie");
        for(; index < 8; ++index)
        {
            if(player1.getPiece().getPieceName().equals(player1.getPiece().getPiecesName(index)))
            {
                pieceNameToTest1 = player1.getPiece().getPiecesName(index);
                break;
            }
        }
        for(; index < 8; ++index)
        {
            if(player2.getPiece().getPieceName().equals(player2.getPiece().getPiecesName(index)))
            {
                pieceNameToTest2 = player2.getPiece().getPiecesName(index);
                break;
            }
        }
        assertNotEquals(pieceNameToTest1, pieceNameToTest2);

    }

    @Test
    void aPlayerShouldBeAbleToRollDiceAndMoveOnTheBoard()
    {
        Board board = new Board();
        Die die = new Die();
        Player player = new Player("Arya");
        String oldCase = player.getPiece().getLocation().getSquareName();
        player.takeTurn(board, die);
        String newCase = player.getPiece().getLocation().getSquareName();

        assertNotEquals(oldCase, newCase);
    }

}