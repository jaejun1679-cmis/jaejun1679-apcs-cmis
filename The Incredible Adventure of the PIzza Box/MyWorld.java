import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld() {    
        super(600, 400, 1);
        populate();
        dead();

        
    }
    
    public void populate() {
        PizzaBox pizzaBox = new PizzaBox();
        addObject(pizzaBox, 60, 350);
        
        Platform platform = new Platform();
        addObject(platform, 300, 395);
    }

    public void dead() {
        
    }

}