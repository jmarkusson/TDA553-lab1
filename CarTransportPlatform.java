import java.util.LinkedList;

public class CarTransportPlatform implements Platform {

    private int plattFormState;
    private boolean ableToLoad;
    private LoadFunction load;
    
    private int capacity;

    public CarTransportPlatform(int capacity){
        load = new LoadFunction(10);
        this.capacity = capacity;
        
    }

    @Override
    public void plattformUp(int state) {
        this.setPlattformState(1);
        
    }

    @Override
    public void plattformDown(int state) {
        this.setPlattformState(0);
        
    }

    @Override
    public int getPlattformState() {
        
        return plattFormState;
    }

    @Override
    public void setPlattformState(int plattFormState) {
        this.plattFormState = plattFormState;
        
    }
    
    
}
