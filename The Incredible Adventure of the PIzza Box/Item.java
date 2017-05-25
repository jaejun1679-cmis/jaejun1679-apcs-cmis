import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Item extends Actor
{
    private int use = 1;
    
    
    
    public  int getUse() {
        return use;
    }
    public void usedItem() {
        use--;
    }
}