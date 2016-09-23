
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
            this.brandname += Character.toString((char)( 'a' + (char)(Math.random())));
            this.color += Character.toString((char)('a' + (char)(Math.random())));
            nLetters++;
        }        
    }

    public static void main(String[] args)
    {
        SimpleShoe shoe1 = new SimpleShoe("Nike", "Blue", false, 11);
        System.out.println(shoe1.brandname);
        System.out.println(shoe1.color);
        System.out.println(shoe1.laces);
        System.out.println(shoe1.size);
    }

    public String getBrandName()
    {
        return brandname;
    }

    public void setBrandName(String newbrandname)
    {
        brandname = newbrandname;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String newColor)
    {
        color = newColor;
    }

    public boolean getLaces()
    {
        return laces;
    }

    public void setLaces(boolean newLaces)
    {
        laces = newLaces;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int newSize)
    {
        size = newSize;
    }

    public String toString()
    {
        String output = "Brandame: " + brandname + "/nColor:" + color + " /nLaces (yes or no): " + laces + "/nShoe size" + size; 
        return output;
    }

    public String getTruncName(int limit)
    {
        String truncName;
        if (color.length() > limit)
        {
            truncName = color.substring(0, limit);
        }
        else 
        {
            truncName = color;
        }
        return truncName;
    }

    public String getLacesWord()
    {   
        String lacesyesorno = "";
        if (laces == true)
        {
            lacesyesorno = "Shoe with laces.";
        }
        else
        {
            lacesyesorno = "Shoe without laces.";
        }
        return lacesyesorno;
    }
}