import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Health extends Item
{
    public Health() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 20, image.getHeight() - 20);
        setImage(image);
    }
    
    public void effect() {
        health++;
    }
    
    public void act() {
        
    }    
}
