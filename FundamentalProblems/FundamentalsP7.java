public class FundamentalsP7
{
    public static void main ( String [] args )
    {
        int [] numbertray = new int[10];        
        for ( int index = 0; index < 10; index ++ ) 
        {
            double value = Math.random() * 100;
            numbertray[ index ] =  (int) value;
        }// end for 
        
        int count = 0;
        while( count < numbertray.length )
        {
            System.out.print ( numbertray [ count ] + " ");
            count++;        
        }//end while
    }// end method main
}// end class