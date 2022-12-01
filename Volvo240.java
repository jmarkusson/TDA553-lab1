import java.awt.*;

public class Volvo240 extends Car{

    private TrimMode trim;
    
    public Volvo240(){

        super(4, 100, 0, Color.black, "Volvo240", 0, 0);

        this.trim = new TrimMode(1.28);
        
    }
    
    @Override
    public double speedFactor(){
        return this.getEnginePower() * 0.01 * trim.getTrimFactor();
    }

}


