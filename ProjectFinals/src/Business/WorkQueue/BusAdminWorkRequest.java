/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Bus.Bus;
import Business.Bus.BusDirectory;
import Business.Passenger.Passenger;

/**
 *
 * @author anita
 */
public class BusAdminWorkRequest extends WorkRequest{
    
   private String testResult;
    
    private  Bus bus;
    private Passenger passenger;

    
    public BusAdminWorkRequest(){
        bus = new Bus();
        passenger=new Passenger();
    }
    
    
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    
    
    

    
    
    
    
}
