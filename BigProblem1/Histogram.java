import javax.swing.JOptionPane;
public class Histogram {
    public static void main ( String args [] ) 
    {
        String userinput = JOptionPane.showInputDialog( "Insert any number: "); //userinput number
        int intuserinput = Integer.parseInt( userinput ); //convert userinput to int

        int [] numberrange = new int [100]; //defined first array

        for (int index = 0; index < intuserinput; index++) 
        //Generate numbers and put in array
        {
            int numbergenerated = (int)(Math.random() * 100);
            numberrange [numbergenerated] += 1;
        }//end first for loop

        for (int index = 0; index < 100; index++) 
        //Print array with correct #'#'
        {
            String hasnumbers = "";
            while(numberrange[index] > 0)
            {
                hasnumbers += "#";
                numberrange[index]--;
            }
            System.out.println( index + ": " + hasnumbers);
        }//end second for loop

        int max = 0, min = 99, avg = 0, sum = 0, mode = 0;

        for (int index = 0; index < numberrange.length; index++)
        //finding the max and the min
        {
            if ( numberrange[ index ] > 0 )
            {
                max = index;
            }
            if ( numberrange[ index ] < 0 )
            {
                min = index;
            }
        }
        System.out.println( "Maximum: " + max);
        System.out.println( "Minimum: " + min);
        
        for (int index = 0; index < numberrange.length; index++)
        //finding the sum
        {
            sum += numberrange[index];
        }
        avg = sum / (intuserinput);
        System.out.println( "Sum: " + sum);
        System.out.println( "Avg: " + avg);
    }
}//end method main