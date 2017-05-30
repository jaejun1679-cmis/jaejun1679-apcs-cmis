import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class JumpCounter extends Actor
{
    private int timesJumped = 0;
    
    public void act() {
        setImage(new GreenfootImage("Times Jumped: " + timesJumped, 15, Color.BLACK, Color.WHITE)); 
    }    
    
    public void changeCount (int num) {
        timesJumped += num;
    }
}