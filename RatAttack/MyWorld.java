import greenfoot.*; 
import java.util.*;

public class MyWorld extends World
{
    private long startTime;
    private long runningTime;
    private int level = 1;
    private int score = 0;
    private double spawnChance = level * 0.01;//semantic error
     
    public MyWorld()
    {
        super(600, 400, 1); 
        init(level);
    }

    public void init(int level){
        List<Actor> actors = getObjects(null);
        for(Actor a: actors){
            removeObject(a);
        }
        for(int i=0; i<level; i++){
            addObject(new Rat(), 50, Greenfoot.getRandomNumber(400));
        }
        addObject(new Exterminator(), 520, 200);
        addObject(new Trap(), 550, 200);
        startTime = System.currentTimeMillis();
        isSpawn();
    }

    public void act(){
        runningTime = System.currentTimeMillis() - startTime;
        double showTime = runningTime/1000.0;
        int displayTime = (int)(15 -(showTime));
        
        //List<Actors> ratActors = getObjects(Rat.class);
        
        if(getObjects(Rat.class).size() == 0){
            init(level++);
        }
        
        showText(score+"  "+ displayTime, 50, 50);
        if((displayTime == 0)) {
            addObject(new Rat(), 0, Greenfoot.getRandomNumber(400));
            startTime = 0;
        }
    }

    public void addCheese(int x, int y){
        addObject(new Cheese(), x, y);
    }

    public void score(){
        score++;
    }

    public void lose(){
        showText("Game Over!!", 300, 200);
        Greenfoot.stop();
    }
    
    public void isSpawn() {
        int deter = Greenfoot.getRandomNumber(100) + 1; 
        if(spawnChance <= deter / 100) {
            addObject(new RatDisease(), Greenfoot.getRandomNumber(599) + 1, Greenfoot.getRandomNumber(399) + 1);
        }
    }
}