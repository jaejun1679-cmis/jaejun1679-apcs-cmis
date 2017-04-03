//make a method that places the values from lowest to highest and you must return the array at the end 
import java.lang.*;
public class Insertion {
    public static void main( String[] args ) {
        int[] hello = new int[100];
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
        for(int index = 0; index < nums.length - 1; index++ ) {
            int next = nums[index + 1];
            int current = nums[index];           

            if(next < current) {
                
                
                int swapper = current;
                int stopper = 0;
                int index2 = index - 1;

                while(nums[index] < nums[index2]) {
                        
                }
                index2--; 

            }

                
            /*
            for(int index2 = index - 1; index2 <= 0; index2--) {
            if (current > nums[index2] ) { 
            nums[index2] = next;

            } else { 

            }
            nums[index + 1] = swapper;
            }
             */

            /*
            int swapper = current;
            int cycle = index;
            boolean stopper = true;
            while(stopper && nums[cycle] > next) {
            if(nums[cycle] < nums[index]) {
            cycle--;
            } else {
            for(int index3 = 0; index3 < cycle; index3++) {

            }

            }
            } 

             */

        }

    }        
    return nums;
}
