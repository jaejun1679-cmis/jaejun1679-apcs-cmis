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
    
    public void act() 
    {
        move(2);
        follow();
    }
    
    public void follow(){
        int targeX = LControl.getX();
        int targetY = LControl.getY();        
        
    }
}
