import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class BloodCounter extends Actor
{
    private int bloodCleaned = 0;
    public void act() {
        setImage(new GreenfootImage("Blood cleaned: " + bloodCleaned, 15, Color.GREEN, Color.BLACK)); 
    }    
    
    public void changeCount (int num) {
        bloodCleaned += num;
    }
}
