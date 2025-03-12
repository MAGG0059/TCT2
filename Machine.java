
public class Machine
{
    
    private Position Coordinate;

    
    public Machine(Position coordinate)
    {
        this.Coordinate = coordinate;
    }

    public void moveTo(Position nCoordinate){
        Coordinate.changeLatitude(nCoordinate.getLatitude());
        Coordinate.changeLongitud(nCoordinate.getLongitud());
    }
    
    public Position getPosition(){
        return Coordinate;
    }
}

