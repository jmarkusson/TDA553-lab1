import java.util.ArrayDeque;
import java.util.ArrayList;


public class LoadFunction{
public ArrayDeque<Car>cars;
public int capacity;

public LoadFunction(int capacity){

    cars = new ArrayDeque<>(cars);
    this.capacity = capacity;

}

public void loadCar(Car c,double x,double y){

    if (x < c.getX() && c.getX() < (x +2) && y < c.getY() && c.getY() < y +2 && cars.size() < capacity){
        cars.add(c);
    }
    else if(cars.size() +1 > capacity){
        System.out.println("There is no capacity for any more cars");

    }
    else{
        System.out.println("The car is not close enough to be loaded");

    }

    }
    

public void unloadCar(double x, double y){

    Car c = cars.pop();

    c.setX(x+1);
    c.setY(y+1);

    

}




}