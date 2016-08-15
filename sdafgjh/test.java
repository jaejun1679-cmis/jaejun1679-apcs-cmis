public class test
{ public static void main( String[] args ) 
  { for( int ctr = 0; ctr < 10; ctr++ ) {
               System.out.println( "The value of ctr is: " + ctr );
            }//end for
           
    int [] nums = new int[12];
    System.out.println( "The length of nums is: " + nums.length );
           
    for( int index = 0; index < nums.length; index++ )
    {
        nums[ index ] = index * 2;
    }//end for
            
    for ( int index = 0; index < nums.length; index++ )
    {
            System.out.println( "The value is: " + nums[ index ] );
    } //end for
          } // end method main 
} // end class 