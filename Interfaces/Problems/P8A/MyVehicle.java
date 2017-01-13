package Problems.P8A;
public abstract class MyVehicle
{
   int traveled;
   int passengers;
   String color;
   
   public MyVehicle(int traveled, int passengers, String color){
       this.traveled = traveled;
       this.passengers = passengers;
       this.color = color;
   }       
   
   public int getTraveled(){
       return traveled;
    }
    
   public void setTraveled(int newTraveled){
       traveled = newTraveled;
   }
   
   public int getPassengers(){
       return passengers;
   }
    
   public void setPassengers(int newPassengers){
       passengers = newPassengers;
   }
   
   public String getColor(){
       return color;
   }
    
   public void setColor(String newColor){
       color = newColor;
   }
   
   public String toString() {
       return String.format("Vehicele tpye: %s%n" + 
                            "Passenger count: %s%n" +
                            "Color: %s");       
    }
  
   public abstract String connectToBluetooth();   
}