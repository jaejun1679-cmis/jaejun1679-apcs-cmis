package Problems.P8B_v1;
public abstract class TV
{
    private boolean tvON;
    
    public boolean getTvOn(){
        return tvON;
    }
    
    public void setTvON(boolean newTvON){
        tvON = newTvON;
    }
    
    public abstract String tvType();
}
