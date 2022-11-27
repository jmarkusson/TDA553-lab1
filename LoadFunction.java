import java.util.LinkedList;

public class LoadFunction{

public void loadCar(Car c, Truck ct, LinkedList cars){

    if (ct.getX() < c.getX() && c.getX() < (ct.getX() +2) && (ct.getY() < c.getY() && c.getY() < (ct.getY() +2))){
        cars.addLast(c);

    }
    
}
public void unloadCar(Car c, Truck ct, LinkedList cars){

    for (int i=1; i < cars.length;  {



    }

}



}