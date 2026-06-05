

class Solution {

    public boolean valid(char[][] board, int sr, int sc, int er, int ec) {

        Set<Character> set = new HashSet<>();

        for (int r = sr; r < er; r++) {
            for (int c = sc; c < ec; c++) {

                if (board[r][c] == '.') {
                    continue;
                }

                if (set.contains(board[r][c])) {
                    return false;
                }

                set.add(board[r][c]);
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        // Check Rows
        for (int r = 0; r < 9; r++) {

            Set<Character> set = new HashSet<>();

            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') {
                    continue;
                }

                if (set.contains(board[r][c])) {
                    return false;
                }

                set.add(board[r][c]);
            }
        }

        // Check Columns
        for (int c = 0; c < 9; c++) {

            Set<Character> set = new HashSet<>();

            for (int r = 0; r < 9; r++) {

                if (board[r][c] == '.') {
                    continue;
                }

                if (set.contains(board[r][c])) {
                    return false;
                }

                set.add(board[r][c]);
            }
        }

        // Check 3x3 Boxes
        for (int sr = 0; sr < 9; sr += 3) {
            for (int sc = 0; sc < 9; sc += 3) {

                if (!valid(board, sr, sc, sr + 3, sc + 3)) {
                    return false;
                }
            }
        }

        return true;
    }
}