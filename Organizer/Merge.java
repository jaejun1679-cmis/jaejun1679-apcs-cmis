import java.lang.*;
public class Merge
{
    public static void main( String[] args ) {
        int[] hello = new int[10];
        for(int index = 0; index < hello.length; index++) {
            hello[index] = (int)(Math.random() * 9 + 1);
        }
        for(int index = 0; index < hello.length; index++ ) {
            System.out.print(hello[index]);
        }
        //MergeSplit(hello);
    }

    public static int[][] Split(int[] nums) {
        int length = nums.length;
        int [] left;
        int [] right;
        if(nums.length % 2 == 0 ) {
            left = new int[(length/2)]; 
            right = new int[(length/2)];
            
             for(int index = 0; index < (length/2); index++) {
                left[index] = nums[index];
            }for(int index = (length/2); index < length; index++) {
                right[index] = nums[index];
            }
        } else {
            left = new int[length / 2]; 
            right = new int[(length / 2) + 1];
            
             for(int index = 0; index < (length/2); index++) {
                left[index] = nums[index];
            }for(int index = (length/2); index < length; index++) {
                right[index] = nums[index];
            }
        }
        
        int[][] returnArrays = new int[][] {left, right};
        return returnArrays;
    }

    public int[] Merge() {
        int[] rocks = new int[5]; //place holder
        return rocks;
    }

    public int[] MergeSplit(int[] nums) {
        if(nums.length == 1) {
            return nums;
        }
        
        return nums;
    }
}