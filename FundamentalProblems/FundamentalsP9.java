import javax.swing.JOptionPane;
public class FundamentalsP9 {
    public static void main ( String args [] ) 
    {
        String username = JOptionPane.showInputDialog( "Please create a username: ");
        String stringpassword = JOptionPane.showInputDialog( "Please create a password: ");
        
        int intpassword = Integer.parseInt( stringpassword );
        
        String loginyesorno = JOptionPane.showInputDialog( "Would you like to login? (Yes or No) ");
        
        if (loginyesorno.equals("Yes"))
        {
            String loginusername = JOptionPane.showInputDialog( "Please insert you username: ");
            String loginpassword = JOptionPane.showInputDialog( "Please insert you password: ");
            
            int intloginpassword = Integer.parseInt( loginpassword );
            
            if(username == loginusername && intpassword == intloginpassword)
            {
                System.out.println( "You have successfully logged in");
            }
            else
            {
                System.out.println ( "Login unsuccessful…try again");
            }//end 2nd if
        }// end if
    }// end method main
}// end class