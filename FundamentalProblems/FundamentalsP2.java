import javax.swing.JOptionPane;

public class FundamentalsP2
{
    public static void main  (String args[] ){
        String inputA = JOptionPane.showInputDialog( "Please insert a number: ");
        String inputB = JOptionPane.showInputDialog( "Please insert aother number: ");
        
        int num1 = Integer.parseInt( inputA );
        int num2 = Integer.parseInt( inputB );
        
        if( num1 == num2 )
        {
            System.out.println( "The value of a is " + num1 + " and it is equal to b whose value is " + num2);
        }// end if
        
         if( num1 > num2 )
        {
            System.out.println( "The value of a is " + num1 + " and it is greater than b whose value is " + num2);
        }// end if
        
         if( num1 < num2 )
        {
            System.out.println( "The value of a is " + num1 + " and it is less than b whose value is " + num2);
        }// end if
    }// end method main
}// end class
