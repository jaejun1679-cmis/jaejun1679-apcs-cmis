import greenfoot.*; 
import java.awt.Color;

public class CheeseBomb extends Actor
{
    private int timer = 1000;
    private GreenfootImage img;
    
    public CheeseBomb(){
        img = new GreenfootImage(25,25);
        img.setColor(Color.red);
        img.fillOval(0,0,25,25);
        setImage(img);
    }
    
    public void act() 
    { 
        adder();
    }
    
    public void adder() {
        timer--;
        int random = Greenfoot.getRandomNumber(4);
        if (timer <= 0){
            if (random == 0 ) {
                getWorld().addObject(new CheeseBomb(), 10, Greenfoot.getRandomNumber(400));
            }
            if (random == 1 ) {
                getWorld().addObject(new CheeseBomb(), 590, Greenfoot.getRandomNumber(400));
            }
            if (random == 2 ) {
                getWorld().addObject(new CheeseBomb(), Greenfoot.getRandomNumber(600), 10);
            }
            if (random == 3 ) {
                getWorld().addObject(new CheeseBomb(), Greenfoot.getRandomNumber(600), 390);
            }
            timer = 1000;
        }
    }
}