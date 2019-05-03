public class Piece {
    private String pieceName;
    private Square location;
    private String[] piecesNames =
            {"T-Rex", "Spinosaur", "Diplodocus", "Stegosaur", "Pteranodon",
            "Utahraptor", "Carnotaur", "Triceratops"};
    private static int counter = 0;


    public Piece() {
        pieceName = piecesNames[counter];
        location = new Square("Go");
        if (counter >= 8) {
            counter = 0;
        } else {
            ++counter;
        }
    }

    public Square getLocation()
    {
        return this.location;
    }

    public String getPieceName()
    {
        return pieceName;
    }
}
