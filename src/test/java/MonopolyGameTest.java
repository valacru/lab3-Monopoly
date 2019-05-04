import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MonopolyGameTest {

    @Test
    public void aMonopolyGameShouldHaveAtLeastTwoPlayers() {
        int nbPlayers = 2;
        MonopolyGame mg = new MonopolyGame(nbPlayers);
        assertNotNull(mg.getPlayers().size());
    }

    @Test
    public void aMonopolyGameShouldHaveTheRightNumberOfPlayers()
    {
        final int BOUND_MIN = 2, BOUND_MAX = 8;
        int nbPlayers = 9;
        MonopolyGame monopolyGame = new MonopolyGame((nbPlayers));
        assertFalse(monopolyGame.getPlayers().size() >= BOUND_MIN &&
                monopolyGame.getPlayers().size() <= BOUND_MAX);
    }

}