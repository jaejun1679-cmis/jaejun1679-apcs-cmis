package InheritanceProblems.Problem1;

public class MyPhone extends MyDevice
{
    // instance variables    
    
    private String model;
    private String color;
    private boolean earbuds = true;

    public MyPhone()
    {
        super();
        this.model = "Note 7";
        this.color = "Gold";
        this.earbuds = earbuds;
    }

    public MyPhone(String brand, String model, String color)
    {
        super();
        this.model = model;
        this.color = color;
        if(model == "Iphone7" || model == "Iphone 7"){
            this.earbuds = false;        
        }
    }

    public String toString(){
        String fullName = "";
        String Brand;
        Brand = getBrand();
        fullName = Brand + " " + model;

        if (earbuds == true){
            return String.format("Hello. I am a %s %s. My masters at %s created me. " +
                                 "And yes, I do have a the 3.5 mm headphone port.%n"
            ,color,fullName,Brand);
        }
        else{
            return String.format("Hello. I am a %s %s. My masters at %s created me. " + 
                                 "Opps. My master forgot add the 3.5 mm headphone port. %n"
            ,color,fullName,Brand);
        }
    }
}
