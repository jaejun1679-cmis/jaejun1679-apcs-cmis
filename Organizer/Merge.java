import java.lang.*;
public class Merge
{
    public static void main( String[] args ) {

    }

    public static int[][] Split(int[] nums) {
        int[] left; 
        int[] right;
        int numsLength = nums.length;

        if(numsLength % 2 == 0) {
            for(int index = 0; index < nums.length; index++) {
                if(index % 2 == 0) {
                    left[index] = nums[index];
                } else {
                    right[index] = nums[index];
                }
            }
        } else {
            for(int index = 0; index < nums.length; index++) {
                if(index % 2 == 0) {
                    left[index] = nums[index];
                } else {
                    right[index] = nums[index];
                }
            }
        }
        int[][] asd = new int[][] {left, right};
        return asd;
    }

    public int[] Merge() {

    }

    public int[] MergeSplit() {

    }
}