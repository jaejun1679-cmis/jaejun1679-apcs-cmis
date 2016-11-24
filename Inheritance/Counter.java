public class Counter extends Furniture
{
    String shade; 
    
    public Counter(String type, String wood, String shade){
        super(type, wood);
        this.shade = shade;
    }
    
    public String getShade(){
        return shade;
    }
    
    public void setShades(String newShade){
        int a = (int)(Math.random() * 10);
        String color = "";
        
        if (a % 2 == 0){
            color += "light";
            if(a > 0){
                color += "brown";
            }
            else{
                color += "wheat";
            }
        }
        else{
            color += "dark";
            if(a < 0){
                color += "tan";
            }
            else{
                color += "brownstone";
            }
        }
        
        newShade = color;
    }
}
