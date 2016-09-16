import javax.swing.JOptionPane;
public class Histogram {
    public static void main ( String args [] ) 
    {
        String userinput = JOptionPane.showInputDialog( "Insert any number: "); //userinput number
        int intuserinput = Integer.parseInt( userinput ); //convert userinput to int

        int [] numberrange = new int [intuserinput]; //defined first array
        int [] numbercount = new int [100];//defined second array

        int sum = 0;
        double avg = 0.0;

        for (int index = 0; index < intuserinput; index++) 
        //Generate numbers and put in array
        {
            
            numberrange[index] = (int)(Math.random() * 100);
            numbercount [numberrange [ index ]] += 1;
            sum += numberrange[index];
        }//end first for loop
        avg = ((double)sum/intuserinput);

        for (int index = 0; index < numbercount.length; index++) //Print array with correct #'#'
        {
            String hasnumbers = "";
            while(numbercount[index] > 0)
            {
                hasnumbers += "#";
                numbercount[index]--;
            }
            System.out.println( index + ": " + hasnumbers);
        }//end second for loop

        int max = 0, min = 99;
        for (int index = 0; index < numberrange.length; index++)
        //finding the max and the min
        {
            if ( numberrange[index] > 0)
            //finding min and max and mode
            {
                if ( numberrange[index] < min )
                {
                    min = numberrange[index];
                }
                if ( numberrange[index] > max )
                {
                    max = numberrange[index];
                }
            }
        }

        System.out.println( "Maximum: " + max);
        System.out.println( "Minimum: " + min);
        System.out.println( "Sum: " + sum);
        System.out.println( "Average: " + avg);
        System.out.println( "Mode(s): ");

        int mode = 0;
        for (int index = 0; index < numbercount.length; index++)
        {
            if ( numbercount[index] > mode)
            {
                mode = numbercount[index];
                if ( numbercount[index] == mode)
                {
                    System.out.print(index + " ");
                }
            }
        }
    }
}