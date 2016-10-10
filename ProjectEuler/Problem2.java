public class Problem2 
{
    public static void main ( String args [] ) 
    {
        int [] numbers = new int [40000000];
        numbers[0] = 1;
        numbers[1] = 2;
        int sum = 0;

        for (int index = 0; index < 4000000; index++)
        {
            numbers[index + 2] = numbers[index] + numbers[index + 1];
            if (numbers[index + 2] == )//fix this part
            {
                sum =+ numbers [index + 2]; 
            }
        }
        System.out.println(sum);
    }
}//end class
