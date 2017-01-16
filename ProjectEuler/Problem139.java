import javax.swing.*;
import java.lang.Math.*;

public class Problem139
{
    public void main (String args []){
        int count = 1;
        int goal = 100000000;
        int a;int b;int c;

        for(int index = 1; index < goal - 1; index++){
            a = Math.pow(3 * index, 2);
            b = Math.pow(4 * index , 2);
            c = Math.pow(5 * index , 2);

            if( ( a + b ) == c ){
                count += 1;
            }
            
            System.out.println(count);
            //i3-3220
            //intel itnergrated graphics
        }    
    }   
}
