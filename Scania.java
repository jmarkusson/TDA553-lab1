import java.awt.Color;

public class Scania extends Truck implements Platform {

    
    private final static int plattformAngle = 70;
    

    public Scania() {
        super(2, 100, 0, Color.BLACK, "Scania Interlink", 0, 0,
        new AngledPlatform(70));
        
        
    }

    

    @Override
    public void plattformUp(int state) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void plattformDown(int state) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getPlattformState() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setPlattformState(int plattFormState) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Boolean issetAbleToMove() {
        if (platform.getPlattformState() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    

}