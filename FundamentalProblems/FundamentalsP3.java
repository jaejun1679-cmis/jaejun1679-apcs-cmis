import javax.swing.JOptionPane;

public class FundamentalsP3
{
    public static void main  (String args[] )
    {
       String inputA = JOptionPane.showInputDialog( "Please insert a number: ");
       
       int num1 = Integer.parseInt( inputA );
       if ( num1 % 2 == 0)
       {
        System.out.println( "The number is an even number." );
       }// end if
       else 
       {
        System.out.println( "The number is an odd number. " );
       }
    }// end method main
}// end class