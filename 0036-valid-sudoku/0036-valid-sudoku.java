class Solution {
    public boolean isValidSudoku(char[][] board) {
      int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                int val = board[r][c] - '1';
                int bitMask = 1 << val;
                int boxIndex = (r / 3) * 3 + (c / 3);
                if ((rows[r] & bitMask) != 0 || 
                    (cols[c] & bitMask) != 0 || 
                    (boxes[boxIndex] & bitMask) != 0) {
                    return false;
                }
                rows[r] |= bitMask;
                cols[c] |= bitMask;
                boxes[boxIndex] |= bitMask;
            }
        }
        return true;  
    }
}