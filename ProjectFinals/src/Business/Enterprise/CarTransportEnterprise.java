/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Car.CarDirectory;
import Business.Car.CarDriverDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class CarTransportEnterprise extends Enterprise{
    CarDriverDirectory carDriverDirectory;
    CarDirectory carDirectory;
    
     public CarTransportEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.CarTransport);
    }

    public CarDriverDirectory getCarDriverDirectory() {
        if (carDriverDirectory == null) {
             carDriverDirectory = new CarDriverDirectory();
         }
        return carDriverDirectory;
    }

    public CarDirectory getCarDirectory() {
         if (carDirectory == null) {
             carDirectory = new CarDirectory();
         }
        return carDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
