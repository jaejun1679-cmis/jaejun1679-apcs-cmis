import java.util.Random;

public class FundamentalsP4
{
    public static void main  (String args[] )
    {
     for(int value = 1; value <= 10; value++)
     {
         int squareofvalue = value * value;
         
         Random randomofvalue = new Random();
         int randomofvalueB = randomofvalue.nextInt( squareofvalue + value);
         
         
         System.out.println( value + "\t" + squareofvalue + "\t" + randomofvalueB );
        }
    }
}
