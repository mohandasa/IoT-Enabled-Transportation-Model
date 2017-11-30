/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Car.Car;
import Business.Passenger.Passenger;

/**
 *
 * @author anita
 */
public class CarTestWorkRequest extends WorkRequest{
    
    private String testResult;
    //private Employee carDriver;
    private  Car car;
    private Passenger passenger;
    
    
    
    public CarTestWorkRequest(){
        car = new Car();
        passenger=new Passenger();
    }
    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

   
    
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    
    

   
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
