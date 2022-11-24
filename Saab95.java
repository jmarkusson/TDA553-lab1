import java.awt.*;

public class Saab95 extends Car{

    private boolean turboOn;
    
    
    
    public Saab95(){
        super(2, 125, 0, Color.RED, "saab95", 0, 0);
        turboOn = false;

    }

    

    
    

    private void setTurboOn(){
	    turboOn = true;
    }

    private void setTurboOff(){
	    turboOn = false;
    }
    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return this.getEnginePower() * 0.01 * turbo;
    }
    @Override
    public void incrementSpeed(double amount){
        this.setcurrentSpeed() = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }
    @Override
    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }
    
    

    

    
}