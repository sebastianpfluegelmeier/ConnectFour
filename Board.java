//Andi == gelb
//Gernot == hellgrün
//Sebastian == blau
//konsti == pink//
//Ana == weißblau
//jakob == i bims 1 orange vong farbe her
//yasin == Türkis
import java.util.ArrayList;
import java.util.Scanner;

public class Board
{
    private ArrayList<Piece> pieces;
    private int xSize;
    private int ySize;

    public Board(int xSize, int ySize)
    {
        pieces = new ArrayList<Piece>();
        setXSize(xSize);
        setYSize(ySize);
    }

    public void insertPiece(int xPosition, boolean player1)
    {
        Piece newPiece;
        newPiece = new Piece(this, player1, xPosition);
        pieces.add(newPiece);
    }

    public int getPiecesAt(int xPosition)
    {
        int piecesAt = 0;
        for (int i = 0; i < pieces.size(); i++)
        {
            Piece currentPiece = pieces.get(i);
            if(currentPiece.getXPosition() == xPosition)
            {
                piecesAt++;
            }
        }
        return piecesAt;
    }

    public void setXSize(int xSize)
    {
        this.xSize = xSize;
    }

    public void setYSize(int ySize)
    {
        this.ySize = ySize;
    }

    public void printBoard()
    {
        for(int y = ySize - 1; y >= 0; y--)
        {
            for (int x=0; x < xSize; x++)
            {
                boolean player1 = false;
                boolean player2 = false;

                for (int i = 0; i < pieces.size(); i++)
                {
                    Piece currentPiece = pieces.get(i);
                    if((currentPiece.getYPosition() == y) && (currentPiece.getXPosition() == x))
                    {
                        player1 = currentPiece.getPlayer1();
                        player2 = !currentPiece.getPlayer1();
                    }
                }

                if(player1 == true)
                {
                    System.out.print("#");
                }
                else if (player2 == true)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("•");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Board board = new Board(7, 6);
        Scanner scanner = new Scanner(System.in);
        boolean player1 = true;
        while (true) {
            String commandlineInput = scanner.nextLine();
            int commandlineInputInt = Integer.parseInt(commandlineInput);
            board.insertPiece(commandlineInputInt, player1);
            board.printBoard();
            player1 = !player1;
        }
    }
}
