public class PraticeTest {
    public static void main ( String args [] ) {
        int [][] grid = new int [20][20]; //creating the 2D array

        for (int y = 0; y < grid.length; y++){
            for(int x = 0; x < grid[0].length; x++){
                grid[y][x] = (int)(Math.random() * 99);
            }//end for        
        }//end for
        //populating the 2D array

        int [] result = new int[2];

        int max = 0;
        int sum = 0;

        //all row major things here
        System.out.println("Row Major:");
        for (int y = 0; y < grid.length; y++){
            for(int x = 0; x < grid.length; x++){
                sum += grid[y][x];
                System.out.print(grid[y][x] + " ");
            }
            if( max < sum ){
                max = sum;
                result[0] = sum;
                result[1] = y;
                sum = 0;
            }
            System.out.println();
        }
        System.out.println();
        for (int index = 0; index < result.length; index++){
            if ( index == 0 ){
                System.out.println("Sum: " + result[index]);
            }
            else{
                System.out.println("Index: " + result[index]);
            }
        }

        System.out.println();

        //all column major things here
        System.out.println("Column Major:");
        for (int y = 0; y < grid.length; y++){

            for(int x = 0; x < grid[0].length; x++){
                sum += grid[y][x];
                System.out.print(grid[x][y] + " ");
            } 
            System.out.println();
        }
    }
}