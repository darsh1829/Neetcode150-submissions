class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();


        for(int r=0;r<9;r++){

            for(int c=0; c<9;c++){

                if(board[r][c] == '.') continue;

                String sq = r/3 + "," + c/3;

                rows.putIfAbsent(r, new HashSet<>());
                if(rows.get(r).contains(board[r][c])){
                    return false;
                } 
                rows.get(r).add(board[r][c]);

                cols.putIfAbsent(c, new HashSet<>());

                if(cols.get(c).contains(board[r][c])){
                    return false;
                }

                cols.get(c).add(board[r][c]);

                squares.putIfAbsent(sq, new HashSet<>());

                if(squares.get(sq).contains(board[r][c])){
                    return false;
                }
                squares.get(sq).add(board[r][c]);
            }
        }

        return true;
    }
}
