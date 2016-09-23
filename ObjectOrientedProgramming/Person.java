

public class Person
{
    private int age = 50;
    private boolean gender = true;
    //male -> fase...female -> true


    public Person()
    {
        
    }

   
    public double getYearsLeft()
    {
        int yearsLeft;
        if (gender == true)
        {
            yearsLeft = 86.8 - age;
        }
        else
        {
            yearsLeft = 80.5 - age;
        }
        return yearsLeft;
    }
}
