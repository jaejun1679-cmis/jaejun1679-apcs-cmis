import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Alligator extends Enemy implements Behavior
{
    private final long check = System.currentTimeMillis();

    public Alligator () {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 15, image.getHeight() - 10);
        setImage(image);
    }

    public void act() {
        move();
        kill();
    }

    public void move() {

        setLocation(getX() - 3, getY());

    }
    
    public void die() {
        if( getY() == getWorld().getHeight() - 1 ){
            getWorld().removeObject(this);
        }
    }

}
