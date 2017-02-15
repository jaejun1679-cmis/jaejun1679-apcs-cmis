import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    /**
     * Act - do whatever the Tent wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(2);
        worldEdge();
        if (Greenfoot.getRandomNumber(100) < 3){
            turn(Greenfoot.getRandomNumber(360));
        }
    }   
    
        public void worldEdge(){
        int AxCor = getX();
        int AyCor = getY();

        if( AxCor == getWorld().getWidth() - 1 ){
            setLocation(1, AyCor);
        }

        if( AxCor == 0 ){
            setLocation(getWorld().getWidth(), AyCor);
        }

        if( AyCor == getWorld().getHeight() - 1 ){
            setLocation(AxCor, 1);
        }

        if( AyCor == 0 ){
            setLocation(AxCor, getWorld().getHeight() - 1);
        }
    }
}
