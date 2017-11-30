/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Passenger;

import Business.Car.Car;
import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class PassengerDirectory {
    
     ArrayList<Passenger>passengerList;

    public PassengerDirectory() {
        passengerList=new ArrayList<>();
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    
   
    
    public Passenger addPassenger(){
        Passenger p=new Passenger();
        passengerList.add(p);
        return p;
    }
    
    
    
    
    
}
