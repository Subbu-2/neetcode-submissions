class Solution {
    public boolean isValidSudoku(char[][] board) {
        // rows[r][d] = true means digit d+1 already seen in row r
        boolean[][] rows    = new boolean[9][9];
        boolean[][] cols    = new boolean[9][9];
        boolean[][] squares = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;

                int d = board[r][c] - '1'; // '1'→0, '2'→1 ... '9'→8
                int s = (r / 3) * 3 + (c / 3); // square index 0-8

                if (rows[r][d] || cols[c][d] || squares[s][d]) {
                    return false;
                }

                rows[r][d]    = true;
                cols[c][d]    = true;
                squares[s][d] = true;
            }
        }
        return true;
    }
}