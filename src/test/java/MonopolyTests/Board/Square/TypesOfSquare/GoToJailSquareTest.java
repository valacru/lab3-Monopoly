package MonopolyTests.Board.Square.TypesOfSquare;
import Monopoly.Board.Square.TypesOfSquare.GoToJailSquare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {

    @Test
    void aGoToJailSquareShouldBeWellNamed()
    {
        GoToJailSquare goToJailSquare = new GoToJailSquare("Go To Jail Square");
        assertEquals(goToJailSquare.getSquareName(), "Go To Jail Square");
    }

}