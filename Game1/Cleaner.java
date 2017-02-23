import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cleaner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cleaner extends Actor
{       
    private int change = 0; 

    public void act() 
    {        
        if(Greenfoot.isKeyDown("w")){
            move(3);
        }
        if(Greenfoot.isKeyDown("a")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("s")){
            move(-3);
        }
        if(Greenfoot.isKeyDown("d")){
            turn(3);
        }
        
        String key = Greenfoot.getKey();
        if(key != null){
            if(key.equals("q")){
                change();
            }
        }
    }

    public void change(){
        change++; 
        if (change % 2 == 0) {
            setImage("pyroFire.png");
            
        }
        if (change % 2 != 0) {
            setImage("pyroWater.png");
            
        }
    }
    
    public void clean(){
        if(this.getImage().equals("pyroFire.png") /* && add touching conditional*/  ){
            
        }
        
        if(this.getImage().equals("pyroWater.png") /* && /*add touching conditional*/) {
            
        }        
    }
}