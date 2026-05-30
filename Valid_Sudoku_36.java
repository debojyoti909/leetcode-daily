class Solution {
    public boolean isValidSudoku(char[][] board) {
       return solver(board); 
    }
    public boolean solver(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                 if(board[i][j] != '.'){ 
                    char c = board[i][j];
                    board[i][j] = '.'; 
                    if(!isValid(board, i, j, c)){
                        return false;
                    }
                    board[i][j] = c; 
                }

            //     if(board[i][j]=='.'){
            //         for(char c='1';c<='9';c++){
            //             if(isValid(board,i,j,c)){
            //             board[i][j]=c;

            //         if(solver(board)==true){
            //         return true;
            //         }
            //         else {board[i][j]='.';}
                        
                    
            //         }
            //     }
            //     return false;
            // }
        }
        
    }return true;
    }

        public boolean isValid(char[][]board,int row,int col,char c){
            for(int i=0;i<9;i++){
                if(board[row][i]==c){
                    return false;
                }
                if(board[i][col]==c){
                    return false;
                }
                if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c){
                    return false;
                }
            }
            return true;
        }
}