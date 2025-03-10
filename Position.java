
public class Position
{

    private int longitud;
    private int latitude;
    
    public Position(int nlongitud, int nlatitude)
    {
        this.longitud = nlongitud;
        this.latitude = nlatitude;
    }

    public int getLatitude(){
        return this.latitude;
    }
    
    
    public int getLongitud(){
        return this.longitud;
    }
    
    public void changeLatitude(int nlatitude){
        this.latitude = nlatitude;
    }
    
    public void changeLongitud(int nlongitud){
        this.longitud = nlongitud;
    }
}
