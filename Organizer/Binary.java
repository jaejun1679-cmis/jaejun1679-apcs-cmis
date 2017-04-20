import java.lang.*;
public class Binary {
    public static void main( String[] args ) {
        int[] hello = new int[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        int answer = find(hello, 14);
        System.out.println(answer);
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
                half = ( half + (half / 2) ) / 2;
            } else if (current > target ) { 
                half = half / 2;
            }
        }
        return -1;
    }
}