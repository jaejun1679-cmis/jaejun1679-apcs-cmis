import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpookySpider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpookySpider extends Actor
{
    private Actor target;
    
    public void act() {
        move(2);
        int targetX = getX();
        int targetY = getY();
        turnTowards(target.getX(), target.getY());
    }
    
    public SpookySpider(Actor target){
        this.target = target;        
    }
}
