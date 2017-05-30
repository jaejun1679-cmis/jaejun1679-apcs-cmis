import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class PepCounter extends Counters
{
    private int collected;  
    
    public void act() {
        //MyWorld thisWorld = (MyWorld) getWorld();
        //collected = thisWorld.pizzaBox.getPepperoniCount();
        
        setImage(new GreenfootImage("Pepperonis Collected: " + collected, 15, Color.BLACK, Color.WHITE)); 
    }
    
}