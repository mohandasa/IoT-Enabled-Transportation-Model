/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
         
        
        
          if (type.getValue().equals(Type.BusDriver.getValue())){
            organization = new BusDriverOrganization();
            organizationList.add(organization);
        }
        
      
        
        else if (type.getValue().equals(Type.Passenger.getValue())){
            organization = new PassengerOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.CarDriver.getValue())){
            organization = new CarDriverOrganization();
            organizationList.add(organization);
        }
        
       
        
        else if (type.getValue().equals(Type.TrainAdmin.getValue())){
            organization = new TrainAdminOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.BusAdmin.getValue())){
            organization = new BusAdminOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
}