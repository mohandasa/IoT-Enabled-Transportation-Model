/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BusDriver;

import Business.Bus.Bus;
import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class BusDriverDirectory {
    
     ArrayList<BusDriver>busDriverList;

    public BusDriverDirectory() {
        busDriverList=new ArrayList<>();
    }

    public ArrayList<BusDriver> getBusDriverList() {
        return busDriverList;
    }

    public void setBusDriverList(ArrayList<BusDriver> busDriverList) {
        this.busDriverList = busDriverList;
    }

    

   
    public BusDriver addBusDriver(){
        BusDriver bd=new BusDriver();
        busDriverList.add(bd);
        return bd;
    }
    
    public void removeBusDriver(BusDriver a)
    {
        busDriverList.remove(a);
    }
    
}
