package Problems.P8A;


/**
 * Write a description of class MyCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCar extends Vehicle implements Discountable
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MyCar
     */
    public MyCar()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
