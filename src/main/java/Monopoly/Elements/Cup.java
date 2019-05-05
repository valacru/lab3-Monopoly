package Monopoly.Elements;

import java.util.ArrayList;

public class Cup {
    private ArrayList<Die> dice;
    private int total;

    public Cup(int nbDice) {
        dice = new ArrayList<>();
        for(int i = 0; i < nbDice; ++i) {
            dice.add(new Die());
        }
    }

    public void roll() {
        total = 0;
        for (Die die : dice) {
            total += die.roll();
        }
    }

    public int getTotal() {
        return total;
    }

    public ArrayList<Die> getDice() {
        return dice;
    }
}
