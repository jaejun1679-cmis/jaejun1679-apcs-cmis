import javax.swing.JOptionPane;
public class PasswordProtector{
    public static void main ( String args [] ) {
        String lastName = JOptionPane.showInputDialog("What is thy nameth? ");
        String lastNameLowerCase = lastName.toLowerCase();
        
        //char [][] nameDetails = new char [2][lastName.length()];
        
        char[] lastNameArray = lastName.toCharArray();
        char[] lastNameLowerCaseArray = lastNameLowerCase.toCharArray(); //can I merge these two?
        
        
        String userPassword = JOptionPane.showInputDialog("How about thy password'th thy shalt use? ");
    }
}

//find out how to mix the two array
//start comparing the userPassword and the two arrays
//use index wisely to pinpoint similarities within the password and the name