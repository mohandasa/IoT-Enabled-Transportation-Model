/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Bus;

import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class BusDirectory {
    
    ArrayList<Bus>busList;

    public BusDirectory() {
        busList=new ArrayList<>();
    }

    public ArrayList<Bus> getBusList() {
        return busList;
    }

    public void setBusList(ArrayList<Bus> busList) {
        this.busList = busList;
    }

   
    public Bus addBus(){
        Bus d=new Bus();
        busList.add(d);
        return d;
    }
    
    public void removeBus(Bus b)
    {
        busList.remove(b);
    }
    
    
}
