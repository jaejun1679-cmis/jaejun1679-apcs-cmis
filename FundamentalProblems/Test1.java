import javax.swing.JOptionPane;
public class Test1 {
    public static void main ( String args [] ) 
    {
        String userinput = JOptionPane.showInputDialog( "Type any number between 1 ~ 50: "); //userinput number
        int intuserinput = Integer.parseInt( userinput ); //convert userinput to int

        int [] numbers = new int [intuserinput]; //defined array

        if (intuserinput > 50 || intuserinput < 1)
        {
            System.out.print("That ain't right.");
            System.exit(0);
        }
        
        for (int index = 0; index < numbers.length; index++) 
        //Generate numbers and put in array
        {
            numbers[index] = (int)(Math.random() * 50) + 1;
            System.out.println(index +": "+ numbers[index]);
        }//end first for loop
        
        for (int index = numbers.length - 1; index >= 0; index--) 
        //Generate numbers and put in array
        {
            int intnumber = (int) numbers[index];

            if (intnumber % 2 == 0)
            {
                System.out.print(index + ": ");
                for (int index2 = 0; index2 < intnumber; index2++) 
                {
                    System.out.print("E");
                }
                System.out.println(numbers[index]);
            }//Finding the E's

            if (intnumber % 2 != 0)
            {
                System.out.print(index + ": ");
                for (int index2 = 0; index2 < intnumber; index2++) 
                {
                    System.out.print("O");
                }
                System.out.println(numbers[index]);
            }//Finding the O's
        }//end first for loop
    }// end method main
}// end class