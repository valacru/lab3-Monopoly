public class Piece {
    private String pieceName;
    private Square location;
    private String[] piecesNames =
            {"T-Rex", "Spinosaur", "Diplodocus", "Stegosaur", "Pteranodon",
            "Utahraptor", "Carnotaur", "Triceratops"};
    private static int counter = 0;

    public Piece() {
        if(counter >= 8)
        {
            counter = 0;
            pieceName = "T-rex";
        }
        else
        {
            pieceName = piecesNames[counter];
            ++counter;
        }

        location = new Square("Go");
    }

    public String getPiecesName(int index)
    {
        return piecesNames[index];
    }

    public Square getLocation()
    {
        return this.location;
    }

    public void setLocation(Square newLocation)
    {
        location = newLocation;
    }

    public String getPieceName()
    {
        return pieceName;
    }

}
