public class FundamentalsP7
{
    public static void main ( String [] args )
    {
        int [] numbertray = new int[10];
        
        for ( int index = 0; index < numbertray.length; index ++ ) 
        {
            double value = Math.random() * 100;
            numbertray[ index ] =  (int) value;
            System.out.println( numbertray[ index ] );
            
            
        }// end for 
    }// end method main
}// end class