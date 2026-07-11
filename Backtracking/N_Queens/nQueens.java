public static boolean  isSafe(char board[][], int row, int col){
    // vartical up
for(int i=row-1;i>=0;i--){
    if(board[i][col]=='Q'){
    return false;
    }

}
    // diag left up
for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
 if(board[i][j]=='Q'){
    return false;
    }
}
    // diag right up
for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
 if(board[i][j]=='Q'){
    return false;
    }
}
return true;
}

public static void nQueens(char board[][],int row){

    if(row == board.length){
        count++;
    printQueens(board);    
        return;
    }
    
    for(int i=0;i<board.length;i++){
        if(isSafe(board,row,i)){
    board[row][i]='Q';
    nQueens(board, row+1);
    board[row][i]='X';
        }
    }

}
public static void printQueens(char board[][]){
    System.out.println("_________");
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}
//count the no.of solctions
static int count=0;


public static void main(String[] args) {
    int n=4;
    char board[][]= new char[n][n];
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        board[i][j]='X';
    }
}
    nQueens(board, 0);
System.out.println("Total no.of soluctions are: "+count);
}