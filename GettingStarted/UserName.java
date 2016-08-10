import java.util.Scanner;

public class UserName{
  public static void main ( String args[] ) 
  {
    System.out.println( "Hi. What is your name?" );
    
    Scanner name = new Scanner( System.in );
    
    String statement = name.nextLine();
    
    System.out.println("Oh you are " + statement + ". Hello.");
  } 
}