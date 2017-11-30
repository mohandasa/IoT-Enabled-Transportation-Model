/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Contact.FeedbackDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author anita
 */
public abstract class Enterprise extends Organization{

    private final EnterpriseType enterpriseType;
    private final OrganizationDirectory organizationDirectory;
    private final FeedbackDirectory feedbackDirectory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        feedbackDirectory = new FeedbackDirectory();
    }
    
    public enum EnterpriseType{
        PassengerAdmin("PassengerAdmin"),
        BusTransport("BusTransport"),
        CarTransport("CarTransport"),
        TrainTransport("TrainTransport"),
        SensorAdmin("SensorAdmin");
        
        private final String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public FeedbackDirectory getFeedbackDirectory() {
        return feedbackDirectory;
    }

}
