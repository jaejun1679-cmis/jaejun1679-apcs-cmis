import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cleaner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cleaner extends Actor
{   
    private int speed;
    
    public void act() 
    {        
        if (Greenfoot.isKeyDown("w")){
            move(3);
            setRotation(270);
        }
        if(Greenfoot.isKeyDown("s")){
            move(3);
            setRotation(90);
        }
        if(Greenfoot.isKeyDown("a")){
            move(3);
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("d")){
            move(3);
            setRotation(0);
        } 
    }
}