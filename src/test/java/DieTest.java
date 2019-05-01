import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @Test
    void aDieShouldntHaveMoreThanSixFaces()
    {
        Die die = new Die();
        assertEquals(die.getFaceValue(), 6);
    }

}