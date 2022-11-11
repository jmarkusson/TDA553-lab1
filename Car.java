import java.awt.*;


public abstract class Car implements Movables{
    public static void main(String[] args) {
        
    }



    
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    public int x;
    public int y;
    
    public int current_direction;


    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y) {
        
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
        this.current_direction = 1;
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }
    
    public double speedFactor(){

        return speedFactor();

    }

    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    
    private void direction() {
        switch(this.current_direction){
            case 0:{
                y += currentSpeed;
                this.current_direction = 0;
                
            }
            case 1: {
                x += currentSpeed;

            }
            case 2:{
                y-= currentSpeed;
            }
            case 3:{
                x -= currentSpeed;
            }

        }
        
    }

    
    public void turnRight() {
        this.current_direction += 1;
        
        if (this.current_direction == 4){
            this.current_direction = 0;
        }
    }

    public void turnLeft(){
        this.current_direction -= 1;

        if (this.current_direction == -1){
            this.current_direction = 3;
        }

    }

    public void move() {
        startEngine();
        direction();
        
        
    }
}

    
    
    
    

