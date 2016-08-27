public class FundamentalsP7
{
    public static void main ( String [] args )
    {
        int [] numbertray = new int[10];

        for ( int index = 0; index < 10; index ++ ) 
        {
            double value = Math.random() * (100 - (-100) +1) - 100;
            numbertray[ index ] =  (int) value;

            System.out.print( numbertray[index] + " ");
        }
 
        for ( int index = 0; index < 10; index ++ ) 
        {
            if ( numbertray [index] > 0)
            {
                System.out.println ( numbertray [index]); 
            }
        }
    }
} 


 