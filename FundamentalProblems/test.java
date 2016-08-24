class test
{
    public static void main(String[] args)
    {
        int [] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int index = 0; index < nums.length; index--)
        {
            int thisNum = nums[ index ];
            System,out.println( thisNum * thisNum );
        }    
    }
}