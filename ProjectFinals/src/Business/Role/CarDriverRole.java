/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Car.CarDirectory;
import Business.Car.CarDriverDirectory;
import Business.EcoSystem;
import Business.Enterprise.CarTransportEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.CarDriverOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CarDriverRole.CarDriverWorkAreaJPanel;

/**
 *
 * @author anita
 */
public class CarDriverRole extends Role{
    
    private CarDriverOrganization carDriverOrganization;
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise ,EcoSystem business) {
        CarTransportEnterprise ctEnterprise = (CarTransportEnterprise) enterprise;
        return new CarDriverWorkAreaJPanel(userProcessContainer, account, (CarDriverOrganization) organization,enterprise,ctEnterprise.getCarDriverDirectory(),ctEnterprise.getCarDirectory(),business);
    
    }
    }

