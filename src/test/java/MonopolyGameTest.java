import static org.junit.jupiter.api.Assertions.*;

import Monopoly.MonopolyGame;
import org.junit.jupiter.api.Test;

class MonopolyGameTest {

    @Test
    public void aMonopolyGameShouldHaveTheRightNumberOfPlayers()
    {
        final int BOUND_MIN = 2, BOUND_MAX = 8;
        int nbPlayers = 9;
        MonopolyGame monopolyGame = new MonopolyGame((nbPlayers));
        assertFalse(monopolyGame.getPlayers().size() >= BOUND_MIN &&
                monopolyGame.getPlayers().size() <= BOUND_MAX);
    }

    @Test
    public void aMonopolyGameShouldHaveEveryComponents()
    {
        int nbPlayers = 4;
        MonopolyGame monopolyGame = new MonopolyGame(nbPlayers);
        assertNotNull(monopolyGame.getPlayers().size());
        assertNotNull(monopolyGame.getBoard());
        assertNotNull(monopolyGame.getDie());
    }

}