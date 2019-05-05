import Monopoly.Board.Board;
import Monopoly.Board.Square.TypesOfSquare.GoSquare;
import Monopoly.Elements.Die;
import Monopoly.Players.Player;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
        final int MAX_PLAYERS = 8;
        String pieceNameToTest1 = null, pieceNameToTest2 = null;
        Player player1 = new Player("Guris");
        Player player2 = new Player("Elodie");
        for(; index < MAX_PLAYERS; ++index)
        {
            if(player1.getPiece().getPieceName().equals(player1.getPiece().getPiecesName(index)))
            {
                pieceNameToTest1 = player1.getPiece().getPiecesName(index);
                break;
            }
        }
        for(; index < MAX_PLAYERS; ++index)
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

    @ParameterizedTest
    @ValueSource(ints = 3)
    void aPlayerShouldBeginWith1500Dollars()
    {
        Player player = new Player("Cuicui");
        assertTrue(player.getNetWorth() == 1500);
    }

    @AfterAll
    static void aPlayerShouldGet200DollarsUpponLandingOnGoSquare()
    {
        Player player = new Player("Sansa");
        GoSquare goSquare = new GoSquare("Go");
        goSquare.landedOn(player);
        // A player starts with 1500 dollars
        assertEquals(player.getNetWorth(), 1700);
    }
}