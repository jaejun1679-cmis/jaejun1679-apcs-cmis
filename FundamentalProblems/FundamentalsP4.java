import java.util.Random;

public class FundamentalsP4
{
    public static void main  (String args[] )
    {
     for(int value = 1; value <= 10; value++)
     {
         int squareofvalue = value * value;
         int randomofvalue = Math.random( value, squareofvalue );
         
         System.out.println( value );
         System.out.println( "\t" + squareofvalue );        
         
         System.out.println( randomofvalue );
         
        }
    }
}
