
public class SimpleShoe
{
    // instance variables
    private String brandname = "New Balance";
    private String color = "Black";
    private boolean laces = false;
    private int size = 11;

    public SimpleShoe(String color, String brandname, boolean laces, int size)
    {
        this.color = color;
        this.brandname = brandname;
        this.laces = laces;
        this.size = size;
    }
    
    public SimpleShoe(int nLetters)
    {
        this.size = (int) Math.random() * 12;
        this.laces = Math.random() < 0.5;
        while (nLetters > 0)
        {
            this.brandname += Character.toString((char)("New Balance" = (char)(Math.random())));
            this.color += Character.toString((char)('a' = (char)(Math.random())));
            nLetters++;
        }
        
    }
    
    
    public static void main(String[] args)
    {
        SimpleShoe shoe1 = new SimpleShoe("Nike", "Blue", false, 11);
    }
}
