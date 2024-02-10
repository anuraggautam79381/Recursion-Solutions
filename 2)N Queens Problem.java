public class sum {
   static boolean issafe(char arr[][],int row,int col){
          //vertical up
 for(int i=row-1;i>=0;i--){
    if(arr[i][col]=='Q'){
      return false;
    }
  }
   //diagonal left up
  for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
    if(arr[i][j]=='Q'){
        return false;
      }
  }
 //diagonal right up
 for(int i=row-1,j=col+1;i>=0 && j<arr.length;i--,j++){
    if(arr[i][j]=='Q'){
        return false;
      }
  }
 return true;
  }

  static void nqueens(char arr[][],int row){
        //base case
        if(row==arr.length){
         printboard(arr);
         return;
        }
    for(int j=0;j<arr.length;j++){
        if(issafe(arr, row, j)){
     arr[row][j]='Q';
      nqueens(arr, row+1);//recursive call
      arr[row][j]='x';//backtrack call
    }}
    }
static void printboard(char arr[][]){
        System.out.println("---chessboard---");
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }

    public static void main(String[] args) {
        int n=4;
        char arr[][]=new char[n][n];
        //initialisation of array
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
               arr[i][j]='x';
          }
        }
      nqueens(arr, 0);
    }}