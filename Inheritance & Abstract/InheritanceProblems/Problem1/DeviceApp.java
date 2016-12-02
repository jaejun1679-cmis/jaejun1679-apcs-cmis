package InheritanceProblems.Problem1;

public class DeviceApp
{
    public static void main(String [] args)
    {
        MyPC decentPC = new MyPC("Corsair", true, 32, "i7-6700KHQ", "GTX 1070"); 
        System.out.println(decentPC);
        
        MyPhone Note7 = new MyPhone("Samsung", true, 4, "Note 7", "Black");
        System.out.println(Note7);
        
        
        MyPC goodPC = new MyPC("Asus", true, 64, "i7-6950X", "GTX 1080");
        
        
        
        ArrayList<MyDevice> inventory = new ArrayList<MyDevices>(); // this part doesn't work
        inventory.add(0, decentPC);
        
    }
}
