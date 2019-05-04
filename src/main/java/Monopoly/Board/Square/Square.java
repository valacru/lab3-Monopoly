package Monopoly.Board.Square;

public abstract class Square
{
    private String squareName;

    public Square(String newSquareName)
    {
        squareName = newSquareName;
    }

    public String getSquareName()
    {
        return this.squareName;
    }

    public abstract boolean landedOn();

}
