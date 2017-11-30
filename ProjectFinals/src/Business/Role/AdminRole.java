/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.ManageSensorJPanel;

/**
 *
 * @author anita
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.SensorAdmin.getValue())) {
            return new ManageSensorJPanel(userProcessContainer, enterprise, business);
        } else {
            return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
        }
        
    }

    
    
}
