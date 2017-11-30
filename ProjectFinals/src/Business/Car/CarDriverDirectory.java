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
public class CarDriverDirectory {
    
     ArrayList<CarDriver>carDriverList;

    public CarDriverDirectory() {
        carDriverList=new ArrayList<>();
    }

    public ArrayList<CarDriver> getCarDriverList() {
        return carDriverList;
    }

    public void setCarDriverList(ArrayList<CarDriver> carDriverList) {
        this.carDriverList = carDriverList;
    }

   
    public CarDriver addCarDriver(){
        CarDriver d=new CarDriver();
        carDriverList.add(d);
        return d;
    }
    
}
