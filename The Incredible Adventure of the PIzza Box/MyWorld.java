import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int spawnChance;
    private int increaseChances = 0;
    private PizzaBox mainCharacter; 

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
        addObject(platform, 300, 395);

    }
    
    public void spawnEnemies() {
        spawnChance = Greenfoot.getRandomNumber(100) + increaseChances;
        System.out.println(spawnChance);
        if(spawnChance > 99) {
            addObject(new Sheep(mainCharacter), Greenfoot.getRandomNumber(500),50);
            increaseChances = 0;
        }

        increaseChances++;
    }

    public void spawnItems() {

    }

}