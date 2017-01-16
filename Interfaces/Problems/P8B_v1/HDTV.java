package Problems.P8B_v1;
public class HDTV extends TV implements Digital
{
    public String connectHDMI(){
        return "HDMI cable connected.";
    }
    
    public String tvType(){
        return "UHD television: ";
    }
}
