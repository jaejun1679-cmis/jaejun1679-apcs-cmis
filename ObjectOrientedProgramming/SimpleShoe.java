public class SimpleShoe
{
    // instance variables
    private String brandname = "Vans";
    private boolean laces = false;
    private int size = 11;
    private String color = "White";

    //constant variables
    public static String[] brandNames = new String[]{"Nike", "Converse", "Vans", "Puma", "Adidas", "Cros", "Chanel", "Keds", "K-Swiss", "New Balance"};
    public static String[] shoeColors = new String[]{"Red", "Pink", "Orange", "Yellow", "Green", "Blue", "Purple", "Brown", "Black", "White"};

    public SimpleShoe(String brandname, boolean laces, int size, String color)
    {
        this.brandname = brandname;
        this.laces = laces;
        this.size = size;
    }

    public String toString()
    {
        String output = "Brandame: " + brandname + "\nColor: " + color + " \nLaces: " + laces + "\nShoe size: " + size; 
        return output;
    }

    public SimpleShoe()
    {
        this.brandname = brandNames[(int) (Math.random() * 9)];
        this.size = (int) (Math.random() * 12);
        this.laces = Math.random() < 0.5;
        this.color = shoeColors[(int) (Math.random() * 9)];
    }

    // override 
    public boolean equals(SimpleShoe other)
    {   if (this.brandname == other.brandname && this.color == other.color)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean equals(int size)
    {
        return this.size == 1;
    }

    //getter and setter
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
        newSize = (int) (Math.random() * 11) + 1;
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

    public void setRepaintShoes(String shoeColor[])
    {
        String newcolor = "";
        newcolor = shoeColor[(int) (Math.random() * 9)];
        this.color = newcolor;
    }
}