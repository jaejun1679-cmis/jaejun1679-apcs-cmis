import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class PizzaBox extends Actor implements Behavior
{
    private GreenfootImage img;
    private int speed; //create getter
    private int health; //create getter
    private int rocket;
    private int gravity;
    
    
    public PizzaBox() {
        img = new GreenfootImage(15, 15);
        img.setColor(new Color(222,184,135));
        img.fill();
        setImage(img);
    }

    public void act() {
        die();
        move();
    }

    public void move() {
        gravity++;

        if (Greenfoot.isKeyDown("w")){
            
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

    public void die() { 
        if( getY() == getWorld().getHeight() - 1 ){
            getWorld().removeObject(this);
        }
    }
    
    public void useItems() {
        
        
    }
    
    public int getSpeed() {
        return speed; 
    }
    
    public void setSpeed(int change) { 
        speed += change;
    }
    
    public int getHealth() {
        return health; 
    }
    
    public void setHealth(int change) {
        health += change;
    }
    

}