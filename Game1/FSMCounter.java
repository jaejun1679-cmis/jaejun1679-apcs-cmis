import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class FSMCounter extends Actor
{
    private int killCount = 0;
    
    public void act() {
        
        setImage(new GreenfootImage("Monsters killed: " + killCount, 15, Color.GREEN, Color.BLACK)); 
    }
    
    public void changeCount (int num) {
        killCount += num;
        
    }
    
}
