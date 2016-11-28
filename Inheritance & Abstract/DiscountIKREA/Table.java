package DiscountIKREA;

public class Table extends Furniture
{
    private int legs;
    
    public Table(String type, String material, int legs){
        super(type, material);
        this.legs = legs;
    }
    
    public int getLegs(){
        return legs;
    }
    
    public void setLegs(String newLegs){
        int a = 0;
        a = (int)((Math.random() * 7) + 1);
        newLegs = Integer.toString(a);
    }
    
    public String toString(){
        return "";
    }
}