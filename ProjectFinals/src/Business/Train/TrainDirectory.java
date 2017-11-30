/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Train;

import Business.Bus.Bus;
import Business.Car.Car;
import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class TrainDirectory {
    ArrayList<Train>trainList;

    public TrainDirectory() {
        trainList=new ArrayList<>();
    }

    public ArrayList<Train> getTrainList() {
        return trainList;
    }

    public void setTrainList(ArrayList<Train> trainList) {
        this.trainList = trainList;
    }
    
     public Train addTrain(Train t)
    {
       
        trainList.add(t);
        return t;
    }
    
    
    
    public void removeTrain(Train t)
    {
        trainList.remove(t);
    }
    
}
