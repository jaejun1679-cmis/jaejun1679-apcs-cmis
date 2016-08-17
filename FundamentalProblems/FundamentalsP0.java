public class FundamentalsP0
{
  public static void main ( String argv[] )
  {
    byte byteA = 10;
   byte byteB = 20;
   System.out.println( byteA );
   System.out.println( byteB );
   
   short shortA = 45;
   short shortB = -45;
   System.out.println( shortA );
   System.out.println( shortB );
   
   int intA = -2147483648;
   int intB = 2147483647;
   System.out.println( intA );
   System.out.println( intB );
   
   long longA = 100000000;
   long longB = 982390420;
   System.out.println( longA );
   System.out.println( longB );
   
   float floatA = 1.23456798f;
   float floatB = -9.87654321f;
   System.out.println( floatA );
   System.out.println( floatB );
   
   double doublePi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
   double doubleAdvogardo = 6.0221415;
   System.out.println( doublePi );
   System.out.println( doubleAdvogardo );
    
   boolean booleanA = true;
   boolean booleanB = false;
   System.out.println( booleanA );
   System.out.println( booleanB );
   
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
   
   char charA = '\u2400';
   char charB = '\u1600';
   System.out.println( charA );
   System.out.println( charB );
    }//end method main 
 }//end class