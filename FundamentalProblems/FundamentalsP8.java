public class FundamentalsP8
{
    public static void main ( String [] args )
    {
        String [] mefriends = new String [3];        
        for ( int index = 0; index < 3; index ++ ) 
        {
            mefriends [0] = "Folk";
            mefriends [1] = "Ben";
            mefriends [2] = "Min";
        }

        double randomnumber = Math.random() * 3;
        int changefriend = (int) randomnumber;
        mefriends [ changefriend ] = "Jesus";

        for (int index = 0; index < 3; index++)
        {
            if( mefriends[index].equals( "Jesus" ) )
            {
                System.out.print( "\n" + "We found Jesus!!!" + "\n");
            }
            else
            {
                System.out.print( "\n" + "Jesus was not found in mefriends [" + index + "]"  + "\n" );
            }
        }
    }
}