package Problems.P8B_v1;
import java.util.*;
public class AnalogDigitalDriver
{
    public static void main(String[] args)
    {
        HDTV tv1 = new HDTV();
        BWTV tv2 = new BWTV();
        ArrayList<TV> TVInventory = new ArrayList<TV>();

        TVInventory.add(tv1);
        TVInventory.add(tv2);
        
        System.out.println(tv1.connectHDMI());
        System.out.println(tv2.rotateRabbitEars());        

        for(TV tv : TVInventory){
            System.out.println(tv.tvType() + "\n" + "Power status: " + tv.getTvOn() + "\n");
        }
        
        for(int index = 0; index < TVInventory.size(); index++){
            TVInventory.get(index).setTvON(true);
        }
        
        for (TV tv: TVInventory){
            System.out.println(tv.tvType() + "\n" + "Power status: " + tv.getTvOn() + "\n");
        } 
    }
}