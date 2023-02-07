class Solution {
    public static boolean isValid(char val,char[][] board,int row,int col){
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[row][i] == val || board[i][col] == val)
                    return false;
                if(board[3*(row/3)+i/3][3*(col/3)+i%3] == val)
                    return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i =0 ;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char val = board[i][j];
                    board[i][j] = '.';
                    if(isValid(val,board,i,j))
                        board[i][j] = val;
                    else
                        return false;
                }
            }
        }
        return true;
    }
}
