/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author anita
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Admin("Admin Organization", null), 
        BusDriver("BusDriver Organization", Enterprise.EnterpriseType.BusTransport),
        Passenger("Passenger Organization", Enterprise.EnterpriseType.PassengerAdmin),
        CarDriver("Car Organization", Enterprise.EnterpriseType.CarTransport),
        BusAdmin("BusAdmin Organization", Enterprise.EnterpriseType.BusTransport),
        TrainAdmin("TrainAdmin Organization", Enterprise.EnterpriseType.TrainTransport);
        
        
        private String value;
        private Enterprise.EnterpriseType entType;
        private Type(String value, Enterprise.EnterpriseType entType) {
            this.value = value;
            this.entType = entType;
        }
        public String getValue() {
            return value;
        }

        public Enterprise.EnterpriseType getEnterpriseType() {
            return entType;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
