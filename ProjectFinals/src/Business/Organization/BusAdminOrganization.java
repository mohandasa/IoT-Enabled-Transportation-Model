/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BusAdminRole;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class BusAdminOrganization extends Organization{
    
     public BusAdminOrganization() {
        super(Organization.Type.BusAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BusAdminRole());
        return roles;
    }
    
    
    
}
