import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class PIzzaBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PizzaBox extends Actor
{
    private GreenfootImage img;
    private int speed;
    private int life; 
    private int rocket;
    private int gravity;
        
    public PizzaBox() {
        img = new GreenfootImage(15, 15);
        img.setColor(new Color(222,184,135));
        img.fill();
        setImage(img);
    }
    
    public void act()
    {
        controls();
    }
    
    public void controls() {
        if (Greenfoot.isKeyDown("w")){
            jump();
        }
        if(Greenfoot.isKeyDown("a")){
           setLocation(getX() - 2, getY());           
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + 2);
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX() + 2, getY());
        } 
    }
    
    public void jump() {
        
    }
}