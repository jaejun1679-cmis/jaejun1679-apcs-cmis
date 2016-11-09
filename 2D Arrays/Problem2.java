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

        int sum = 0;
        int row0Sum = 0;int row1Sum = 0;int row2Sum = 0;
        int col0Sum = 0;int col1Sum = 0;int col2Sum = 0;int col3Sum = 0;
        System.out.println("GRID (3x4): \n");
        for ( int [] row : grid ) {
            for (int num : row) {
                System.out.print( num + " ");
                sum += num;
            }// end inner for2
            System.out.println();
        }// end outer for2

        //computating vlaues from the 2D array
        for ( int row = 0; row < grid.length; row++ ) {
            for (int col = 0; col < grid[0].length; col++) {
                if( row == 0){
                    row0Sum += grid[row][col];
                }//end if1
                if( row == 1){
                    row1Sum += grid[row][col];
                }//end if2
                if(row == 2){
                    row2Sum += grid[row][col];
                }//end if3
                if(col == 0){
                    col0Sum += grid[row][col];
                }
                if(col == 1){
                    col1Sum += grid[row][col];
                }
                if(col == 2){
                   col2Sum += grid[row][col];
                }
                if(col == 3){
                    col3Sum += grid[row][col];
                }
            }// end inner for1
        }//end o

        //printing the values
        System.out.println();
        
        System.out.println("The sum of the all the elements inside the 2D array is " + sum + ".");
        
        System.out.println("In the 0th row, the sum of all the values is " + row0Sum + ".");
        System.out.println("In the 1st row, the sum of all the values is " + row1Sum + ".");
        System.out.println("In the 2nd row, the sum of all the values is " + row2Sum + ".");
        
        System.out.println("In the 0th column, the sum is " + col0Sum + ".");
        System.out.println("In the 1st column, the sum is " + col1Sum + ".");
        System.out.println("In the 2nd column, the sum is " + col2Sum + ".");
        System.out.println("In the 3rd column, the sum is " + col3Sum + ".");
    }// end method main
}// end class