/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Car.Car;
import Business.Passenger.Passenger;
import Business.Train.Train;

/**
 *
 * @author anita
 */
public class TrainWorkRequest extends WorkRequest{
    
     private String testResult;
   
    private  Train train;
    private Passenger passenger;
    
    
    
    public TrainWorkRequest(){
        train = new Train();
        passenger=new Passenger();
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    
    
    
}
