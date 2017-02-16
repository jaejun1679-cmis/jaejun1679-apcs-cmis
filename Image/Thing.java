import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Thing extends Actor
{
    private GreenfootImage img, alt;
    
    public Thing(){
        img = new GreenfootImage(50,50);
        img.setColor(Color.red);
        img.fill();
        alt = new GreenfootImage(img);
        img.setColor(Color.cyan);
        img.fillRect(12,12,25,25);
        img.fillRect(25, 0, 1, 50);
        img.fillRect( 0,25,50,1 );
        int r = Greenfoot.getRandomNumber(255);
        int g = Greenfoot.getRandomNumber(255);
        int b = Greenfoot.getRandomNumber(255);
        Color myColor = new Color(r,g,b);
        img.setColor(myColor);
        img.fillOval(12,12,25,25);
        
        alt.setColor(Color.yellow);
        alt.drawRect(10,10, 29,29);

        setImage(img);
    }

    public void act() 
    {
        changeImage();
    }    
    
    public void changeImage(){
        String key = Greenfoot.getKey();
        if(key != null){
            if( key.equals("c")){
                setImage(getImage() == img ? alt : img);
            }
        }
    }
} 