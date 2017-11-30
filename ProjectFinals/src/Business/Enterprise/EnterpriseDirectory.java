/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
       
        
         if(type == Enterprise.EnterpriseType.BusTransport){
            
             enterprise = new BusTransportEnterprise(name);
            enterpriseList.add(enterprise);
            
            
        }
        
        else if(type == Enterprise.EnterpriseType.CarTransport){
             enterprise = new CarTransportEnterprise(name);
            enterpriseList.add(enterprise);
            
            
        }
        
        else if(type == Enterprise.EnterpriseType.TrainTransport){
            
             enterprise = new TrainTransportEnterprise(name);
            enterpriseList.add(enterprise);
            
            
        }
         
         else if(type == Enterprise.EnterpriseType.PassengerAdmin){
            
             enterprise = new PassengerAdminEnterprise(name);
            enterpriseList.add(enterprise);
            
            
        }
         
         else if (type == Enterprise.EnterpriseType.SensorAdmin) {
             enterprise = new SensorAdminEnterprise(name);
             enterpriseList.add(enterprise);
         }
        return enterprise;
        
        
    }
        public boolean checkIfEnterpriseIsUnique(String enterprise){
        for (Enterprise e : enterpriseList){
            if (e.getName().equals(enterprise))
                return false;
        }
        return true;
    }
        
        
        
        
        
        
        
        
    }
    
