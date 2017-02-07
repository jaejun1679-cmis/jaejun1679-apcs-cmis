import greenfoot.*;  
import java.util.*;

public class MyWorld extends World
{
    private Node node, first, last;
    private ArrayList<Node> masterArray = new ArrayList<Node>();
    
    public MyWorld()
    {
        super(600, 400, 1); 
        
        node = new Node(null);
        first = node;
        masterArray.add(first);
        
        addObject(node, 300, 200);
        for (int index = 1; index < 8; index++){
            node = new Node(node);
            addObject(node, 300, 200);
            last = node;
            masterArray.add(last);
        }
    }

    public void act(){
        String key = Greenfoot.getKey();
        
        if (key != null){
            if ( key.equals("n")){
                addNode();
            }

            if ( key.equals("r")){
                removeNode();
            }
            
            if ( key.equals("q")){
                removeHead();
            }
        }
        
        
    }

    public int[] getNewLocation(){
        int[] location;
        if(getObjects(null).contains(first)){
            location = new int[]{first.getX(), first.getY()};
        }else{
            location = new int[]{Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight())};
        }
        return location;
    }

    public void addNode(){
        node = new Node(last);
        if( first == null ){
            first = node;
        }
        int[] loc = getNewLocation();
        last = node;
        addObject(node, loc[0], loc[1]);
    }

    public void removeNode(){
        if( last != null ){
            removeObject(last);
            last = last.getTarget();
            first = last == null ? null : first;
        }
    }
    
    public void removeHead(){
        masterArray.remove(first); removeObject(first);
        
        if(masterArray.contains(node)) {
            node = new Node(null);
            masterArray.set(1, node);
        }

        
        masterArray.trimToSize();
    }
}