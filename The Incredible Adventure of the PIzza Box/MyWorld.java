import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int spawnChance;
    private int increaseChances = 0;
    private PizzaBox mainCharacter; 
    JumpCounter jumpman = new JumpCounter();

    public MyWorld() {    
        super(600, 400, 1);
        populate();

    }

    public void act() {
        spawnEnemies();
        spawnItems();
    }

    public void populate() {
        PizzaBox pizzaBox = new PizzaBox();
        mainCharacter = pizzaBox;
        addObject(pizzaBox, 60, 350);

        Platform platform = new Platform();
        addObject(platform, 300, 393);
        addObject(jumpman,70, 25);
    }
    
    public JumpCounter getJumpCounter() {
        return jumpman; 
    } 

    public void spawnEnemies() {
        spawnChance = Greenfoot.getRandomNumber(1000);

        /*
        if(spawnChance < 30) {
        addObject(new Pizza(), Greenfoot.getRandomNumber(500), 50);
        }

        if(spawnChance < 50) {
        addObject(new Alligator(), 500, 300);
        }

        if(spawnChance < 20) {
        addObject(new Sheep(mainCharacter), Greenfoot.getRandomNumber(500),50);
        }
         */


    }

    public void spawnItems() {

    }
}