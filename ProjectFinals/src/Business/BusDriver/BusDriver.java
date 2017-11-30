/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BusDriver;

import Business.Employee.Employee;
import java.util.Date;

/**
 *
 * @author anita
 */
public class BusDriver  {
    
private String Fname;
private String Lname;
private Date Dob;
private String StreetAdd;
private int Zip;
private int PhoneNos;
private int driverId;
private String bloodGroup;
private String personEmail;
private int personCode;
private String personTown;

public static int count=100;

 public BusDriver(){
        driverId=count++;
 }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public int getPersonCode() {
        return personCode;
    }

    public void setPersonCode(int personCode) {
        this.personCode = personCode;
    }

    public String getPersonTown() {
        return personTown;
    }

    public void setPersonTown(String personTown) {
        this.personTown = personTown;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date Dob) {
        this.Dob = Dob;
    }

   
    public String getStreetAdd() {
        return StreetAdd;
    }

    public void setStreetAdd(String StreetAdd) {
        this.StreetAdd = StreetAdd;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int Zip) {
        this.Zip = Zip;
    }

    public int getPhoneNos() {
        return PhoneNos;
    }

    public void setPhoneNos(int PhoneNos) {
        this.PhoneNos = PhoneNos;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return String.valueOf(driverId);
    }
 

    
    
    
}
