package MonopolyTests.ElementsTests;

import Monopoly.Elements.Cup;
import Monopoly.Elements.Die;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void aCupShouldHaveTheCorrectNumberOfDice() {
        Cup cup = new Cup(2);
        int nbDice = 0;
        for (Die die : cup.getDice()) {
            nbDice++;
        }
        assertEquals(2, nbDice);
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void aCupShouldReturnTheCorrectTotalWhenRolled(int nbDice) {
        Cup cup = new Cup(nbDice);
        cup.roll();
        switch(nbDice)
        {
            case 1 : assertFalse((cup.getTotal() > 6) && (cup.getTotal() < 1) );
            break;
            case 2 : assertFalse((cup.getTotal() > 12) && (cup.getTotal() < 2) );
            break;
            case 3 : assertFalse((cup.getTotal() > 18) && (cup.getTotal() < 3) );
            break;
            default :
                break;
        }
    }
}