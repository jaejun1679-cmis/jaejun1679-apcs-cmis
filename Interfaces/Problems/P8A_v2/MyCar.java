package Problems.P8A_v2;

public class MyCar extends Vehicle implements Connectable, Discountable
{
    public void connectToBluetooth(){
        System.out.print("Connecting to bluetooth for a MyCar");        
    }
    
    public void applyDiscount(){
    };
}
