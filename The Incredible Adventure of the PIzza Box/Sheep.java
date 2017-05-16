import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Sheep extends Enemy implements Behavior
{
    private Actor target;
    public Sheep(Actor target) {
        this.target = target;
    }

    public void move() {
        move(2);
        turnTowards(target.getX(), target.getY());
    }

    public void die() {
        if( getY() == getWorld().getHeight() - 1 ){
            getWorld().removeObject(this);
        }
    }    

    public void act() {
        move();
    }
}