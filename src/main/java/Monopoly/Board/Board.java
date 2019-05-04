package Monopoly.Board;

import Monopoly.Board.Components.Square;

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;
    private static final int NB_SQUARES = 40;

    public Board()
    {
        squares = new ArrayList<Square>();
        for(int i = 0; i <= 39; ++i)
        {
            if(i == 0)
            {
                squares.add(new Square("Go"));
            }
            else
            {
                squares.add(new Square("Monopoly.Board.Components.Square " + i));
            }
        }

    }

    public Square getSquare(String oldLoc, int fvTot) {
        int i = 0;
        for (; i < NB_SQUARES; ++i) {
            if (squares.get(i).getSquareName().equals(oldLoc)) {
                break;
            }
        }
        return squares.get((i + fvTot) % NB_SQUARES);
    }
}