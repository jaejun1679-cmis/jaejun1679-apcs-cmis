public class FundamentalsP0
{
  public static void main ( String argv[] )
  {
    byte byteA = 10;
   byte byteB = 20;
   
   short shortA = 45;
   short shortB = -45;
   
   int intA = -2147483648;
   int intB = 2147483647;
   
   long longA = 100000000;
   long longB = 982390420;
   
   float floatA = 1.23456798f;
   float floatB = -9.87654321f;
   
   double doublePi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
   double doubleAdvogardo = 6.0221415;
    
   boolean booleanA = true;
   boolean booleanB = false;
   
   if ( booleanA == true )
   {
       System.out.println( "Yes!" );    
    }// end if
   
   else
   {
       System.out.println( "No..." );
    }//end else
    
   if ( booleanB == true )
   {
       System.out.println( "No..." );
    }//end 2nd if
   else
   {
       System.out.println( "Yes!" );
    }//end 2nd else
    }//end method main 
}//end class