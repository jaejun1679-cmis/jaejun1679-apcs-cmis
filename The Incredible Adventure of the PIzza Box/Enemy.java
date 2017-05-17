import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Enemy extends Actor
{
    public void kill() {
        Actor PizzaBox;
        PizzaBox = getOneObjectAtOffset(0, 0, PizzaBox.class);
        if(PizzaBox != null) {
            World world = getWorld();
            world.removeObject(PizzaBox);
        }
    }
}