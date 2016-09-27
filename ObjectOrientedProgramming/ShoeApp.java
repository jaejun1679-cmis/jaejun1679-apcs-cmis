public class ShoeApp
{
    public static void main(String[] args)
    {
        SimpleShoe shoe1 = new SimpleShoe("Nike", false, 11, "White");
        System.out.println("Shoe #1: \n" + shoe1);

        SimpleShoe shoe2 = new SimpleShoe();
        System.out.println("\nShoe #2: \n" + shoe2);
        
        
    }
}
