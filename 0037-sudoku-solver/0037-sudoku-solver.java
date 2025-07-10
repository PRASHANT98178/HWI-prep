class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    private boolean solve(char[][] board) {
        // Find the position with the fewest possibilities
        int[] emptyPos = findEmptyPosition(board);
        int row = emptyPos[0];
        int col = emptyPos[1];
        
        // If no empty position is found, the board is solved
        if (row == -1 && col == -1) {
            return true;
        }
        
        // Try placing digits 1-9
        for (char digit = '1'; digit <= '9'; digit++) {
            if (isValid(board, row, col, digit)) {
                // Place the digit
                board[row][col] = digit;
                
                // Recursively try to solve the rest of the puzzle
                if (solve(board)) {
                    return true;
                }
                
                // If placing the digit didn't lead to a solution, backtrack
                board[row][col] = '.';
            }
        }
        
        return false;
    }
    
    private int[] findEmptyPosition(char[][] board) {
        int[] result = {-1, -1};
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        
        return result;
    }
    
    private boolean isValid(char[][] board, int row, int col, char digit) {
        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit) {
                return false;
            }
        }
        
        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }
        
        // Check 3x3 box
        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[boxRow + i][boxCol + j] == digit) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
