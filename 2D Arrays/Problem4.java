import javax.swing.JOptionPane;
public class Problem4
{
    public static void main (String args[] )
    {
        int rowInput = Integer.parseInt(JOptionPane.showInputDialog("How many numbers of row would you like? "));
        int colInput = Integer.parseInt(JOptionPane.showInputDialog("Well, how about columns?"));

        int [][] grid = new int [rowInput][colInput];

        int alphabetIndex = 65;

        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                grid[row][col] = (alphabetIndex);
                if ( alphabetIndex == 90){
                    alphabetIndex = 64;
                }
                alphabetIndex++;
            }
        }// poplulating the 2D array

        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col ++){
                System.out.print((char)grid[row][col] + " ");
            }
            System.out.println();
        }// printing out the 2D array
    }
}