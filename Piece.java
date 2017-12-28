        /*
    3   . . . .
y   2   . . . 0
    1   # . . 0
    0   # 0 # #

        0 1 2 3
           x

offiziell: x= 7 , y=6

        */
public class Piece
{
    private boolean player1;
    private int xPosition;
    private int yPosition;

    public Piece(Board board, boolean player1, int xPosition)
    {
        setXPosition(xPosition);
        setYPosition(board.getPiecesAt(xPosition));
        setPlayer1(player1);
    }

    public int getXPosition()
    {
        return xPosition;
    }

    public int getYPosition()
    {
        return yPosition;
    }

    public boolean getPlayer1()
    {
        return player1;
    }


    public void setXPosition(int xPosition)
    {
        this.xPosition = xPosition;
    }

    public void setYPosition(int yPosition)
    {
        this.yPosition = yPosition;
    }

    public void setPlayer1(boolean player1)
    {
        this.player1 = player1;
    }


}
