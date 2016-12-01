package InheritanceProblems.Problem1;

public class MyPC extends MyDevice
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

    public String toSting(){
        if(super.getPower() == true){
            return String.format("I AM FROM THE PC MASTER RACE." + 
                "AS % MY MAIN BUILD, " +
                "I AM BUILT WITH A %s AS MY CPU AND A %s AS MY GPU " +
                "WHILST RUNNING THINGS WITH %s GBs WORTH OF RAM. FEAR. ME.",super.getBrand(), CPU, GPU, super.getRAM()); 
        }
        else{
            return "Power is off. Please charge and try again later.";
        }
    }
}
