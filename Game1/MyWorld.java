import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    FSM alien1, alien2;
    private int currX, currY;
    private int ticker = 0;
    private FireCleaner Fcleaner;
    private WaterCleaner Wcleaner;

    public MyWorld() {    
        super(600, 400, 1);
        populate();
        change();

    }

    public void populate(){
        alien1 = new FSM();
        alien2 = new FSM();
        Fcleaner = new FireCleaner();

        addObject(alien1, Greenfoot.getRandomNumber(590), Greenfoot.getRandomNumber(390));
        addObject(alien2, alien1.getX(), alien1.getY());
        addObject(Fcleaner, 300, 200);

        for(int index = 0; index < 20; index++ ) {
            addObject(new Blood(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(340));
        }   
    }

    public void change() {

        String key = Greenfoot.getKey();
        if(key != null){
            if(key.equals("q")){
                ticker();
            }
        }

    }

    public void ticker(){
        ticker++;
        if (ticker % 2 == 0) {
            currX = Fcleaner.getX();
            currY = Fcleaner.getY();
            WaterCleaner Wcleaner = new WaterCleaner();
            addObject(Wcleaner, currX, currY); 
            removeObject(Fcleaner);

        }

        if (ticker % 2 != 0) {
            currX = Wcleaner.getX();
            currY = Wcleaner.getY();
            FireCleaner Fcleaner = new FireCleaner();
            addObject(Fcleaner, currX, currY);
            removeObject(Wcleaner);

        }
    }  

}