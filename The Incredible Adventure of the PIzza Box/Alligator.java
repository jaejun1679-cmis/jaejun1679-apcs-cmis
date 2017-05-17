import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Alligator extends Enemy implements Behavior
{
    public void act() 
    {
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
