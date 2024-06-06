class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i = 0;
        int j = 0;
        while (i < board.length && j < board.length) {
            if (board[i][j] != '.') {
                if (checkBox(board, board[i][j], i, j) && checkRow(board, board[i][j], i, j)
                        && checkColumn(board, board[i][j], i, j)) {
                    j++;
                    if (j == board.length && i < board.length) {
                        j = 0;
                        i++;
                    }
                } else {
                    return false;
                }
            } else {
                j++;
                if (j == board.length && i < board.length) {
                    j = 0;
                    i++;
                }
            }
        }
        return true;
    }

    public boolean checkBox(char[][] board, char filled, int row, int column) {
        int boxStartRow = (row / 3) * 3;
        int boxStartColumn = (column / 3) * 3;
        int i = boxStartRow;
        int j = boxStartColumn;
        while (i < boxStartRow + 3 && j < boxStartColumn + 3) {
            if (i != row && j != column && board[i][j] == filled) {
                return false;
            }
            j++;
            if (j == boxStartColumn + 3 && i < boxStartRow + 3) {
                j = boxStartColumn;
                i++;
            }
        }
        return true;
    }

    public boolean checkRow(char[][] board, char filled, int row, int column) {
        for (int i = 0; i < 9; i++) {
            if (i != column && board[row][i] == filled)
                return false;
        }
        return true;
    }

    public boolean checkColumn(char[][] board, char filled, int row, int column) {
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][column] == filled)
                return false;
        }
        return true;
    }
}