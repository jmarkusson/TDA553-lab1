public class Turbomode {
    private boolean turboOn;
    private double turbo;

    public Turbomode() {
        turboOn = false;
        this.turbo = 1;
    }

    public double getTurbo() {
        return turbo;
    }

    public void setTurbo(double turbo) {
        this.turbo = turbo;
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }

    public boolean isTurboOn() {
        return turboOn;
    }
    
}
