import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int spawnChance;
    private int increaseChances = 0;
    private PizzaBox mainCharacter; 
    JumpCounter jumpman = new JumpCounter();
    Score scoreCount = new Score();

    public MyWorld() {    
        super(600, 400, 1);
        populate();
    }

    public void act() {
        spawnEnemies();
    }
    
    public PizzaBox getMain() {
        return mainCharacter;
    }

    public void populate() {
        PizzaBox pizzaBox = new PizzaBox();
        mainCharacter = pizzaBox;
        addObject(pizzaBox, 60, 350);

        addObject(new Platform(), 60, 390);
        addObject(new Platform(), 185, 370);
        addObject(new Platform(), 300, 390);
        addObject(new Platform(), 440, 390);
        addObject(new Platform(), 560, 390);        
        addObject(new Platform(), 560, 340);
        addObject(new Platform(), 0, 330);
        addObject(new Platform(), 5, 290);
        addObject(new Platform(), 20, 330);
        addObject(new Platform(), 60, 330);        
        addObject(new Platform(), 300, 250);
        addObject(new Platform(), 330, 280);
        addObject(new Platform(), 260, 250);        
        addObject(new Platform(), 0, 330);
        addObject(new Platform(), 470, 250);
        addObject(new Platform(), 490, 230);
        addObject(new Platform(), 570, 210);
        addObject(new Platform(), 30, 220);
        addObject(new Platform(), 147, 267);
        addObject(new Platform(), 338, 177);
        addObject(new Platform(), 480, 148);
        addObject(new Platform(), 373, 118);
        addObject(new Platform(), 147, 267);
        addObject(new Platform(), 137, 267);
        addObject(new Platform(), 147, 267);
        addObject(new Platform(), 142, 181);       
        addObject(new Platform(), 75, 145);        
        addObject(new Platform(), 13, 135);
        addObject(new Platform(), 179, 125);        
        addObject(new Platform(), 240, 73);        
        addObject(new Platform(), 53, 83);        
        addObject(new Platform(), 415, 106);
        addObject(new Platform(), 504, 42);
        
        addObject(new Pepperoni(), 145, 241);
        addObject(new Pepperoni(), 561, 318);
        addObject(new Pepperoni(), 32, 59);
        addObject(new Pepperoni(), 437, 229);
        addObject(new Pepperoni(), 185, 347);
        
        
        addObject(new Speed(), 562, 365);
        addObject(new Speed(), 13, 270);
        
        addObject(new Boost(), 570, 186);
        
        addObject(new Dominos(), 580, 20);

        addObject(jumpman, 70, 25);
        addObject(scoreCount, 70, 35);
    }

    public JumpCounter getJumpCounter() {
        return jumpman;
    }
    
    public Score getScore() {
        return scoreCount;
    }

    public void spawnEnemies() {
        spawnChance = Greenfoot.getRandomNumber(5000);
        if(spawnChance < 30) {
            addObject(new Pizza(), 590, Greenfoot.getRandomNumber(390));
        }
        if(spawnChance < 50) {
            addObject(new Alligator(), 10, Greenfoot.getRandomNumber(395));
        }
        if(spawnChance < 20) {
            addObject(new Sheep(mainCharacter), Greenfoot.getRandomNumber(500), 50);
        }
    }
}