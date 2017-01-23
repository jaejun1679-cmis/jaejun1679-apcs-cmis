import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AIRotate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AIRotate extends Actor
{
    /**
     * Act - do whatever the AIRotate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(2);
        if (Greenfoot.getRandomNumber(100) < 8){
            turn(Greenfoot.getRandomNumber(360));
        }
    }    
}
