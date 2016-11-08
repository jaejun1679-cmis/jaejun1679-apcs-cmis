public class Problem2 {
    public static void main (String args[]) {
        int [][] grid = new int [3][5];
        
        for ( int row = 0; row < grid.length; row++ ) {
            for (int col = 0; col < grid[0].length; col++) {
                if( row == 0){
                    grid[row][col] = col + 1;
                }//end if1
                if( row == 1){
                    grid[row][col] = col + 6;
                }//end if2
                if(row == 2){
                    grid[row][col] = col + 11;
                }//end if3
            }// end inner for1
        }//end outer for1
        
        int sum;int rowSum;int colSum;
        
        for ( int [] row : grid ) {
            for (int num : row) {
                System.out.print( num + " ");
            }// end inner for2
            System.out.println();
        }// end outer for2
        
    }// end method main
}// end class