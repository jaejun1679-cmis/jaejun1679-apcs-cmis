public class Problem2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        long sum = 0;

        for(int index = 0; index < 4000000; index++){
            if((index % 2) == 0){
                int z = x + y;
                if (z % 2 == 0){
                    sum += z;
                }
                x = z;
            }

            if((index % 2) != 0){
                int z = x + y;
                if (z % 2 == 0){
                    sum += z;
                }
                y = z;
            }
        }

        System.out.println(sum);

        //int sum = 0;
        int[] numbers = new int[4000000];
        numbers[0] = 1;
        numbers[1] = 2;
        for(int index = 2; index < numbers.length; index++) {
            numbers[index] = numbers[(index - 2)] + numbers[(index - 1)];
        }
        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] % 2 == 0){
                sum += numbers[index];
            }
        }

        System.out.println(sum);
    }
}