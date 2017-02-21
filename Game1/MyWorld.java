import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        populate();

    }

    public void populate(){
        FSM alien1 = new FSM();
        FSM alien2 = new FSM();
        WaterCleaner water1 = new WaterCleaner();

        addObject(alien1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        addObject(alien2, alien1.getX(), alien1.getY());
        addObject(water1, 300, 200);

    }
}

