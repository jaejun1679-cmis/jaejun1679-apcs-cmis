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
        
        populate();       
    }
    
    
    public void populate(){
        /*AIRotate air1 = new AIRotate();
        addObject(air1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        
        AILinear ail1 = new AILinear();
        addObject(ail1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        
        
        LControl lc1 = new LControl();
        addObject(lc1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        
        
        RControl rc1 = new RControl();
        addObject(rc1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        
        SpookySpider spook1 = new SpookySpider(lc1);
        addObject(spook1, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(200));
        
        */
        Ants ant1 = new Ants();
        addObject(ant1, 300, 200);
        
        Ants ant2 = new Ants(ant1);
        addObject(ant2, 300, 200);
        
        Ants ant3 = new Ants(ant2);
        addObject(ant3, 300, 200);
        
        Ants ant4 = new Ants(ant3);
        addObject(ant4, 300, 200);
        
        Ants ant5 = new Ants(ant4);
        addObject(ant5, 300, 200);
        
        Ants ant6 = new Ants(ant5);
        addObject(ant6, 300, 200);
        
        Ants ant7 = new Ants(ant6);
        addObject(ant7, 300, 200);        
    }    
}