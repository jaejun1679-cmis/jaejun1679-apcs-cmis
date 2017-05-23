import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cleaner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cleaner extends Actor
{       
    public void move() {
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
}
