public class FundamentalsP5
{
    public static void main ( String args [] ) 
    {
       String [] favoritemovies = new String [3];      
       favoritemovies [0] = "The Silence of the Lambs";
       favoritemovies [1]= "Se7en";
       favoritemovies [2] = "Zootopia";
      
       String [] favoritesongs = new String [3];      
       favoritesongs [0] = "Light It Up - Major Lazer";
       favoritesongs [1] = "Hotline Bling - Drake ";
       favoritesongs [2] = "Under Pressure - Logic";
      
      
       for ( int index = 0; index < favoritemovies.length; index++ )
       {
         System.out.println ( favoritemovies[index] + "\n" + "\n" );        
       } // end for
       
       int count = 0;
       while ( count < favoritesongs.length)
       {
        System.out.println ( favoritesongs[count] + "\n" + "\n");
        count ++;
        }// end while
    } // end method main     
}// end class

