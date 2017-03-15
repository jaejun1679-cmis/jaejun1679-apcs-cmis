import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cleaner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cleaner extends Actor
{       
    private int ticker = 0; 

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
                ticker();
            }
        }
        clean();
    }

    public void ticker(){
        ticker++;
        if (ticker % 2 == 0) {
            setImage("pyroFire.png");
        }
        if (ticker % 2 != 0) {
            setImage("pyroWater.png");
        }
    }

    public void clean(){
        if (this.getImage().equals("pyroFire.png") && isTouching(FSM.class)) {
            if (Blood.class !=  null) {
                getWorld().removeObjects(getWorld().getObjects(FSM.class));
            }
        }

        if (this.getImage().equals("pyroWater.png") && isTouching(Blood.class)) {
            if (Blood.class !=  null) {
                getWorld().removeObjects(getWorld().getObjects(Blood.class));
            }
        }  
    }
}
