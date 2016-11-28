package DiscountIKREA;

public class App
{
    public static void main (String[] args) {
        Furniture chair = new Furniture("chair", "oak trees");
        System.out.print(chair);
        
        Table table = new Table("table", "willow trees", 4);
        System.out.print(table);
        
        Counter counter = new Counter("counter", "walnut trees", "beach'");
        System.out.print(counter);
        
        Sofa sofa = new Sofa("sofa", "full grain leather", "white");
        System.out.print(sofa);
        
        Furniture[] ProHome = new Furniture[5];
        for(int index = 0; index < ProHome.length; index++){
            if (index % 2 == 0){
                ProHome[index] = new Table("table", "willow", 4);
            }
            if(index % 2 != 0){
                ProHome[index] = new Counter("counter", "walnut", "beach");
            }
        }
        
        for(int index =0; index < ProHome.length; index++){
            
            /*
            if(ProHome[index] instanceof Table){
                (
            }
            if(ProHome[index] instanceof Counter){
                
            }
            if(ProHome[index] instanceof Sofa){
                
            }
            */
           
        }
    }
}