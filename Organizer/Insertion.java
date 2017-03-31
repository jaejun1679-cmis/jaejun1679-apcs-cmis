//make a method that places the values from lowest to highest and you must return the array at the end 
import java.lang.*;
public class Insertion {
    public static void main( String[] args ) {
        int[] hello = new int[100];
        for(int index = 0; index < hello.length; index++) {
            hello[index] = (int)(Math.random() * 500 + 1);
        }
        
        for(int index = 0; index < hello.length; index++ ) {
            System.out.print(hello[index]);
        }
        sort(hello);
        System.out.print("\n");
        for(int index = 0; index < hello.length; index++ ) {
            System.out.println(hello[index]);
        }        
    }//end main

    public static int[] sort(int[] nums) {                
        for(int index = 0; index < nums.length - 1; index++ ) {
            int current = nums[index];
            int next = nums[index + 1];
            if(current > next) {
                int swapper = current;
                int cycle = index;
                boolean stopper = true;
                while(stopper && nums[cycle] > next) {
                    if(nums[cycle] < nums[index]) {
                        cycle--;
                    }
                } 
            }            
        }        
        return nums;
    }//end sort
}//end main