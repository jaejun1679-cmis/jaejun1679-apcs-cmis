import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Score extends Counters
{   
    private int finalScore = 0;
    
    public void act() {
        setImage(new GreenfootImage("Score: " + finalScore, 15, Color.BLACK, Color.WHITE)); 
    }    
    
    public void changeScore (int num) {
        finalScore += num;
    }
    
}