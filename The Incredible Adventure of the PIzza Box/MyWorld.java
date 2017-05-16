import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld() {    
        super(600, 400, 1);
        
        populate();
        

        
    }
    
    public void populate() {
        PizzaBox pizzaBox = new PizzaBox();
        addObject(pizzaBox, 60, 350);
        
        Platform platform = new Platform();
        addObject(platform, 300, 395);
        
        int x = Greenfoot.getRandomNumber(100);
        
        if(x < 3) {
            Sheep sheep1 = new Sheep(pizzaBox); 
            addObject(sheep1, Greenfoot.getRandomNumber(400),0);
        }
        
    }
    
}