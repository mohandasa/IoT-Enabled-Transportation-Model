/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.Role;
import Business.Role.TrainAdminRole;
import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class TrainAdminOrganization extends Organization{
     public TrainAdminOrganization() {
        super(Organization.Type.TrainAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TrainAdminRole());
        return roles;
    }
    
}
