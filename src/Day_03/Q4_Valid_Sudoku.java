package Day_03;

import java.util.Set;
import java.util.HashSet;

class solution_of_D3Q4
{
    public boolean isValidSudoku(char[][] board)
    {
            Set<String> n = new HashSet<>();
            for(int i=0; i<9; i++)
            {
                for(int j=0; j<9; j++)
                {
                    char num = board[i][j];
                    if(num!='.')
                    {
                        if( !n.add(num+" in row "+i) || !n.add(num+" in col "+j) || !n.add(num+" in block "+i/3+"-"+j/3) )
                            return false;
                    }
                }
            }
            return true;
    }
}

public class Q4_Valid_Sudoku
{
    public static void main(String[] args)
    {
        solution_of_D3Q4 obj = new solution_of_D3Q4();
        char[][] board ={
                            {'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}
                        };
        System.out.println(obj.isValidSudoku(board));
    }
}
