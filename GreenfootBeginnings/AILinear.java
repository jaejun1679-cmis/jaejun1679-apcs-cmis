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
        if (Greenfoot.getRandomNumber(100) < 40){
            if (Greenfoot.getRandomNumber(100) < 25){
                setLocation(getX(), getY() - 3);
            }    
            if (Greenfoot.getRandomNumber(100) > 25 &&  Greenfoot.getRandomNumber(100) < 50){
                setLocation(getX() - 3, getY());     
            }  
            if (Greenfoot.getRandomNumber(100) > 50 &&  Greenfoot.getRandomNumber(100) < 75){
                setLocation(getX(), getY() + 3);
            }  
            if (Greenfoot.getRandomNumber(100) < 75 && Greenfoot.getRandomNumber(100) > 100){
                setLocation(getX() + 3, getY());
            }  
        }
    }
}