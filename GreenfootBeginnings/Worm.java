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
    
    public void act() 
    {
        move(3);
        if (Greenfoot.getRandomNumber(100) < 8){
            turn(Greenfoot.getRandomNumber(360));
        }
        int[][] coordinates = new int [10][10];
        actLikeAWorm();
        
    }
    
    public void actLikeAWorm(){
        int xCor = getX();
        int yCor = getY();
        
        
        
        
    }
    
}
