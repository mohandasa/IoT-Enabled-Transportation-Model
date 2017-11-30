/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Bus.Bus;
import Business.Bus.BusDirectory;
import Business.BusDriver.BusDriverDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BusAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BusAdminRole.BusAdminWorkAreaJPanel;

/**
 *
 * @author anita
 */
public class BusAdminRole extends Role{
    BusDirectory busDirectory;
    BusDriverDirectory busDriverDirectory;
    Bus bus;
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        
        
        if(busDirectory ==null){
            busDirectory=new BusDirectory();
            
        }
        
        if(busDriverDirectory ==null){
            busDriverDirectory=new BusDriverDirectory();
        }
        
        if(bus==null){
            bus=new Bus();
            
        }
        
        return new BusAdminWorkAreaJPanel(userProcessContainer,account,(BusAdminOrganization)organization, enterprise,busDirectory,busDriverDirectory,bus,business);
}
}
