import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Platform extends Actor
{
    private GreenfootImage img;
    
    public Platform() {
        img = new GreenfootImage(700, 15);
        img.setColor(new Color(0, 0, 0));
        img.fill();
        setImage(img);
    
    }
       
    public void act() {
        
    }    
}
