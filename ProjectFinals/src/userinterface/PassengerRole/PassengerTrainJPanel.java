/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PassengerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization.PassengerOrganization;
import Business.Train.Train;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TrainWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author anita
 */
public class PassengerTrainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PassengerTrainJPanel
     */
    
    private final JPanel userProcessContainer;
    private final EcoSystem business;
    private final UserAccount userAccount;
    private final PassengerOrganization passengerOrganization;
    
    public PassengerTrainJPanel(JPanel userProcessContainer,UserAccount userAccount,PassengerOrganization passengerOrganization,EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.userAccount=userAccount;
        this.passengerOrganization=passengerOrganization;
        populateTable();
    }

    
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        for(WorkRequest request : passengerOrganization.getWorkQueue().getWorkRequestList()){
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
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        bookSeatJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        viewDetailsjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        trainNamejTextField = new javax.swing.JTextField();
        trainSourcejTextField = new javax.swing.JTextField();
        trainDjTextField = new javax.swing.JTextField();
        costjTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        notificationsjLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notificationsJTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Train Information:-");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Train Name", "Total Seats", "Availability"
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

        bookSeatJButton.setText("Book Seat");
        bookSeatJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSeatJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        viewDetailsjButton.setText("View");
        viewDetailsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsjButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Train Name");

        jLabel3.setText("Train Source");

        jLabel4.setText("Train Destination");

        jLabel5.setText("Cost");

        trainNamejTextField.setEditable(false);

        trainSourcejTextField.setEditable(false);

        trainDjTextField.setEditable(false);
        trainDjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainDjTextFieldActionPerformed(evt);
            }
        });

        costjTextField.setEditable(false);
        costjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costjTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Train Details:-");

        notificationsjLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        notificationsjLabel.setForeground(new java.awt.Color(51, 51, 255));
        notificationsjLabel.setText("Notifications");

        notificationsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DateTime", "Type", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(notificationsJTable);
        if (notificationsJTable.getColumnModel().getColumnCount() > 0) {
            notificationsJTable.getColumnModel().getColumn(0).setMinWidth(150);
            notificationsJTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            notificationsJTable.getColumnModel().getColumn(0).setMaxWidth(150);
            notificationsJTable.getColumnModel().getColumn(1).setMinWidth(100);
            notificationsJTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            notificationsJTable.getColumnModel().getColumn(1).setMaxWidth(100);
            notificationsJTable.getColumnModel().getColumn(2).setMinWidth(450);
            notificationsJTable.getColumnModel().getColumn(2).setPreferredWidth(450);
            notificationsJTable.getColumnModel().getColumn(2).setMaxWidth(450);
        }

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\anita\\Desktop\\Project\\steamtrain10324.png")); // NOI18N

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bookSeatJButton)
                                    .addGap(32, 32, 32)
                                    .addComponent(refreshJButton)
                                    .addGap(43, 43, 43)
                                    .addComponent(processJButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(viewDetailsjButton))
                                .addComponent(notificationsjLabel)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(costjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(trainDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(trainSourcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(trainNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(429, 429, 429))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(refreshJButton)
                        .addComponent(bookSeatJButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(processJButton)
                        .addComponent(viewDetailsjButton)))
                .addGap(9, 9, 9)
                .addComponent(backjButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(trainNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(trainSourcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(trainDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(costjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(notificationsjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookSeatJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSeatJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        Train train = ((TrainWorkRequest) request).getTrain();
        if (hasAlreadyBooked(train)) {
            System.out.println("you have already booked a seat on this train!");
 JOptionPane.showMessageDialog(null, "You have alraedy booked a seat on this train", "Seat Booked in the train",JOptionPane.INFORMATION_MESSAGE);
        
        } else if (train.getAvailSeat() == 0) {
            System.out.println("No seats available on this train!");
  JOptionPane.showMessageDialog(null, "No seats avaliable on this train", "No seats available ",JOptionPane.INFORMATION_MESSAGE);
        
            
        } else {
            train.getBookedPassengerDirectory().getEmployeeList().add(this.userAccount.getEmployee());
            updateBookingStats();
            populateTable();
        }
        populateTable();

    }//GEN-LAST:event_bookSeatJButtonActionPerformed

    private boolean hasAlreadyBooked(Train train) {
        for (Employee passenger: train.getBookedPassengerDirectory().getEmployeeList()) {
            if (passenger.getId() == this.userAccount.getEmployee().getId()) {
                return true;
            }
        }
        return false;
    }
    
    private void updateBookingStats() {
        Map<String, Object> stats = this.business.getStats("stats.bookings");
        Integer count;
        if ((count = (Integer) stats.get("passenger.count.train")) == null) {
            count = 0;
        }
        stats.put("passenger.count.train", ++count);
    }
    
    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        TrainWorkRequest request = (TrainWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        ProcessTrainJPanel processTrainJPanel = new ProcessTrainJPanel(userProcessContainer, request);
        userProcessContainer.add("processTrainJPanel", processTrainJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void viewDetailsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsjButtonActionPerformed
        
       int selectedRow =workRequestJTable.getSelectedRow();
     if (selectedRow < 0){
        return;
     }
 
        WorkRequest request =  (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
   System.out.println(request.getReceiver());
    TrainWorkRequest trainWorkRequest = (TrainWorkRequest) request;
     trainNamejTextField.setText(trainWorkRequest.getTrain().getTrainName());
     trainSourcejTextField.setText(trainWorkRequest.getTrain().getTrainSource());
     trainDjTextField.setText(trainWorkRequest.getTrain().getTrainDestination());
     costjTextField.setText(String.valueOf(trainWorkRequest.getTrain().getCost()));
     
        populateNotificationsTable(trainWorkRequest.getTrain());
    }//GEN-LAST:event_viewDetailsjButtonActionPerformed

    private void populateNotificationsTable(Train train) {
        DefaultTableModel model = (DefaultTableModel) notificationsJTable.getModel();
        model.setRowCount(0);
        
        String notificationCategory = String.format("train.%s-%s.admin", train.getTrainId(), train.getTrainName());
        List<EcoSystem.Notification> notifications = this.business.getNotifications(notificationCategory);
        Collections.sort(notifications, new Comparator<EcoSystem.Notification>() {
            @Override
            public int compare(EcoSystem.Notification n1, EcoSystem.Notification n2) {
                // desc order
                return -1*n1.getDate().compareTo(n2.getDate());
            }
        });
        for(EcoSystem.Notification notification : notifications) {
            Object[] row = new Object[3];
            row[0] = notification.getDateAsString();
            row[1] = notification.getType();
            row[2] = notification.getMessage();
            model.addRow(row);
        }
    }
    
    private void trainDjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainDjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trainDjTextFieldActionPerformed

    private void costjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costjTextFieldActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton bookSeatJButton;
    private javax.swing.JTextField costjTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable notificationsJTable;
    private javax.swing.JLabel notificationsjLabel;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField trainDjTextField;
    private javax.swing.JTextField trainNamejTextField;
    private javax.swing.JTextField trainSourcejTextField;
    private javax.swing.JButton viewDetailsjButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
