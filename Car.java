import java.awt.*;


    public abstract class Car extends Vehicle {
        public Car(int nrDoors, double enginePower, double currentSpeed, java.awt.Color color, String modelName,
                double x, double y) 
        {
            super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);
            //TODO Auto-generated constructor stub
        }

    
   @Override
    public void move() {
        startEngine();
        direction();    
        
    }



    }
