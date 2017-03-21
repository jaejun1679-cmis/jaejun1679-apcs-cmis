import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Cheese extends Actor
{
    private int freshness;
    private GreenfootImage img;
    public Cheese(){
        img = new GreenfootImage(20, 20);
        img.setColor(Color.yellow);
        img.fill();
        freshness = 500 + Greenfoot.getRandomNumber(500);
        setImage(img);
    }

    public void act(){
        freshness--;
        if(isRotten()) { 
            MyWorld w = (MyWorld)getWorld();
            w.removeObject(this);
        }
        if(freshness < 500) {
            img.setColor(Color.green);
            img.fill();
            if(freshness < 250) {
                img.setColor(Color.GREEN.darker());
                img.fill();
                if(freshness < 130) {
                    img.setColor(Color.BLACK);
                    img.fill();
                }
            }
        }
    }

    public boolean isRotten(){
        return freshness < 0;
    }
}
