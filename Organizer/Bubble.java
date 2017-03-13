//make a method that places the values from lowest to highest and you must return the array at the end 
import java.lang.*;
public class Bubble{
    
    public static void main( String[] args ) {
        int[] hello = new int[10];
        for(int index = 0; index < hello.length; index++) {
            hello[index] = (int)(Math.random() * 9 + 1);
        }
        
        for(int index = 0; index < hello.length; index++ ) {
            System.out.print(hello[index]);
        }
        sort(hello);
        System.out.print("\n");
        for(int index = 0; index < hello.length; index++ ) {
            System.out.print(hello[index]);
        }        
    }//end main

    public static int[] sort(int[] nums) {
        boolean swap = true;
        int swapper = 0;
        while(swap) {
            swap = false;//its here!
            for(int index = 0; index < nums.length - 1; index++) {
                if(nums[index] > nums[index + 1]) {
                    swapper = nums[index];
                    nums[index] = nums[index + 1];
                    nums[index + 1] = swapper;
                    swap = true;
                }
            }//end for
        }//end while
        return nums;
    }//end sort
}//end main