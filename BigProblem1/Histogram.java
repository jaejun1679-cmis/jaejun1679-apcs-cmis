import javax.swing.JOptionPane;
public class Histogram {
    public static void main ( String args [] ) 
    {
        String userinput = JOptionPane.showInputDialog( "Insert any number: "); //userinput number
        int intuserinput = Integer.parseInt( userinput ); //convert userinput to int

        int [] numberrange = new int [99]; //defined first array
        int [] stackedtimes = new int [99]; //defined second array

        for (int index = 0; index <= intuserinput; index++) //Generate numbers and put in array
        {
            int numbergenerated =  (int) Math.random() * 99;            
            if ( numberrange [numbergenerated] == numbergenerated ) 
            {
                stackedtimes[index] += 1;
            }
        }//end first for loop

        for (int index = 0; index == 99 ; index++) //Print array with correct #'#'
        {
            System.out.println( index + ":" + ( "#" * stackedtimes[index] ));
        }//end second for loop
    }//end method main
}//end class