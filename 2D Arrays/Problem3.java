import javax.swing.JOptionPane;

public class Problem3 {
    public static void main ( String args [] ) {
        int row = Integer.parseInt(JOptionPane.showInputDialog("How many numbers of row would you like? "));
        int col = Integer.parseInt(JOptionPane.showInputDialog("Well, how about columns?"));
        
        int [][] grid = new int [row][col];
        
        for (int y = 0; y < grid.length; y++){
            for(int x = 0; x < grid.length; x++){
                grid[x][y] = (y + 1) * (x + 1);
            }            
        }
        
        for (int y = 0; y < grid.length; y++){
            for(int x = 0; x < grid.length; x++){
                System.out.print(grid[x][y] + " ");
            }
            System.out.println();
        }
    }
}

//fix the aesthetics of this class