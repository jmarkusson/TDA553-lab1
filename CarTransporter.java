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
    public Boolean issetAbleToMove() {
        if (platform.getPlattformState() == 1){
            return false;
        }
        else{
            return true;
        }
        
    }


   


    



}
