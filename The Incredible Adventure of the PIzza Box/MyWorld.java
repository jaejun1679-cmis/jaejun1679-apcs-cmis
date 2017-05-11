import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld() {    
        super(600, 400, 1);
        populate();
        dead();

        
    }
    
    public void populate() {
        PizzaBox pizzaBox = new PizzaBox();
        addObject(pizzaBox, 60, 370);
    }

    public void dead() {
        
    }

}