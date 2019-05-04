import Monopoly.Elements.Die;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @Test
    void valueOfAFaceShouldBeInTheRightBoundaries()
    {
        Die die = new Die();
        assertFalse((die.getFaceValue() > 6) && (die.getFaceValue() < 1) );
    }

    @Test
    void everyValueShouldAppearAtLeastOneTimeOver100turns()
    {
        boolean one = false, two = false, three = false, four = false,
                five = false, six = false;
        for(int i = 0; i < 100; ++i)
        {
            Die die = new Die();
            int valeur = die.getFaceValue();
            switch(valeur)
            {
                case 1 : one = true;
                    break;
                case 2 : two = true;
                    break;
                case 3 : three = true;
                    break;
                case 4 : four = true;
                    break;
                case 5 : five = true;
                    break;
                case 6 : six = true;
                    break;
                default:
                    break;
            }
        }
        assertEquals(one && two && three && four && five && six, true);
    }
}