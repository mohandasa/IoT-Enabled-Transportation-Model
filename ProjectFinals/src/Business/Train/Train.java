/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Train;

import Business.Employee.EmployeeDirectory;

/**
 *
 * @author anita
 */
public class Train {
    
    private String trainName;
    private String trainSource;
    private String trainDestination;
    private int cost;
    private int trainId;
    private int nosSeat = 0;
    private EmployeeDirectory bookedPassengerDirectory;
    
    public static int count=1000;
    
    public Train(){
        trainId=count++;
        bookedPassengerDirectory = new EmployeeDirectory();
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainSource() {
        return trainSource;
    }

    public void setTrainSource(String trainSource) {
        this.trainSource = trainSource;
    }

    public String getTrainDestination() {
        return trainDestination;
    }

    public void setTrainDestination(String trainDestination) {
        this.trainDestination = trainDestination;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

  

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Train.count = count;
    }

    public int getNosSeat() {
        return nosSeat;
    }

    public void setNosSeat(int nosSeat) {
        this.nosSeat = nosSeat;
    }
    
    public int getAvailSeat() {
        return getNosSeat() - getBookedPassengerDirectory().getEmployeeList().size();
    }

    public EmployeeDirectory getBookedPassengerDirectory() {
        return bookedPassengerDirectory;
    }

    @Override
    public String toString() {
        return trainName;
    }
    
    
    
    
}
