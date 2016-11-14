import javax.swing.JOptionPane;
public class FindTheZeroNow{
    public static void main ( String args [] ) {
        int row = Integer.parseInt(JOptionPane.showInputDialog("Input the amount of rows: "));
        int col = Integer.parseInt(JOptionPane.showInputDialog("Input the amount of columns: "));

        if(row  == 1 || col == 1){
            System.out.println("Guessing Game ran into an unexpected error. Please try again.");
            row = Integer.parseInt(JOptionPane.showInputDialog("Input the amount of rows: "));
            col = Integer.parseInt(JOptionPane.showInputDialog("Input the amount of columns: "));
        }

        int [][] gameBoard = new int [row][col];
        for (int y = 0; y < gameBoard.length; y++){
            for(int x = 0; x < gameBoard[0].length; x++){
                gameBoard[y][x] = (int)(Math.random() * 100 + 1);
            }             
        }

        int goalRow = (int)(Math.random() * (row - 1) + 1);
        int goalCol = (int)(Math.random() * (col - 1) + 1);       
        gameBoard[goalRow][goalCol] = 0;

        System.out.println("Here is the game board.");
        for (int y = 0; y < gameBoard[0].length; y++){
            for(int x = 0; x < gameBoard.length; x++){
                System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println("Now find out where the '0' is.");
        System.out.println();

        int guessRow = Integer.parseInt(JOptionPane.showInputDialog("Guess the row number: "));
        int guessCol = Integer.parseInt(JOptionPane.showInputDialog("Now guess the column number: "));
        int userguess = gameBoard[guessRow][guessCol];

        while ( userguess != 0){
            if ( userguess == 0){
                System.out.println("Bring this man a cookie! You have found the zero!");
                System.exit(0);
            }
            
            System.out.println("Nope. Guess again!");
            gameBoard[guessRow][guessCol] = 78;
            
            for (int y = 0; y < gameBoard[0].length; y++){
                for(int x = 0; x < gameBoard.length; x++){
                    if ( gameBoard[guessRow][guessCol] == 78){
                        System.out.print((char)gameBoard[guessRow][guessCol]);
                    }
                    else{
                       System.out.print("X "); 
                    }
                }
                System.out.println();
            }
            System.out.println();
            
            guessRow = Integer.parseInt(JOptionPane.showInputDialog("Guess the row number: "));
            guessCol = Integer.parseInt(JOptionPane.showInputDialog("Now guess the column number: "));
        }
        
        
    }
}

//find out why it is printing all N after X. 