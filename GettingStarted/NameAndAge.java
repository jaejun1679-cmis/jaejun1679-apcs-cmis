import java.util.Scanner;

public class NameAndAge{
  public static void main ( String args[] ) 
  {
    System.out.println( "Hi. What is your name?" );
    
    Scanner name = new Scanner( System.in );   
    
    String namestatement = name.nextLine();
    
    System.out.println( "And you're age is?" );
     
    Scanner age = new Scanner( System.in );   
    
    String agestatement = name.nextLine();
    
    System.out.println("Hello " + namestatement + "! You are " + agestatement + " years old.");
  } 
}