import java.util.ArrayList;


public class AircraftCarrier extends Ship

{
    private int number;
    private int capacity;
    private ArrayList<Plane> airplanes ;

    public AircraftCarrier(Position coordinate)
    {
        super(coordinate); 
        this.airplanes = new ArrayList<>();
    }

}
