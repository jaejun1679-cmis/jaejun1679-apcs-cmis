import javax.swing.JOptionPane;

public class BinaryConverter
{
    public static void main(String[] args){
        
        //Testing bin2dec()
        String bin1 = "101101";
        int dec1 = bin2dec(bin1);
        assert dec1 == 0;
        
        //Testing dec2bin();
        int dec2 = 34243;
        String bin2 = dec2bin(dec2);
        assert bin2.equals("");
    }
        
    public static int bin2dec(String bin)
    {
        for(int index = bin.length(); index < 0; index--)
        {
            int totaldecvalue = 0;            
            if( bin.charAt( index++ ) == 1)
            {
                totaldecvalue = 2 ^ index;
            }
            
            
        }
        return 0;
    }
    
        public static String dec2bin(int dec){
        return "";
    }// end method main
}// end class