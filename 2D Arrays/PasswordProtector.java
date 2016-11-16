import javax.swing.JOptionPane;
public class PasswordProtector{
    public static void main ( String args [] ) {
        String lastName = JOptionPane.showInputDialog("What is thy nameth? ");
        String lastNameLC = lastName.toLowerCase();
        char[] nameLCArray = lastNameLC.toCharArray();

        boolean start = true;
        boolean end = false;
        boolean pass = false;

        while (start){
            String userPassword = JOptionPane.showInputDialog("How about thy password'th thy shalt use? ");
            String userPasswordLC = userPassword.toLowerCase();
            char [] passwordLCArray = userPasswordLC.toCharArray();

            for (int index = 0; index < passwordLCArray.length; index ++ ){
                if (nameLCArray[index] == passwordLCArray[index] && nameLCArray[index + 1] == passwordLCArray[index + 1]) {
                    if (userPasswordLC.substring(index, index + lastNameLC.length()).equals(lastNameLC)){
                        System.out.println("Password defies all regulations. Please tryeth again.");
                    }
                    else{
                        pass = true;
                        index++;
                    }
                }
            }
            
            if (pass = true){
                System.out.println("Thou has't madeth a password without using thy name! ");
                start = end;
            }
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