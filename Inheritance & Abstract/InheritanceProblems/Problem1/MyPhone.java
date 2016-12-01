package InheritanceProblems.Problem1;

public class MyPhone extends MyDevice
{
    // instance variables    
    private String model;
    private String color;
    private boolean headphoneJack = true;

    public MyPhone(String brand, boolean power, int RAM, String model, String color)
    {
        super(brand, power, RAM);
        this.model = model;
        this.color = color;
        if(model == "Iphone7" || model == "Iphone 7"){
            this.headphoneJack = false;        
        }
    }

    public String getModel(){
        return model;
    }

    public void setModel(String newModel){
        model = newModel; 
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        model = newColor; 
    }

    public boolean getHeadphoneJack(){
        return headphoneJack;
    }

    public void setModel(boolean newHeadphoneJack){
        headphoneJack = newHeadphoneJack; 
    }

    public String toString(){
        String fullName = "";
        String Brand;
        Brand = getBrand();
        fullName = Brand + " " + model;

        if (headphoneJack == false){
            return String.format("Hello. I am a %s %s. My masters at %s created me. " + 
                "Opps. My master forgot add the 3.5 mm headphone port. %n"
            ,color,fullName,Brand);
        }
        else{
            return String.format("Hello. I am a %s %s. My masters at %s created me. " +
                "And yes, I do have a the 3.5 mm headphone port.%n"
            ,color,fullName,Brand);
        }
    }
}
