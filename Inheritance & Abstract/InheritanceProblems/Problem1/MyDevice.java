package InheritanceProblems.Problem1;

public class MyDevice
{
    // instance variables    
    private String brand;
    private int battery; //in percentiele but without the % sign
    
    public MyDevice(String brand, int battery){
        this.brand = brand;
        this.battery = battery;
    }
    
    public String getBrand(){
        return brand;
    }
   
    public int getBattery(){
        return battery;
    }
    
    public void setBrand(String newBrand){
        brand = newBrand;
    }
    
    public void setBatter(int newBattery){
        battery = newBattery;
    }
    
    public String toString(){
        return String.format("Device's brand: %s %n Battery Level: %s%.",brand,battery);
    }
    
    
    
}