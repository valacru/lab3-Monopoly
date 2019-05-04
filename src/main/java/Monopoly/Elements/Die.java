package Monopoly.Elements;

import java.util.Random;

public class Die {
    private int faceValue;

    public Die()
    {
        faceValue = roll();
    }

    public int getFaceValue() {
        return faceValue;
    }

    public int roll()
    {
        Random rand = new Random();
        int value = rand.nextInt(6);
        value +=1;
        return value;
    }
}
