public class test
{
    public static void main(String[] args){
        //Testing bin2dec()
        /*String bin1 = "110011001100";
        int dec1 = bin2dec(bin1);
        assert dec1 == 10;*/

        //Testing dec2bin();
        int dec2 = 65;
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
        }
        System.out.println ( totaldecvalue );
        return 10;
    }

    public static String dec2bin(int dec2){
        int powervalue = 0;
        int originaldec2 = dec2;
        
        while (dec2 >= 0) 
        {
            dec2 = originaldec2 - (int)((Math.pow (2, powervalue)));
            
            powervalue++;
        }
        powervalue--; 
        System.out.println( powervalue );
        
        /*
        String [] digits = new String [powervalue - 2];
        
        for (int index = 0; index <= dec2 ;dec2/=2)
        {
            if( dec2 > 0)
            {
                digits [index] = Integer.toString( dec2 );
                index++;
            }
        }
        
        for (int index = digits.length - 1; index > 0; index--) 
        {
            System.out.println(digits[index]);
        }
        */
        return "";
    }
}