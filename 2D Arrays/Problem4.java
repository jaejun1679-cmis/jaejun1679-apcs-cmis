import javax.swing.JOptionPane;
public class Problem4
{
    public static void main (String args[] )
    {
        int rowInput = Integer.parseInt(JOptionPane.showInputDialog("How many numbers of row would you like? "));
        int colInput = Integer.parseInt(JOptionPane.showInputDialog("Well, how about columns?"));

        int [][] grid = new int [rowInput][colInput];
        
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                for(int alphabetIndex = 65; alphabetIndex == alphabetIndex + 1;alphabetIndex++) {
                    grid[row][col] = ((char)alphabetIndex);              
                }
            }
        }
        
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col ++){
                System.out.print(grid[row][col]);
            }
            System.out.println();
        }        
    }
}