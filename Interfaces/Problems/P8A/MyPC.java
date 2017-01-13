package Problems.P8A;

public abstract class MyPC extends MyDevice implements Connectable
{
    // instance variables 
    private String CPU;
    private String GPU;

    public MyPC(String brand, boolean power, int RAM, String CPU, String GPU){
        super(brand, power, RAM);
        this.CPU = CPU;
        this.GPU = GPU;
    }

    public String getCPU(){
        return CPU;
    }

    public void setCPU(String newCPU){
        CPU = newCPU;
    }

    public String getGPU(){
        return GPU;
    }

    public void setGPU(String newGPU){
        GPU = newGPU;
    }
    
    public String toString(){
        if(super.getPower() == true){
            return String.format("Hello. I am from the PC master race. " + 
                "I am primarily built with %s, " +
                "and I built with a %s as my CPU and a %s as my GPU " +
                "I also have things under control with %s GBs worth of RAM. FEAR. ME.",super.getBrand(), CPU, GPU, super.getRAM()); 
        }
        else{
            return "Power is off. Please charge and try again later.";
        }
    }
}