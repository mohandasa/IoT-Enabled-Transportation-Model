package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author anita
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private Map<String, Map<String, Object>> metrics;
    private Map<String, List<Notification>> notificationsByCategory;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        metrics = new HashMap<>();
        notificationsByCategory = new HashMap<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        return true;
    }
    
    public Map<String, Object> getStats(String name) {
        Map<String, Object> stats;
        if ((stats = this.metrics.get(name)) == null) {
            stats = new HashMap<>();
            this.metrics.put(name, stats);
        }
        return stats;
    }
    
    public List<Notification> getNotifications(String category) {
        if (this.notificationsByCategory == null) {
            this.notificationsByCategory = new HashMap<>();
        }
        List<Notification> notifications;
        if ((notifications = this.notificationsByCategory.get(category)) == null) {
            notifications = new ArrayList<>();
            this.notificationsByCategory.put(category, notifications);
        }
        return notifications;
    }

    public static class Notification {

        private Date date;
        private String type;
        private String message;
        private static final DateFormat DATE_FORMATTER = new SimpleDateFormat("dd-MM-yyy HH:mm");
        
        public Notification(Date date, String type, String message) {
            this.date = date;
            this.type = type;
            this.message = message;
        }

        public Date getDate() {
            return date;
        }
        
        public String getDateAsString() {
            return DATE_FORMATTER.format(date);
        }

        public String getType() {
            return type;
        }

        public String getMessage() {
            return message;
        }
        
    }
}