import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)(your name) 

public class Cleaner extends Actor
{       
    private boolean mode;

    public void act() {
        move();
        change();
        cleanse();
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
        Actor foundFSM = getOneIntersectingObject(FSM.class);
        Actor foundBlood = getOneIntersectingObject(Blood.class);
        
        if(foundFSM != null || foundBlood != null ) {
            if ((mode == false) && (isTouching(FSM.class) ) ) {
                getWorld().removeObject(foundFSM);
                MyWorld myWorld = (MyWorld) getWorld();
                FSMCounter counterA = myWorld.getMonsterCounter();
                counterA.changeCount(1);
            } 

            if ((mode == true) && (isTouching(Blood.class) ) ) {
                getWorld().removeObject(foundBlood);
                MyWorld myWorld = (MyWorld) getWorld();
                BloodCounter counterB = myWorld.getBloodCounter();
                counterB.changeCount(1);
            }

        }
    }
}
