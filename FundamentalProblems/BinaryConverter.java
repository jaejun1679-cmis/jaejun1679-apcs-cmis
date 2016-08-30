import javax.swing.JOptionPane;

public class BinaryConverter
{
    public static void main(String[] args){
        String inputfromuser = JOptionPane.showInputDialog( "Please insert a number in binary: ");
        
        int count = 0;
        
        for(int index = 0; index < inputfromuser.length(); index++)
        {
            if( inputfromuser.charAt(index = 0) == 1 )
            {
                count++;
                index++;
            }
        }

        System.out.println(count);
    }

    
    public static int bin2dec(String bin)
    {
        return 0;
    }
    

        public static String dec2bin(int dec){
        return "";
    }// end method main
}// end class