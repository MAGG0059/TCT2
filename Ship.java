import java.util.ArrayList;

public class Ship extends Machine {
    private ArrayList<Sailor> sailors;
    
    public Ship(Position coordinate) {
        super(coordinate); 
        this.sailors = new ArrayList<>();
    }
    
}