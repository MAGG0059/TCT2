import java.util.ArrayList;

public class Fleet
{
    private int name;
    private ArrayList<Machine> machines;
    private ArrayList<Sailor> sailors;
    private ArrayList<Machine> willBeDestroyed;
    private ArrayList<Capsulas> capsulas;
    public Fleet(int pname)
    {
        this.name = pname;
        this.sailors = new ArrayList<>();
        this.machines = new ArrayList<>();
        
    }

    public void moveNorth(){
        for(Machine m : machines){
                Position npos = m.getPosition();
                npos.changeLatitude(npos.getLatitude()+45);
                m.moveTo(npos);
            }
    }
    
    public ArrayList<Machine> willBeDestroyed(int longitude,int latitude){
        for(Machine m : machines){
            if(m.getPosition().getLatitude() == latitude && m.getPosition().getLongitud() == longitude){
                willBeDestroyed.add(m);
            }
        }
        return willBeDestroyed;
    }
    
    
}

