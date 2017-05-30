import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Dominos extends Actor
{ 
    private int stopper = 0;
    public Dominos() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 1950, image.getHeight() - 1950);
        setImage(image);
    }

    public void act() {
        finish();
    }    

    public void finish() {
        Actor actor;
        actor = getOneObjectAtOffset(0, 0, PizzaBox.class);
        stopper = 1;
        
        while((stopper != 0 && actor != null)) {
            won();
            stopper = 0;
        }

    } 
    
    public void won() {
        Greenfoot.setWorld(new Win());
    }
}
