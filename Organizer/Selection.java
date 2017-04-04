public class Selection
{
    public static void main( String[] args ) {
        int[] hello = new int[50];
        for(int index = 0; index < hello.length; index++) {
            hello[index] = (int)(Math.random() * 500 + 1);
        }
        for(int index = 0; index < hello.length; index++ ) {
            System.out.println(hello[index]);
        } 
        sort(hello);
        System.out.print("\n");
        for(int index = 0; index < hello.length; index++ ) {
            System.out.println(hello[index]);
        }
    }//end main

    public static int[] sort(int[] nums) {
        int index = 0;
        int smallestIndex = 0;
        int swapper = 0;

        for(int y = 0; y < nums.length; y++) {
            int smallest = nums[y];
            for(int x = y; x < nums.length; x++) {
                int current = nums[x];
                if(current < smallest) {
                    smallest = current;
                    smallestIndex = x;
                }
            }
            swapper = nums[y];
            nums[y] = smallest;
            nums[smallestIndex] = swapper;
        }

        return nums;
    }
}