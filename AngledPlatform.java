public class AngledPlatform implements Platform{

    private int plattFormState;
    private int plattformAngle;

    public AngledPlatform(int plattformAngle){

        this.plattformAngle = plattformAngle;
    }

    @Override
    public void plattformUp(int state) {
        this.setPlattformState(Math.min(this.getPlattformState() + state, plattformAngle));
        
        
    }

    @Override
    public void plattformDown(int state) {
        this.setPlattformState(Math.max(this.getPlattformState() - state, 0));
        
    }

    @Override
    public int getPlattformState() {
        return plattFormState;
    }

    @Override
    public void setPlattformState(int plattformState) {
        this.plattFormState = plattformState;
        
    }


    
}