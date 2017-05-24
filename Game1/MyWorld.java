import greenfoot.*;
public class MyWorld extends World
{
    FSM alien1, alien2;
    private int ticker = 0;
    Cleaner cleaner;
    BloodCounter counterBlood = new BloodCounter();
    FSMCounter counterFSM = new FSMCounter();

    public MyWorld() {    
        super(600, 400, 1);
        populate(); 
    }
    
    public void populate(){
        alien1 = new FSM();
        alien2 = new FSM();
        cleaner  = new Cleaner();

        addObject(alien1, Greenfoot.getRandomNumber(590), Greenfoot.getRandomNumber(390));
        addObject(alien2, alien1.getX(), alien1.getY());

        addObject(cleaner, 300, 200);

        for(int index = 0; index < 20; index++ ) {
            addObject(new Blood(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(340));
        } 

        addObject(counterBlood, 70, 20); 
        addObject(counterFSM, 70, 40);
    }

    public BloodCounter getBloodCounter() {
        return counterBlood; 
    }

    public FSMCounter getMonsterCounter() {
         return counterFSM; 
    }
}