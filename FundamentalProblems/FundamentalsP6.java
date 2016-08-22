
public class FundamentalsP6
{
    public static void main ( String [] args )
    {
        int [] numbertray = new int[50];
        
        for ( int index = 0; index < numbertray.length; index ++ ) 
        {
         double value = Math.random() * 100;
         numbertray[ index ] =  (int) value;
        }// end for 
        
        for ( int index = 0; index < numbertray.length; index ++ ) 
        {
         System.out.println( numbertray[ index ] ) ;
        }
    }// end method main
}// end class
