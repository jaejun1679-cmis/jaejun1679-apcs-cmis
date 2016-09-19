public class Problem1 {
    public static void main ( String args [] ) 
    {
        int [] numbers = new int [1000];
        int sum = 0;
        for(int index = 0; index < numbers.length; index++)
        {
            numbers[index] = index;
            if (numbers[index] % 3 == 0 || numbers[index] % 5 == 0)
            {
                sum += numbers[index];
            }
        }
        System.out.println(sum);
    }// end method main
}// end class