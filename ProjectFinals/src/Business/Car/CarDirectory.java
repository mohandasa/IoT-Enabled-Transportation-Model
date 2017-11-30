/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Car;

import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class CarDirectory {
    
    ArrayList<Car>carList;

    public CarDirectory() {
        carList=new ArrayList<>();
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

   
    
    public Car addCar(Car car){
        carList.add(car);
        return car;
    }
    
    
    
}
