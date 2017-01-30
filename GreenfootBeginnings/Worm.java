import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor
{
    private Actor leader;
  
    public void act() {
        move();
        follow();
    }
    
    public void move() {
        move(3);
        if (Greenfoot.getRandomNumber(100) < 8) {
            turn(Greenfoot.getRandomNumber(360));
        }
    }

    public void follow() {
        int targetX = getX();
        int targetY = getY();
        turnTowards(leader.getX(), leader.getY());
    }
    
    public Worm(Actor leader){
        this.leader = leader;
        Worm worm1 = new Worm();
        addObject(worm1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        Worm worm1 = new Worm();
        addObject(worm1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        Worm worm1 = new Worm();
        addObject(worm1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        Worm worm1 = new Worm();
        addObject(worm1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        Worm worm1 = new Worm();
        addObject(worm1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        Worm worm1 = new Worm();
        addObject(worm1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        Worm worm1 = new Worm();
        addObject(worm1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
    }//constructor
}
