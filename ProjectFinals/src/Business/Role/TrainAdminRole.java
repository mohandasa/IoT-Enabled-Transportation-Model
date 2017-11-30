/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TrainAdminOrganization;
import Business.Train.TrainDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TrainAdminRole.TrainAdminWorkAreaJPanel;


/**
 *
 * @author anita
 */
public class TrainAdminRole extends Role{
    TrainDirectory trainDirectory;
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       
        if (trainDirectory==null){
            trainDirectory=new TrainDirectory();
        }
        
        return new TrainAdminWorkAreaJPanel(userProcessContainer,account, (TrainAdminOrganization) organization, enterprise,trainDirectory,business);
}
    
}
