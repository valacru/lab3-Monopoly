public class Player {
    private String playerName;
    private Piece piece;

    public Player(String newPlayerName)
    {
        playerName = newPlayerName;
        piece = new Piece();
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public Piece getPiece()
    {
        return piece;
    }


    public void takeTurn(Board board, Die die)
    {
        int nbMove = die.roll() + die.roll();
        String oldLoc = piece.getLocation().getSquareName();
        piece.setLocation(board.getSquare(oldLoc, nbMove));

        System.out.println(playerName + " rolled a " + nbMove);
        System.out.println(playerName + " arrived on " + piece.getLocation().getSquareName());
    }
}
