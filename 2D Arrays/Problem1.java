public class Problem1
{
    public static void main ( String args[] ) {
        int [][] grid = new int[3][4];
        
        for (int y = 0; y < grid[0].length; y++){
            for( int x = 0; x < grid.length; x++){
                grid[x][y] = (int)(Math.random() * 9);
                System.out.print(grid[x][y] + " ");
            }// end inner for
            System.out.println();
        }// end outer for
        
         for (int y = 0; y < grid[0].length; y++){
            for( int x = 0; x < grid.length; x++){
                if (grid[x][y] == 5){
                    System.out.println("There is a 5 in: " + "(" + x + "," + y + ")");
                }
            }// end inner for
        }// end outer for
        
    }// end method mian
}// end class