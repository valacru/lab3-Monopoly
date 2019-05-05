package MonopolyTests.Board.Square.TypesOfSquare;

import Monopoly.Board.Square.TypesOfSquare.RegularSquare;
import Monopoly.Players.Player;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RegularSquareTest {

    @Disabled
    @ParameterizedTest
    @ValueSource(strings = {"Square 12", "Square 15, Square 22, Square 5"})
    void aRegularSquareTestShouldBeWellNamed(String nameCase)
    {
        Player player = new Player("Daniel");
        RegularSquare regularSquare = new RegularSquare(nameCase);
        regularSquare.landedOn(player);
        assertEquals(player.getPiece().getLocation().getSquareName(), nameCase);
    }
}