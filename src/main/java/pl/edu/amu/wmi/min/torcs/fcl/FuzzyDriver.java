/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.min.torcs.fcl;

/**
 *
 * @author bikol
 */
public class FuzzyDriver extends Controller {

    @Override
    public Action control(SensorModel sensors) {
        
        Action toReturn = new Action();
        double steer=0;
        double accel=0;
        double brake=0;
        
        
        toReturn.steering = steer;
        toReturn.accelerate = accel;
        toReturn.brake = brake;

        return toReturn;
    }

    public void reset() {
        System.out.println("Restarting the race!");

    }

    public void shutdown() {
        System.out.println("Bye bye!");
    }

}
