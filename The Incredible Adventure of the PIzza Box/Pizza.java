import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pizza extends Enemy implements Behavior
{
    private Actor target;
    private int spawnDisX;
    private int spawnDisY;
    private int ticker;
    private int happen = 0;

    public Pizza() {
        
    }
    
    public void act() {
        move();
        kill();
    }

    public void move() {
        Greenfoot.getRandomNumber(10000);

        if( ticker < 20 ) {
            setLocation(Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            happen++;
            
        }
        
    }

    public void die() {
        if( getY() == getWorld().getHeight() - 1 ){
            getWorld().removeObject(this);
        }
                
        if ( happen == 3 ) {
            getWorld().removeObject(this);
        }
    }
}