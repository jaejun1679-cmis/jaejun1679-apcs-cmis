import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Node extends Actor
{
    
    private Node target;
    private GreenfootImage img;
    
    //Instance variables that change behavior
    private int dir = 0;
    private int spd;
    private boolean flash ;
    
    //Constants that change behavior
    private final double changeDirProb = 0.8;
    private final int turnStep = 15;
    public Node(Node target){
        this.target = target;
        img = new GreenfootImage(30,30);
        changeColor();
        setImage(img);
        flash = false;
        if(target != null){
            spd = target.spd;
        } else {
            spd = 1;
        }
    }
    
    public void act() 
    {
        moveLeader();
        moveFollower();
        adjustSpeed();  
        if( Math.random() > 0.5 ){
            changeColor();
        }
    }
    
    public void setTarget(Node target){
        this.target = target;
    }
    
    public Node getTarget(){
        return target;
    }
    
    private void moveLeader(){
        if ( isLeader() ){
            if ( Math.random() > changeDirProb ){
                dir = -1 + Greenfoot.getRandomNumber(3);
            }
            turn(turnStep * dir);
            move(spd);
            if( isAtEdge() ){
                turnTowards(300, 200);
            }    
        }
    }
    
    private void moveFollower(){
        if ( !isLeader() && shouldMove() ){
            turnTowards(target.getX(), target.getY());
            move(spd);
        }
    }
    
    private void adjustSpeed(){
        if ( Greenfoot.isKeyDown("w") ){
                spd++;
        }
        if ( Greenfoot.isKeyDown("s") ){
                spd--;
        }
    }
    
     public boolean isLeader(){
        return target == null;
    }
    
    public boolean shouldMove(){
        return !intersects(target);
    }
    
    public void changeColor(){
        img.setColor(new Color((float)Math.random(), (float)Math.random(), (float)Math.random()));
        img.fillOval(0,0,30,30);
    }
}