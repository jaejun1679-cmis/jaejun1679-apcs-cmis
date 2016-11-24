public class App
{
    public static void main (String[] args) {
        Furniture chair = new Furniture("chair", "oak");
        System.out.print(chair);
        
        Table table = new Table("table", "willow", 4);
        System.out.print(table);
        
        Counter counter = new Counter("counter", "walnut", "beach'");
        System.out.print(counter);
        
        
    }
}