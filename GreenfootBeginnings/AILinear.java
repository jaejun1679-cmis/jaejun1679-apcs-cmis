import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AILinear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AILinear extends Actor
{
    /**
     * Act - do whatever the AILinear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int refreshRate = Greenfoot.getRandomNumber(100);
        int number = Greenfoot.getRandomNumber(100);
        if (refreshRate < 10){
            if (number < 25){
                setLocation(getX(), getY() - 5);
            }
            
            if (number > 26 && number < 50){
                setLocation(getX() - 5, getY());     
            }
            
            if (number > 51 && number < 75){
                setLocation(getX(), getY() + 5);
            }
            
            if (number > 76 && number < 101){
                setLocation(getX() + 5, getY());
            }
        }
    }
}