import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class PizzaBox extends Actor implements Behavior
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
    
    public void act() {
        
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

    
    public void endWorld() { 
        int AxCor = getX();
        int AyCor = getY();
        
        if( AxCor == getWorld().getWidth() - 1 ){
            setLocation(1, AyCor);
        }
        
        if( AxCor == 0 ){
            setLocation(getWorld().getWidth(), AyCor);
        }
        
        if( AyCor == getWorld().getHeight() - 1 ){
            setLocation(AxCor, 1);
        }
        
        if( AyCor == 0 ){
            setLocation(AxCor, getWorld().getHeight() - 1);
        }
    }
}