import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ants extends Actor
{
    private Actor follower;
    
    public void act() {
        move(3);        
        if (follower.getX() != 0 || follower.getY() != 0) {
            turnTowards(follower.getX(), follower.getY());
        }
    }
    
    public Ants() {
        move(3);
        if (Greenfoot.getRandomNumber(100) < 8) {
            turn(Greenfoot.getRandomNumber(360));
        }
    }
    
    public Ants(Actor following){
        this.follower = follower;
    }
}