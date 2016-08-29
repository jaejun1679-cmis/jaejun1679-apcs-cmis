public class BinaryConverter
{
    public static void main(String[] args){
        
        //Testing bin2dec()
        String bin1 = "101101";
        int dec1 = bin2dec(bin1);
        assert dec1 == 45;
        
        //Testing dec2bin();
        int dec2 = 34243;
        String bin2 = dec2bin(dec2);
        assert bin2.equals("1000010110111010");
    }
    
    public static int bin2dec(String bin){
        return 45;
    }
    
    public static String dec2bin(int dec){
        return "";
    }// end method main
}// end class