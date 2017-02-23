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
    
    FSM alien1, alien2;
        
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        populate();
        
        //bloodCounter();
        
    }

    public void populate(){
        alien1 = new FSM();
        alien2 = new FSM();
        Cleaner cleaner1 = new Cleaner();
        WaterCleaner waterCleaner1 = new WaterCleaner();
        FireCleaner fireCleaner1 = new FireCleaner();
        
        
        
        addObject(alien1, Greenfoot.getRandomNumber(590), Greenfoot.getRandomNumber(390));
        addObject(alien2, alien1.getX(), alien1.getY());
        addObject(cleaner1, 300, 200);
        
        
        Blood blood1 = new Blood();
        Blood blood2 = new Blood();
        Blood blood3 = new Blood();
        Blood blood4 = new Blood();
        Blood blood5 = new Blood();
        Blood blood6 = new Blood();
        Blood blood7 = new Blood();
        Blood blood8 = new Blood();
        Blood blood9 = new Blood();
        Blood blood10 = new Blood();
        
        addObject(blood1, Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(340));
        addObject(blood2, Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(340));
        addObject(blood3, Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(340));
        addObject(blood4, Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(340));
        addObject(blood5, Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(340));
        addObject(blood6, Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(340));
        addObject(blood7, Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(340));
        addObject(blood8, Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(340));
        addObject(blood9, Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(340));
        addObject(blood10, Greenfoot.getRandomNumber(590), Greenfoot.getRandomNumber(340));        
    }
    
    /*
    public void bloodCounter(){
        int counter = 0;
        while(counter >= 10) {
            if (counter == 49) {
                spoutBlood();
                counter = 0;
            }
            counter++;
        }
    }
    
    public void spoutBlood(){
        Blood moreBlood = new Blood();
        addObject(moreBlood, alien1.getX(), alien1.getY());
        addObject(moreBlood, alien2.getX(), alien2.getY());
    }
    */
}