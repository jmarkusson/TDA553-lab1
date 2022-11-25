import java.awt.Color;

public class Scania extends Truck {

    
    private final static int plattformAngle = 70;
    IPlatform hej;

    public Scania() {
        super(2, 100, 0, Color.BLACK, "Scania Interlink", 0, 0);
        
    }

    @Override
    public void incrementSpeed(double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void decrementSpeed(double amount) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public double speedFactor() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void plattformUp(int state){
       
        this.setPlattformState(Math.min(this.getPlattformState() + state, plattformAngle));
        this.setAbleToMove(false);
    }

    @Override
    public void plattfromDown(int state) {
       
        this.setPlattformState(Math.max(this.getPlattformState() - state, 0));

        if (this.getPlattformState()== 0){
            this.setAbleToMove(true);
        }
        
    }

}