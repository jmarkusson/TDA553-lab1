import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class VehicleController {
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    VehicleView frame;
    // A list of Vehicles, modify if needed
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    //methods:

    public static void main(String[] args) {
        // Instance of this class
        VehicleController cc = new VehicleController();

        cc.vehicles.add(new Volvo240());

        // Start a new view and send a reference of self
        cc.frame = new VehicleView("Vehiclesim 1.0", cc);

        // Start the timer
        cc.timer.start();
    }

    /* Each step the TimerListener moves all the Vehicles in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            for (Vehicle vehicle : vehicles) {
                vehicle.move();
                int x = (int) Math.round(vehicle.getX());
                int y = (int) Math.round(vehicle.getY());
                frame.drawPanel.moveit(x, y);
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }
        }
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        System.out.println("No");
        double gas = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles
                ) {
            try {
                vehicle.gas(gas);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(vehicle.getX());
        }
    }

    void startEngine() {

        System.out.println("Yes");
        for (Vehicle vehicle : vehicles){
            
            vehicle.startEngine();
           
        }

    }

    
}