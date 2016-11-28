package DiscountIKREA;

public class Furniture
{
    private String type;
    private String material;
    
    public Furniture(String type, String material){
        this.type = type;
        this.material = material;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String newType){
        type = newType;
    }
   
    public String getMaterial(){
        return material;
    }
    
    public void setmaterial(String newMaterial){
        material = newMaterial;
    }
    
    public String toString(){
        return String.format("Hi! I am a %s and I am made from %s." + "%n",type,material);
    }
}