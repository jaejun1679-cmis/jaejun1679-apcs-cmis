import greenfoot.*;
import java.util.*;
public class Exterminator extends Actor
{
    private int cheeseCount;
    private int life;
    private int killCount;
    private int delay;
    private boolean haveTrap;
    
    public Exterminator(){
        haveTrap = true;
        cheeseCount = 5;
        life = 1;
        killCount = 0;
        delay = 0;
        getImage().mirrorVertically();
        turn(180);
    }

    public void act() 
    {
        die();
        if(Greenfoot.isKeyDown("w")){
            move(1);
        }
        if(Greenfoot.isKeyDown("a")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("d")){
            turn(3);
        }
        if(Greenfoot.isKeyDown("j") && delay-- <= 0){
            dropCheese();
            delay = 25;
        } 
    }    

    public void dropCheese(){
        if(cheeseCount > 0){
            MyWorld w = (MyWorld)getWorld();
            w.addCheese(getX(), getY());
            cheeseCount--;
        }
    }
    
    public void addKillCount() {
        killCount++;       
    }
    
    public void touching() {
        if(isTouching(CheeseBomb.class)){
            cheeseCount += 5;
        }
    }
    
    public void die(){
        if(isTouching(Rat.class)){
            MyWorld w = (MyWorld)getWorld();
            w.lose();
        }
    }
}