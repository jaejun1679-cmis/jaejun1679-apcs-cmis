class RandomNumberof1M
{
    public static void main(String[] args)
    {
        int [] nums = new int[1000000];
        
        for ( int index = 0; index < nums.length; index++)
        {
            double value = Math.random() * 1000000;
            nums[ index ] =  (int) value;
            
            if ( (nums[ index ] % 3 == 0 ) &&  (nums[ index ] % 5 == 0 ) && (nums[ index ] % 7 == 0 ) && (nums[ index ] % 11 == 0 ) )
            {
                if (nums[ index - 1 ] > nums[ index  + 1 ])
                {
                    System.out.println( nums[index] );
                }
            }
        }
    }
}
