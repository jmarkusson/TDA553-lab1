import java.util.Scanner;

public class Run {

    public static void main(String[] args)throws Exception {
        new Run().program();

    }
    void program() throws Exception{
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();
        System.out.println("Before moving:");
        System.out.println("saabx: " + saab.x + " saab y: " +  saab.y);
        saab.move();
        volvo.move();
        System.out.println("After moving:");
        System.out.println("saabx: " + saab.x + " saab y: " +  saab.y);
        
        System.out.println("After turning left: ");
        saab.turnLeft();
        saab.move();
        System.out.println("saabx: " + saab.x + " saab y: " +  saab.y);
        saab.brake(-1);


    }
}
