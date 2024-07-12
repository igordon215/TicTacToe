package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */

//To determine if a matrix represents a valid winning tic-tac-toe board, we need to check if any of the rows, columns, or diagonals contain three consecutive X's or O's.
//

//
//Next, we would check the columns. We would iterate through each column of the matrix and check if all three elements in the column are either X's or O's.
// If we find a column that contains three consecutive X's or O's, then the board is a valid winning tic-tac-toe board.
//
//Finally, we would check the diagonals. We would check the two diagonals of the matrix to see if all three elements in the diagonal are either X's or O's.
// If we find a diagonal that contains three consecutive X's or O's, then the board is a valid winning tic-tac-toe board.
//
//If none of the rows, columns, or diagonals contain three consecutive X's or O's, then the board is not a valid winning tic-tac-toe board.
public class Board {
    private Character [] [] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }
//We can start by checking the rows. We would iterate through each row of the matrix and check if all three elements in the row are either X's or O's.
// If we find a row that contains three consecutive X's or O's, then the board is a valid winning tic-tac-toe board.
    public Boolean isInFavorOfX() {
       for (int i = 0; i < board.length; i++){
           if(board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X'){
               return true;
           }
           if (board[0][i] == 'X' && board [1][i] == 'X' && board [2][i] == 'X'){
               return true;
           }
       }
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'){
            return true;
        }
        if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'){
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < board.length; i++){
            if(board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O'){
                return true;
            }
            if (board[0][i] == 'O' && board [1][i] == 'O' && board [2][i] == 'O'){
                return true;
            }
        }
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
            return true;
        }
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'){
            return true;
        }
        return false;

    }

    public Boolean isTie() {
        if ((isInFavorOfX()) && (isInFavorOfO())){
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfO()){
            return "O";
        }
        if (isInFavorOfX()){
            return "X";
        }
        return "";
    }

}
