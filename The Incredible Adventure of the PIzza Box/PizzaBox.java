import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;

public class PizzaBox extends Actor implements Behavior
{
    private GreenfootImage img;
    private int speed = 6;
    private int health = 1;
    private int rocket;
    private int gravity;
    private int timesJumped = 0;
    private int faster = 1;
    private boolean isJump;
    private ArrayList<Pepperoni> inventory = new ArrayList<Pepperoni>();

    public PizzaBox() {
        img = new GreenfootImage(15, 15);
        img.setColor(new Color(222,184,135));
        img.fill();
        setImage(img);
    }

    public void act() {
        die();
        move();
        fall();
        below();
        above();
        foundPepperoni();
        useSpeed();
        useHealth();
    }

    public void move() {
        if(Greenfoot.isKeyDown("w") && isJump == false) {
            jump();
            MyWorld myWorld = (MyWorld) getWorld();
            JumpCounter counter = myWorld.getJumpCounter();
            counter.changeCount(1);
        }

        if(Greenfoot.isKeyDown("a")){
            setLocation(getX() - speed, getY());           
        }

        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + speed);
        }

        if(Greenfoot.isKeyDown("d")){
            setLocation(getX() + speed, getY());
        } 
    }

    public boolean above() {
        Actor rightAbove = getOneObjectAtOffset(0, 0 , Platform.class);

        if(rightAbove != null) {
            gravity = 1;
            int rightAboveHeight = rightAbove.getImage().getHeight();
            int newY = rightAbove.getY() + (rightAboveHeight + getImage().getHeight())/2;
            setLocation(getX(), newY);
            return true;
        } else {
            return false;
        }
    }

    public void fall() {
        setLocation(getX(), getY() + gravity);
        if(gravity < 8) {
            gravity += faster;
        }
        isJump = true;
    }

    public boolean onGround() {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        if(ground == null) {
            isJump = true;
            return false;
        } else  {
            int groundHeight = ground.getImage().getHeight();
            int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
            setLocation(getX(), newY);
            isJump = false;
            return true;
        }
    }

    public void below() {
        if(onGround()) {
            gravity = 0;
        } else {
            fall();
        }
    }

    public void jump() {
        gravity -= 15;
        isJump = true;
    }

    public void foundPepperoni() {
        Actor found = getOneIntersectingObject(Pepperoni.class);        
        if( found != null ){
            pepperoniTime();
            getWorld().removeObject(found);
        }        
    }

    public void pepperoniTime() {
        Pepperoni pepperoniAdd;        
        inventory.add(new Pepperoni());
    }

    public void die() { 
        if( getY() == getWorld().getHeight() - 1){
            getWorld().removeObject(this);
        }
    }

    public void useSpeed() {
        Actor foundSpeed = getOneIntersectingObject(Speed.class);
        if( foundSpeed != null ) {
            getWorld().removeObject(foundSpeed);
        }

        setSpeed(2);
    }

    public void useHealth() {
        Actor foundHealth = getOneIntersectingObject(Health.class);
        if( foundHealth != null ) {
            getWorld().removeObject(foundHealth);
        }

        setHealth(1);
    }

    public int getSpeed() {
        return speed; 
    }

    public void setSpeed(int change) { 
        speed += change;
    }

    public int getHealth() {
        return health; 
    }

    public int getPepperoniCount() {
        return inventory.size();
    }

    public void setHealth(int change) {
        health += change;
    }
}