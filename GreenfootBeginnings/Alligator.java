import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Actor
{
    /**
     * Act - do whatever the Alligator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    }    
    
    public void move(){
        if(Greenfoot.isKeyDown("w")){
            move(3);
        }
        if(Greenfoot.isKeyDown("a")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("s")){
            move(-3);
        }
        if(Greenfoot.isKeyDown("d")){
            turn(3);
        }
    }
    
    public void findChild(){
        
        
    }
}
