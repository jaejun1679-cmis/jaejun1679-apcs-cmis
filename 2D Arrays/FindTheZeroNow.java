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

        int [][] gameBoard = new int [row][col];//this is my gameBoard

        for (int y = 0; y < gameBoard.length; y++){
            for(int x = 0; x < gameBoard[0].length; x++){
                gameBoard[y][x] = (int)(Math.random() * 100 + 1);
            }             
        }

        int goalRow = (int)(Math.random() * col); ;
        int goalCol = (int)(Math.random() * row); ;
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
        boolean test = true;
        int userguess = gameBoard[guessRow][guessCol];

        if ( userguess == 0){
            System.out.println("Bring this man a cookie! You have found the zero!");
            System.exit(0);
        }
        else {
            while ( test ){
                if ( userguess == 0){
                    System.out.println("Bring this man a cookie! You have found the zero!");
                    System.exit(0);
                }
                userguess = gameBoard[guessRow][guessCol];
                System.out.println("Nope. Guess again!");
                gameBoard[guessRow][guessCol] = 101;

                for (int y = 0; y < gameBoard[0].length; y++){
                    for(int x = 0; x < gameBoard.length; x++){
                        if ( gameBoard[y][x] == 1000){
                            System.out.print("N ");
                        }
                        else{
                            System.out.print("X "); 
                        }
                    }
                    System.out.println();
                }
                System.out.println();

                guessRow = Integer.parseInt(JOptionPane.showInputDialog("Guess the row number again: "));
                guessCol = Integer.parseInt(JOptionPane.showInputDialog("Now guess the column number once more: "));
            }
        }
    }
}