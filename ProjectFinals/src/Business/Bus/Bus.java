/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Bus;

import Business.Employee.EmployeeDirectory;
import Business.Passenger.PassengerDirectory;
import java.util.Date;

/**
 *
 * @author anita
 */
public class Bus {
    private String busName;
    private String busType;
    private int busId;
    private int nosSeat = 0;
    private String busSource;
    private String busDestination;
    private int cost;
     
     private Date startDate;
     private Date endDate;
     private int startTime;
     private int endTime;
     
    private EmployeeDirectory bookedPassengerDirectory;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

   

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public EmployeeDirectory getBookedPassengerDirectory() {
        return bookedPassengerDirectory;
    }
     
    public static int count=1;
    
    public Bus(){
        busId=count++;
        bookedPassengerDirectory = new EmployeeDirectory();
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
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

    public String getBusSource() {
        return busSource;
    }

    public void setBusSource(String busSource) {
        this.busSource = busSource;
    }

    public String getBusDestination() {
        return busDestination;
    }

    public void setBusDestination(String busDestination) {
        this.busDestination = busDestination;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

   

   @Override
  public String toString() {
       return busName;
   }
   
}
