import java.awt.Color;

public abstract class Truck extends Vehicle implements Platform {

    public int plattformState;
    public boolean ableToMove;

    private Platform platform;

    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y,
     Platform platformtype) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);

        platform = platformtype;
    }

    

    
    }
    public void setAbleToMove(boolean ableToMove) {
        this.ableToMove = ableToMove;
    }

    public void move() {
        if (!ableToMove){
            System.out.println("Cant drive whith the current state of the platform");
        }
        else{
        startEngine();
        direction();    
        }
    }

    
}
