import javax.swing.JOptionPane;
public class FundamentalsP9 {
    public static void main ( String args [] ) 
    {
        String username = JOptionPane.showInputDialog( "Please create a username: ");
        String stringpassword = JOptionPane.showInputDialog( "Please create a password: ");

        int intpassword = Integer.parseInt( stringpassword );

        String loginusername = JOptionPane.showInputDialog( "Please insert you username: ");
        String loginpassword = JOptionPane.showInputDialog( "Please insert you password: ");

        int intloginpassword = Integer.parseInt( loginpassword );

        if(username.equals(loginusername) && intpassword == intloginpassword)
        {
            System.out.println( "You have successfully logged in");
        }
        else
        {
            System.out.println ( "Login unsuccessful…try again");
        }
    }
}
