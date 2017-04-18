import java.lang.*;
public class Binary {
    public static void main( String[] args ) {
        int[] hello = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        find(hello, 8);        
    }//end main

    public static int find(int[] nums, int target) {  
        boolean run = true;
        int half = nums.length / 2;

        while(run) {
            int current = nums[half];

            if(current == target) {
                run = false;
                return half; // does this automatically stop the loop?
            } else if (current < target ) {
                half = half + (half / 2); 
                
            } else if (current > target ) { 
                half = half / 2;
                
            }

            
        }
        return -1;
    }
}