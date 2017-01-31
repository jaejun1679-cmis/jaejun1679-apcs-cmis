import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpookySpider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpoopySpider extends Actor
{
    private Actor target;
    
    public void act() {
        move(2);
        turnTowards(target.getX(), target.getY());
    }
    
    public SpoopySpider(Actor target) {
        this.target = target;
    }
}