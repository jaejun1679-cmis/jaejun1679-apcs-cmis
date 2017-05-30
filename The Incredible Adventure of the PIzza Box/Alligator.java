import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Alligator extends Enemy implements Behavior
{
    private final long check = System.currentTimeMillis();

    public Alligator () {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 20, image.getHeight() - 15);
        setImage(image);
    }

    public void act() {
        move();
        kill();
        die();
    }

    public void move() {
        setLocation(getX() + 2, getY()); 
    }
    
    public void die() {
        if( getY() == getWorld().getHeight() - 1 ){
            getWorld().removeObject(this);
        } else if (getX() == getWorld().getWidth() - 10){
            getWorld().removeObject(this);
        }
    }
}