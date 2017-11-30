/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Car.Car;

/**
 *
 * @author anita
 */
public class CarDriverWorkRequest extends WorkRequest {
    
    private  Car car;
    private String sensorMessage;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getSensorMessage() {
        return sensorMessage;
    }

    public void setSensorMessage(String sensorMessage) {
        this.sensorMessage = sensorMessage;
    }
    
}
