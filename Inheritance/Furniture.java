public class Furniture
{
    private String type;
    private String wood;
    
    public Furniture(String type, String wood){
        this.type = type;
        this.wood = wood;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String newType){
        type = newType;
    }
   
    public String getWood(){
        return wood;
    }
    
    public void setWood(String newWood){
        wood = newWood;
    }
    
    public String toString(){
        return String.format("Hi! I am a %s and I am made from %s trees." + "%n",type,wood);
    }
}