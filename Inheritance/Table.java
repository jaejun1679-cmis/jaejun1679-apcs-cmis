public class Table extends Furniture
{
    private int legs;
    
    public Table(String type, String wood, int legs){
        super(type, wood);
        this.legs = legs;
    }
    
    public int getLegs(){
        return legs;
    }
    
    public void setLets(){
        int a = 0;
        a = (int)(Math.random() * 7 + 1);
        legs = a;
    }   
    
}