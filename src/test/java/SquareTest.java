import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void aSquareShouldHaveAName()
    {
        Square squareToTest = new Square("Go");
        String nameToTest = "Go";

        assertEquals(squareToTest.getSquareName(), nameToTest);
    }
}