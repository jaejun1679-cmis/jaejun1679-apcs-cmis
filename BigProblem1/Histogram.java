import javax.swing.JOptionPane;
public class Histogram {
    public static void main ( String args [] ) 
    {
        String userinput = JOptionPane.showInputDialog( "Insert any number: "); //userinput number
        int intuserinput = Integer.parseInt( userinput ); //convert userinput to int

        int [] numberrange = new int [99]; //defined first array
        int max = 0, min = 0, mode = 0, avg = 0, sum = 0;

        for (int index = 0; index <= intuserinput; index++) 
        //Generate numbers and put in array
        {
            int numbergenerated = (int) (Math.random() * 100);
            numberrange [numbergenerated] += 1;
        }//end first for loop

        
        for (int index = 0; index < 100; index++) //Print array with correct #'#'
        {
            String hasnumbers = "";
            
            /*
            for (int index2 = 0; index2 < numberrange.length; index++)
            {
                
            }
            */
            System.out.println( index + ": " + hasnumbers);
                        
        }//end second for loop
    }//end method main
}//end class