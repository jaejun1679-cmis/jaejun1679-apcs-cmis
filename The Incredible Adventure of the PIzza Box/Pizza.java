import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pizza extends Enemy implements Behavior
{
    private Actor target;
    private int spawnDisX;
    private int spawnDisY;
    

    public void act() {
        move();
        kill();
    }
    
    public void move() {
        
        
        
    }
    
    public void die() {
        if( getY() == getWorld().getHeight() - 1 ){
            getWorld().removeObject(this);
        }
    }
}