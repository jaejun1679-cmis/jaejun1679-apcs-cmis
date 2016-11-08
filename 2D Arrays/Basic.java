public class Basic {
    public static void main ( String args [] ) {
        int [][] grid = new int [][] {{0,1,2,3,4}, {5,6,7,8,9}, {10,11,12,13,14}};

        for (int y = 0; y < grid.length; y++){
            for(int x = 0; x < grid.length; x++){
                System.out.print(grid[y][x]);
            }             
        }
        System.out.println();
        for (int y = 0; y < grid[0].length; y++){
            System.out.println();
            for(int x = 0; x < grid.length; x++){
                System.out.println(grid[x][y]);
            } 
        }
    }
}