import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pizza extends Enemy implements Behavior
{
    private Actor target;
    private int spawnDisX;
    private int spawnDisY;
    private int ticker;
    private int happen = 0;

    public Pizza() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 25, image.getHeight() - 20);
        setImage(image);
    }
    
    public void act() {
        move();
        kill();
        die();
    }

    public void move() {
        setLocation(getX() - 4, getY());
    }

    public void die() {
        if( getY() == getWorld().getHeight() - 1 ){
            getWorld().removeObject(this);
        } else if (getX() == 10) {
            getWorld().removeObject(this);
        }
    }
}