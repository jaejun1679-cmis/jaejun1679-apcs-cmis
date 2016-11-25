public class SofaBed extends Sofa
{
    private boolean bed;
    
    public SofaBed(String type, String material, String color, boolean bed){
        super(type, material, color);
        this.bed = true;      
    }
    
    public boolean getBed(){
        return bed;
    }
    
    public void setBed(boolean newBed){
        bed = newBed;
    }
}
