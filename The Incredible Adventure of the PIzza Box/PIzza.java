import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PIzza extends Enemy implements Behavior
{
    public void act() 
    {
        move();
    }
    
    public void move() {
        
    }
    
    public void die() {
        if( getY() == getWorld().getHeight() - 1 ){
            getWorld().removeObject(this);
        }
    }
}
