import java.util.*;
public class NQueenProblem
{

    public boolean isSafe(int row,int col,char[][] board)
    {
        // hrizontal check
        for(int j=0; j<board.length;j++)
        {
            if(board[row][j] == 'Q')
            {
                return false;
            }
        }

        // Vertical check
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        // upper left
        int r = row;
        for(int c = col;c>=0 && r>=0;c--,r--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }
        
        // upper right
        r = row;
        for(int c = col;c<board.length &&r>=0;c--,r++)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }
        
        // lower left
        r = row;
        for(int c=col;c>=0 && r<board.length;c++,r-- )
        {
            if(board[r][c]== 'Q')
            {
                return false;
            }
        }

        // lower right
        for(int c=col;c<board.length && r<board.length;r++,c++)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char[][] board,List<List<String>> allBoard)
    {
        String row ="";
        List<String> newBoard = new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            row= "";
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j] == 'Q')
                {
                    row += 'Q';
                }
                else{
                    row += 'N';
                }
            }
            
        }
        allBoard.add(newBoard);
    }

    public void helper(char[][] board,List<List<String>> allBoards,int col)
    {
        for(int row = 0; row < board.length;row++)
        {
            if(col == board.length)
            {
                saveBoard(board,allBoards);
                return;
            }
            if(isSafe(row,col,board))
            {
                board[row][col] = 'Q'; 
                helper(board, allBoards, col+1);
                board[row][col] = 'N';
            }

       }
    }
    public List<List<String>>solveNQueens(int n)
    {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n]; 
        helper(board, allBoards, 0);
        return allBoards;
    }
}