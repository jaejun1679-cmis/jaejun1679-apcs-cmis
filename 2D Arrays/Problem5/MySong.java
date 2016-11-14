package Problem5;
public class MySong
{
    String name;
    int rating;
    
    public MySong(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }
    
    public String getName(){
        return name;
    }
    
    public int getRating() {
        return rating;
    }
}
