import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Sheep extends Enemy implements Behavior
{
    private Actor target;
    private int locate;

    public Sheep(Actor target) {
        this.target = target;
        locate = target.getX();
    }

    public void move() {
        move(2);       
        turnTowards(locate, target.getY());

    }

    public void die() {
        if( getY() == getWorld().getHeight() - 1 ){
            getWorld().removeObject(this);
        }

        if (getX() == locate ) {
            getWorld().removeObject(this);
        }
    }

    public void act() {
        move();
        kill();
        die();
    }
}