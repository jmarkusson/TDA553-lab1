import java.awt.Color;

public abstract class Truck extends Vehicle {

    
    
    private final double slowfactor = 0.8;
    public Platform platform;

    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y,
     Platform platformtype) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);

        platform = platformtype;
    }

    @Override
    public void incrementSpeed(double amount) {
        this.setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,this.getEnginePower()));;
        
    }

    @Override
    public void decrementSpeed(double amount) {
        this.setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
        
    }


    @Override
    public double speedFactor() {
        return this.getEnginePower() * 0.01 * slowfactor;
        
    }
    

    
    
    abstract Boolean issetAbleToMove(); 
        
    

    public void move() {
        if (!issetAbleToMove()){
            System.out.println("Cant drive whith the current state of the platform");
        }
        else{
        startEngine();
        direction();    
        }
    }

    
}
