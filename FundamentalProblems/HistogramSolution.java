import javax.swing.JOptionPane;
public class HistogramSolution
{
    public static void main ( String[] argv )
    {
        System.out.println("Histogram!");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
    
        System.out.println(n);
        
        int[] numbers = new int[n];
        int[] counts = new int[100];
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
            counts[numbers[i]]++;
            sum += numbers[i];
        }
        int min = 99;
        int max = 0;
        int modeCount = 0;
        for( int i = 0; i < counts.length; i++){
            System.out.print(i+": ");
            int hashes = counts[i];
            while(hashes > 0){
                System.out.print("#");
                hashes--;
            }
            System.out.println();
            
            if ( counts[i] > 0 ){
                if ( i < min ){
                    min = i;
                }
                if ( i > max ){
                    max = i;
                }
            }  
            if ( counts[i] > modeCount ){
                modeCount = counts[i];
            }
        }
        
        System.out.println("MIN: "+min);
        System.out.println("MAX: "+max);
        System.out.println("SUM: "+sum);
        System.out.println("AVG: " + ((double)sum/n));
        System.out.print("MODES: ");
        for ( int i = 0; i < counts.length; i++){
            if ( counts[i] == modeCount){
                System.out.print(i + " ");
            }
        }
    }  
}