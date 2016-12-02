package InheritanceProblems.Problem1;

public class MyDevice
{
    // instance variables    
    private String brand;
    private boolean power; //in percentiele but without the % sign
    private int RAM;

    public MyDevice(String brand, boolean power, int RAM){
        this.brand = brand;
        this.power = power;
        this.RAM = RAM;
    }

    //brand
    public String getBrand(){
        return brand;
    }

    public void setBrand(String newBrand){
        brand = newBrand;
    }

    //power
    public boolean getPower(){
        return power;
    }   

    public void setBatter(boolean newPower){
        power = newPower;
    }

    //RAM
    public int getRAM(){
        return RAM;
    }

    public void setRAM(int newRAM){
        RAM = newRAM;
    }    

    public String toString(){
        if(power == true){
            return String.format("Device's brand: %s.%n" + 
                "Power: On.%n" + 
                "RAM: %s",brand, RAM);
        }
        else{
            return String.format("No battery on the device. Please charge and try again.");
        }
    }    
}