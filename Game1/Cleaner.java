import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)(your name) 

public class Cleaner extends Actor
{       
    private boolean mode = false;

    public void act() {
        move();
        change();
    }

    public void move() {
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
    }

    public void change() {
        String key = Greenfoot.getKey();
        if(key != null) {
            if(key.equals("q")) {
                if (mode) {
                    mode = false;
                    setImage("pyroFire.png");
                } else {
                    mode = true;
                    setImage("pyroWater.png");
                }
            }
        } 
    }    

    public void cleanse() {
        Actor found = getOneIntersectingObject(null); 

        if(found != null ) {
            if ((mode = false) && (isTouching(FSM.class) ) ) {
                removeTouching(null);

            } 

            if ((mode = true) && (isTouching(Blood.class) ) ) {
                removeTouching(null);

            }

        }
    }
}
