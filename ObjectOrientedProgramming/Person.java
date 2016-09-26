

public class Person
{
    private int age = 50;
    private boolean gender = true;
    //male -> fase...female -> true

    public Person()
    {
        this.age = (int) Math.random() * 99 + 1;         
    }

   
    public double getYearsLeft()
    {
        double yearsLeft;
        if (gender == true)
        {
            yearsLeft = 86.8 - (double)age;
        }
        else
        {
            yearsLeft = 80.5 - (double) age;
        }
        return yearsLeft;
    }
}
