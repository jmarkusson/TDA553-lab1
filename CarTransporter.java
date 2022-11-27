import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;

public class CarTransporter extends Truck {

    private LinkedList<Car> cars;
    private boolean ableToLoad;

    public CarTransporter() {
        super(2, 100, 0, Color.BLACK, "Car Transporter", 0, 0, 
        new CarTransportPlatform(10));
        
    }


    @Override
    public void incrementSpeed(double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void decrementSpeed(double amount) {
        
    }

    public void loadCar(Car c){
        if (this.getX() < c.getX() && c.getX() < (this.getX() +2) && (this.getY() < c.getY() && c.getY() < (this.getY() +2))){
            cars.addLast(c);

        }
        
    }

    public void unloadCars(){
        if (ableToLoad){
            

        }

        
    }

    @Override
    public
    double speedFactor() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public void plattformUp(int state) {
        this.setPlattformState(1);
        this.setAbleToMove(true);
        ableToLoad = true;
    }


    



}
