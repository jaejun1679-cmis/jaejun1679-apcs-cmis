package Problems.P8B_v1;
public class BWTV extends TV implements Analog
{
    public String rotateRabbitEars(){
        final String degree  = "\u00b0";
        return "Rabbit ears rotated 45" + degree + ".";
    }
    
    public String tvType(){
        return "Black & White television: ";
    }
}
