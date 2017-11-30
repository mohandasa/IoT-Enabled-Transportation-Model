/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Car;

import Business.Employee.Employee;

/**
 *
 * @author anita
 */
public class CarDriver extends Employee {
  
    private  CarDirectory carDirectory;
    public CarDriver(){
        carDirectory=new CarDirectory();
    }

    public CarDirectory getCarDirectory() {
        return carDirectory;
    }

    public void setCarDirectory(CarDirectory carDirectory) {
        this.carDirectory = carDirectory;
    }

   
    
            
    
    

    @Override
    public String toString() {
        return this.getName();
    }
    
    
    
    
}
