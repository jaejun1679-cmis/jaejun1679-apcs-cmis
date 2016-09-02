import javax.swing.JOptionPane;

public class BinaryConverter
{
    public static void main(String[] args){
        //Testing bin2dec()
        String bin1 = "101010";
        int dec1 = bin2dec(bin1);
        assert dec1 == 10;

        //Testing dec2bin();
        int dec2 = 34243;
        String bin2 = dec2bin(dec2);
        assert bin2.equals("");
    }

    public static int bin2dec(String bin1)
    {
        int totaldecvalue = 0;
        for(int index = bin1.length() - 1; index >= 0; index--)
        {
            if( bin1.charAt( index ) == '1')
            {
                int expooftwo = ((bin1.length() - 1) - index); 
                totaldecvalue += Math.pow (2, expooftwo);
            }
            
            else 
            {
                totaldecvalue += 0; 
            }
        }
        System.out.println ( totaldecvalue );
        
        return 10;        
    }

    public static String dec2bin(int dec){
        return "";
    }// end method main
}// end class