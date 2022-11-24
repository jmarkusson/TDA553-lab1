import java.awt.*;


public abstract class Car implements Movables{
    public static void main(String[] args) {
        
    }



    
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    




    public double x;
    public double y;
    
    public int current_direction;


    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, double x, double y) {
        
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
        this.current_direction = 1;
        
    }


    public String getModelName() {
        return modelName;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y += y;
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
    public void setCurrentSpeed(double new_speed){
        this.currentSpeed = new_speed;
        


    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }
    
    public double speedFactor(){

        return speedFactor();

    }

    public void incrementSpeed(double amount){
        
    }

    public void decrementSpeed(double amount){
        
    }

    // TODO fix this method according to lab pm
    public void gas(double amount)throws Exception{
    
        
            
            if (amount > 1 || amount < 0){
                throw new Exception("Only values from 0 to 1");
            }
            else{
                incrementSpeed(amount);

            }

            
        
    }

    // TODO fix this method according to lab pm
    public void brake(double amount)throws Exception{
        if (amount > 1 || amount < 0){
            throw new Exception("Only accept values from 0 to 1");
        }
        else{
            decrementSpeed(amount);

        }
        
    }

    
    private void direction() {
        switch(this.current_direction){
            case 0:{
                this.setY(currentSpeed); 
                break;
                
            }
            case 1: {
                this.setX(currentSpeed); 
                break;
            }
            case 2:{
                this.setY(-currentSpeed);
                break;
            }
            case 3:{
                this.setX(currentSpeed);
                break;
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

    
    
    
    

