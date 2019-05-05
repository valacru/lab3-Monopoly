package MonopolyTests.Board.Square.TypesOfSquare;
import Monopoly.Board.Square.TypesOfSquare.IncomeTaxSquare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {

    @Test
    void anIncomeTaxeSquareShouldBeWellNamed()
    {
        IncomeTaxSquare incomeTaxSquare = new IncomeTaxSquare("Income Tax Square");
        assertSame(incomeTaxSquare.getSquareName(), "Income Tax Square");
    }

}