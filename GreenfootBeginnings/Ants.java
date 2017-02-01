import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ants extends Actor
{
    private Actor leader;
    
    public void act() {
        move(3);
        turnTowards(leader.getX(), leader.getY());
    }
    
    public Ants() {
        move(3);
        if (Greenfoot.getRandomNumber(100) < 8) {
            turn(Greenfoot.getRandomNumber(360));
        }
    }
    
    public Ants(Actor leader){
        this.leader = leader;
    }
}