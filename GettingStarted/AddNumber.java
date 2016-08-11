import javax.swing.JOptionPane;

public class AddNumber{
  public static void main ( String args[] ) 
   {
    String numberA = JOptionPane.showInputDialog( "Type a number: " );
    String numberB = JOptionPane.showInputDialog( "Type another number: " );
    System.out.println("The numbers you chose are: " + numberA + " and " + numberB + ".");
    
    int number1 = Integer.parseInt( numberA );
    int number2 = Integer.parseInt( numberB );
        
    int Add = number1 + number2;
    int Sub = number1 - number2;
    int Div = number1 / number2;
    int Mul = number1 * number2;
    int MDiv = number1 % number2;
    
    System.out.println(Integer.toString(number1) + "+" + Integer.toString(number2) + "=" + Integer.toString (Add));
    System.out.println(Integer.toString(number1) + "-" + Integer.toString(number2) + "=" + Integer.toString (Sub));
    System.out.println(Integer.toString(number1) + "/" + Integer.toString(number2) + "=" + Integer.toString (Div));
    System.out.println(Integer.toString(number1) + "*" + Integer.toString(number2) + "=" + Integer.toString (Mul));
    System.out.println(Integer.toString(number1) + "%" + Integer.toString(number2) + "=" + Integer.toString (MDiv));
  } 
}