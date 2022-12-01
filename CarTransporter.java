import java.awt.Color;


public class CarTransporter extends Truck implements CarLoadable {
    
    private CarLoad load;

    public CarTransporter() {
        super(2, 100, 0, Color.BLACK, "Car Transporter", 0, 0,
         new CarTransportPlatform());
         load = new CarLoad(10);
    }


    @Override
    public Boolean isAbleToMove() {
        if (getPlatformState() == 1){
            return true;
        }
        else {
            return false;
        } 
    }


    @Override
    public void load(Car c) {
        if (getPlatformState() == 0){
            load.load(getX(), getY(), c);
        }
    }

    @Override
    public void unload() {
        if(getPlatformState() == 0){
           load.unload(getX(), getY());
        }        
    }
}
