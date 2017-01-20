import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Make actors that move, both with keys and cnotrolled by "AI"
 * 
 * JJ Choi
 * v.1
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setBackground("bluerock.jpg");
        
        
    }
    
    
    public void populate(){
        AIRotate air1 = new AIRotate();
        addObject(air1, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(300));
        
        AILinear ail1 = new AILinear();
        addObject(ail1, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(300));
        
        LControl lc1 = new LControl();
        addObject(lc1, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(300));
        
        RControl rc1 = new RControl();
        addObject(rc1, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(300));
    }
    
}
