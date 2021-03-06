/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TrainAdminRole;

import Business.EcoSystem;
import Business.Email.Emailer;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PassengerAdminEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PassengerOrganization;
import Business.Organization.TrainAdminOrganization;
import Business.Train.Train;
import Business.Train.TrainDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TrainWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.PassengerRole.EmailJPanel;
import userinterface.common.NotificationsJPanel;

/**
 *
 * @author anita
 */
public class TrainAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrainAdminWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
   
    private Enterprise enterprise;
    private UserAccount userAccount;
    private TrainDirectory trainDirectory;
    private TrainAdminOrganization trainAdminOrganization;
    private EcoSystem business;
    public TrainAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,TrainAdminOrganization trainAdminOrganization,Enterprise enterprise,TrainDirectory trainDirectory,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.trainDirectory=trainDirectory;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.trainAdminOrganization=trainAdminOrganization;
        this.business=business;
        populateWorkRequestTable();
    }

    private void populateWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        model.setRowCount(0);
        
        boolean found = false;
        for (Network network: business.getNetworkList()){
            for(Enterprise ent:network.getEnterpriseDirectory().getEnterpriseList()){
                if(ent instanceof PassengerAdminEnterprise){
                    for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof PassengerOrganization){
                            for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                                if (request instanceof TrainWorkRequest){
                                    Object[] row = new Object[7];
                                    row[0] = request;
                                    row[1] = request.getSender().getEmployee().getName();
                                    row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                                    row[3] = request.getStatus();
                                    Train train=((TrainWorkRequest)request).getTrain();
                                    row[4] = train.getTrainName();
                                    row[5] = train.getNosSeat();
                                    row[6] = train.getAvailSeat();

                                    model.addRow(row);
                                }
                            }
                            break;
                        }
                    }
                    found = true;
                    break;
                }
                if (found) {
                    break;
                }
            }
            if (found) {
                break;
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageTrainsjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        emailjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        sendNotificationJButton = new javax.swing.JButton();
        refreshjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setLayout(null);

        manageTrainsjButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageTrainsjButton.setForeground(new java.awt.Color(255, 51, 51));
        manageTrainsjButton.setText("Create Train Routes>>");
        manageTrainsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageTrainsjButtonActionPerformed(evt);
            }
        });
        add(manageTrainsjButton);
        manageTrainsjButton.setBounds(450, 180, 250, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("       Train Transportation");
        add(jLabel1);
        jLabel1.setBounds(400, 50, 296, 29);

        emailjButton.setText("Send Email");
        emailjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjButtonActionPerformed(evt);
            }
        });
        add(emailjButton);
        emailjButton.setBounds(300, 360, 110, 25);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Train Admin", "Sender", "Receiver", "Status", "Train Name", "Total Seats", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 230, 670, 100);

        sendNotificationJButton.setText("Send Notification");
        sendNotificationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendNotificationJButtonActionPerformed(evt);
            }
        });
        add(sendNotificationJButton);
        sendNotificationJButton.setBounds(450, 360, 129, 25);

        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });
        add(refreshjButton);
        refreshjButton.setBounds(180, 360, 77, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/TrainAdminRole/train.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(60, 20, 710, 200);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(80, 360, 81, 25);
    }// </editor-fold>//GEN-END:initComponents

    private void manageTrainsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageTrainsjButtonActionPerformed
        
        CreateTrainRouteJPanel m=new CreateTrainRouteJPanel(userProcessContainer,enterprise,userAccount,business,trainDirectory);
        userProcessContainer.add("Create Train",m);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_manageTrainsjButtonActionPerformed

    private void emailjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjButtonActionPerformed
    EmailJPanel ejp = new EmailJPanel(userProcessContainer);
    
        userProcessContainer.add("EmailJPanel",ejp );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_emailjButtonActionPerformed

    private void sendNotificationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendNotificationJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        TrainWorkRequest request = (TrainWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        Train train = request.getTrain();
        String notificationCategory = String.format("train.%s-%s.admin", train.getTrainId(), train.getTrainName());
        userProcessContainer.add("sendBusDriverNotificationJPanel", new NotificationsJPanel(userProcessContainer, business, notificationCategory));
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_sendNotificationJButtonActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
       populateWorkRequestTable();
    }//GEN-LAST:event_refreshjButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton emailjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageTrainsjButton;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JButton sendNotificationJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
