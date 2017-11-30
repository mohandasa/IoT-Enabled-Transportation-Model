/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Contact.Feedback;
import Business.Contact.FeedbackDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PassengerOrganization;
import Business.Passenger.Passenger;
import Business.Passenger.PassengerDirectory;
import Business.Train.TrainDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PassengerRole.PassengerWorkAreaJPanel;

/**
 *
 * @author anita
 */
public class PassengerRole extends Role {
    TrainDirectory trainDirectory;
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PassengerWorkAreaJPanel(userProcessContainer, account,(PassengerOrganization) organization, business);
    }
}