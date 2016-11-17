public class Test
{
    private int[][] nums;

    public Test(int d){
        nums = new int[d][d];

        for (int y = 0; y < nums.length; y++){
            for(int x = 0; x < nums[0].length; x++){
                nums[y][x] = (int)(Math.random() * 8);
            }             
        } 
        //populating the array with random numbers

        int nineRow = (int)(Math.random() * (d -2)) + 1; 
        int nineCol = (int)(Math.random() * (d -2)) + 1; 
        nums[nineRow][nineCol] = 9;

        //placing the 9 somewhere in the array        
    }

    public void showArray(){
        for ( int y = 0; y < nums.length; y++ ){
            for ( int x = 0; x < nums[0].length; x++ ){
                int num = nums[y][x];
                System.out.print(nums[y][x] + " ");
            }
            System.out.println();
        }  
    }

    public int[][] getNineAndFriends(){
        int[][] result = new int[3][3];
        //result array

        int indexRow = 0;
        int indexCol = 0;

        for (int y = 0; y < nums.length; y++){
            for(int x = 0; x < nums.length; x++){
                if (nums[x][y] == 9){
                    indexRow = x;
                    indexCol = y;
                    x++; 
                    y++;
                }
            }               
        }
        
        if (indexRow == 0 || indexCol == 0){
            result[0][0] = nums[indexRow][indexCol + 1];
            result[0][1] = nums[indexRow + 1][indexCol];
            result[0][2] = nums[indexRow + 1][indexCol + 1];
            result[1][0] = nums[indexRow][indexCol];
            result[1][1] = nums[indexRow][indexCol];
            result[1][2] = nums[indexRow][indexCol + 1];
            result[2][0] = nums[indexRow][indexCol];
            result[2][1] = nums[indexRow][indexCol];
            result[2][2] = nums[indexRow][indexCol + 1];
        }
        else{
            result[0][0] = nums[indexRow - 1][indexCol - 1];
            result[0][1] = nums[indexRow - 1][indexCol];
            result[0][2] = nums[indexRow - 1][indexCol + 1];
            result[1][0] = nums[indexRow][indexCol - 1];
            result[1][1] = nums[indexRow][indexCol];
            result[1][2] = nums[indexRow][indexCol + 1];
            result[2][0] = nums[indexRow + 1][indexCol - 1];
            result[2][1] = nums[indexRow + 1][indexCol];
            result[2][2] = nums[indexRow + 1][indexCol + 1];
        }

        //Modify this method so that it returns the 9 and the 8 digits surrounding it in column major order
        return result;
    }

    public static void main(String[] args){
        Test test = new Test(3);
        test.showArray();
        int[][] nine = test.getNineAndFriends();

        for( int y = 0; y < nine.length; y++){
            for( int x = 0; x < nine[0].length; x++){
                System.out.print(nine[y][x]);
            }
            System.out.println();
        }//end for loop
    }// end method main
}//end class