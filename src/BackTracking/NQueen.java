package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
    //1. solve the nth Queen
    public List<List<String>> solveNQueens(int n){
        char[][]  board = new char[n][n];

        for (int i=0; i<n; i++){
            Arrays.fill(board[i], '.');
        }

        List<List<String>> result = new ArrayList<>();
        backTrack(n, board, 0, result);
        return result;
    }

    //Bactracking
    private void backTrack(int n, char[][] board, int row, List<List<String>> result){
        if (row == n){
            result.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++){
            if (canPlaceQueen(board, row, col)){
                board[row][col] = 'Q';
                backTrack(n, board, row + 1, result);
                board[row][col] = '.';
            }
        }
    }

    //3. is the queen is safety
    private boolean canPlaceQueen(char[][] board, int row, int col){
        //column check
        for (int i= row - 1; i>=0; i--){
            if (board[i][col] == 'Q'){
                return false;
            }
        }

        //Diagonal
        for (int i=row - 1, j=col -1; i>=0 && j>=0; j--, i--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        //Anti-diagonal
        for (int i=row - 1, j=col + 1; i>=0 && j<board.length; j++, i--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }


    //2. Construct the board
    private List<String> constructBoard(char[][] board){
        List<String> result = new ArrayList<>();

        for(int i=0; i< board.length; i++) {
            result.add(new String(board[i]));
        }
        return result;
    }


    public static void main(String[] args){
        int n= 4;
        NQueen queen = new NQueen();
        List<List<String>> solutions =   queen.solveNQueens(n);

        for (List<String> solution: solutions){
            for (String row: solution){
                System.out.println("[" +row + "]");
            }
            System.out.println();
        }
    }
}
