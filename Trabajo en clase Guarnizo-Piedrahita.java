public interface SelfDestructible{ 
    void selfDestructible(String causa);
    String getDestructionCause();
}
public abstract class Machine implements SelfDestructible{
    protected boolean destruido = false;
    protected String causaDestruccion = "";
    @Override 
    public void selfDestruct(String causa){
        this.destruido = true;
        this.causaDestruccion = causaDestruccion
    }
    @Override
    public String getDestructionCause(){
        return causaDestruccion;
    }
    public boolean isDestroyed(){
        return destruido;
    }
}
public class Sailor extends Machine{
    public void ejecutarAutoDestruccion(){
        selfDestruct("Autodestruccion ordenada");
    }
}
public class Ship extends Machine{
    public void ejecutarAutoDestruccion(){
        selfDestruct("Autodestruccion ordenada");
    }
}
public class AirCraft extends Machine{
    public void ejecutarAutoDestruccion(){
        selfDestruct("Autodestruccion ordenada");
    }
}
public class Capsule extends Machine{
    private Machine motherShip;
    public Capsule(Machine motherShip){
        this.motherShip = motherShip;
    }
    public void checkMotherShip(){  
        if(motherShip.isDestroyed()){
            selfDestruct("Autodestruccion ordenada");
        }
    }
}
import.java.util.ArrayList;
public class Fleet{
    private ArrayList<Machine> machines = new ArrayList<>();
    private ArrayList<Machine> destroyedMachines = new ArrayList<>();
    public void addMachine(Machine machine){
        machines.add(machine);
    }
    public void ejecutarAutoDestruccion(Machine machine){
        machine.selfDestruct("Autodestruccion ordenada");
        destroyedMachines.add(machine);
    }
    public void selfDestructAll() throws BattleShipException{
        if(machines.isEmpty()){
            throw new BattleShipException("No hay maquinas pa destruir");
        }
        for (Machine machine:machines){
            ejecutarAutoDestruccion(machine);
        }
        machines.clear()
    }
    public ArrayList<Machine> getDestroyedMachines(){
        return destroyedMachines;
    }
    public boolean isDestroyed(Machine machine){
        return destroyedMachines.contains(machine);
    }
}