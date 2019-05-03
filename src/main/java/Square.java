public class Square
{
    private String squareName;
    private static int counter = 0;

    public Square(String newSquareName)
    {
        squareName = newSquareName;
    }

    public Square()
    {
        if(counter > 40)
        {
            counter = 0;
        }
        else if(counter == 0)
        {
            squareName = "Go";
        }
        else
        {
            squareName = "Square " + counter;
        }
        counter++;
    }

    public String getSquareName()
    {
        return squareName;
    }
}
