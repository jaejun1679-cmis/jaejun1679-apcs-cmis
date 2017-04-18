import java.lang.*;
public class Sequential {
    public static void main( String[] args ) {
        int[] hello = new int[] {0, 1, 2, 3, 4, 5, 6};
        
        find(hello, 5);        
    }//end main

    public static int find(int[] nums, int target) {  
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] == target) 
            {return index;}            
        }
        return -1;
    }    
}
