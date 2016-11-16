import javax.swing.JOptionPane;
public class PasswordProtector{
    public static void main ( String args [] ) {
        String lastName = JOptionPane.showInputDialog("What is thy nameth? ");
        String lastNameLowerCase = lastName.toLowerCase();
        char[] lastNameLowerCaseArray = lastNameLowerCase.toCharArray();
        
        char firstLetter = lastNameLowerCaseArray[0];
        char secondLetter = lastNameLowerCaseArray[1];
        
        boolean start = true; 
        boolean stop = true;
        
        while (start){
            String userPassword = JOptionPane.showInputDialog("How about thy password'th thy shalt use? ");
            String userPasswordLowerCase = userPassword.toLowerCase();
            
        }
        
        
        
    }
}

//find out how to mix the two array
//start comparing the userPassword and the two arrays
//use index wisely to pinpoint similarities within the password and the name

/*for(int index = 0; index < lastNameArray.length; index++ )
{
System.out.println(lastNameArray[index]);
}*/ // for testing purposes