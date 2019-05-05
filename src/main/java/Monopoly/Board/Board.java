package Monopoly.Board;

import Monopoly.Board.Square.Square;
import Monopoly.Board.Square.TypesOfSquare.GoSquare;
import Monopoly.Board.Square.TypesOfSquare.GoToJailSquare;
import Monopoly.Board.Square.TypesOfSquare.IncomeTaxSquare;
import Monopoly.Board.Square.TypesOfSquare.RegularSquare;

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
                squares.add(new GoSquare("Go"));
            }
            else if((i == 4) || (i == 38))
            {
                squares.add(new IncomeTaxSquare("Income Tax Square"));
            }
            else if(i == 30)
            {
                squares.add(new GoToJailSquare("Go To Jail Square"));
            }
            else
            {
                squares.add(new RegularSquare("Square " + i));
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

    public int getSquaresSize()
    {
        return squares.size();
    }

    public ArrayList<Square> getArraySquares()
    {
        return squares;
    }

    public Square getSimpleSquare(int id)
    {
        return squares.get(id);
    }
}
