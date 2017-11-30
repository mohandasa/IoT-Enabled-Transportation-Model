/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CarDriverRole;


import Business.Car.Car;
import Business.Car.CarDirectory;
import Business.Car.CarDriverDirectory;
import Business.EcoSystem;
import Business.Email.Emailer;
import Business.Enterprise.Enterprise;
import Business.Organization.CarDriverOrganization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.CarDriverWorkRequest;
import Business.WorkQueue.CarTestWorkRequest;
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
public class CarDriverWorkAreaJPanel1 extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CarDriverOrganization carDriverOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private CarDriverDirectory carDriverDirectory;
    private CarDirectory carDirectory;
    private EcoSystem business;
    /**
     * 
     */
    public CarDriverWorkAreaJPanel1(JPanel userProcessContainer, UserAccount account, CarDriverOrganization organization, Enterprise enterprise,CarDriverDirectory carDriverDirectory,CarDirectory carDirectory,EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.carDriverOrganization=organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.carDriverDirectory=carDriverDirectory;
        this.carDirectory=carDirectory;
        this.business=business;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((CarTestWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            Car car=((CarTestWorkRequest) request).getCar();
            row[4] = car == null ? "Waiting" : car;
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        sensorMessagesJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sourcejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CarTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        destinationjTextField = new javax.swing.JTextField();
        viewDetailsjButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        removeSensorMsgBtn = new javax.swing.JButton();
        emailjButton = new javax.swing.JButton();
        sendNotificationJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        sensorMessagesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sensorMessagesJTable);
        if (sensorMessagesJTable.getColumnModel().getColumnCount() > 0) {
            sensorMessagesJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        requestTestJButton.setText("Add Car Details");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        jLabel1.setText("Source:-");

        jLabel2.setText("Car Code");

        CarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Destination:-");

        viewDetailsjButton1.setText("View Car Detail's");
        viewDetailsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsjButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Car Driver's Process Flow");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Test Details:-");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Sensor Messages");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Driver Name", "Receiver", "Status", "Result", "Car Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        removeSensorMsgBtn.setText("Remove Message");
        removeSensorMsgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSensorMsgBtnActionPerformed(evt);
            }
        });

        emailjButton.setText("Send Email");
        emailjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjButtonActionPerformed(evt);
            }
        });

        sendNotificationJButton.setText("Send Notification");
        sendNotificationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendNotificationJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(sourcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(destinationjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(CarTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(viewDetailsjButton1)
                                .addGap(28, 28, 28)
                                .addComponent(emailjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendNotificationJButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(removeSensorMsgBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addComponent(refreshTestJButton)
                                    .addGap(33, 33, 33)
                                    .addComponent(requestTestJButton))
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(114, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestTestJButton)
                    .addComponent(refreshTestJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailsjButton1)
                    .addComponent(emailjButton)
                    .addComponent(sendNotificationJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sourcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(destinationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(removeSensorMsgBtn)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new TestJPanel1(userProcessContainer, userAccount, enterprise,carDriverDirectory,carDirectory,business));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void viewDetailsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsjButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
       
       if (selectedRow < 0){
           return;
       }
       
        WorkRequest request1 = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
       System.out.println(request1.getReceiver());
        CarTestWorkRequest request = (CarTestWorkRequest)request1;
      // CarTestWorkRequest request = (CarTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        Car bd =   request.getCar();
        
        
            sourcejTextField.setText(bd.getSource());
            destinationjTextField.setText(bd.getDestination());
            CarTextField.setText(String.valueOf(bd.getCarCode()));
            
        fetchSensorMessages();
    }//GEN-LAST:event_viewDetailsjButton1ActionPerformed

    public void fetchSensorMessages() {
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        CarTestWorkRequest request = (CarTestWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        Car selectedCar = request.getCar();
        
        DefaultTableModel model = (DefaultTableModel) sensorMessagesJTable.getModel();
        model.setRowCount(0);
        for (int reqId=0; reqId<carDriverOrganization.getWorkQueue().getWorkRequestList().size(); reqId++) {
            WorkRequest aRequest = carDriverOrganization.getWorkQueue().getWorkRequestList().get(reqId);
            if (aRequest instanceof CarDriverWorkRequest) {
                CarDriverWorkRequest cdReq = (CarDriverWorkRequest) aRequest;
                if (selectedCar.getName().equals(cdReq.getCar().getName())) {
                    addSensorMessageToTable(reqId, cdReq.getSensorMessage());
                }
            }
        }
    }
    
    public void addSensorMessageToTable(Integer id, String message){
        DefaultTableModel model = (DefaultTableModel) sensorMessagesJTable.getModel();
        Object[] row = new Object[5];
        row[0] = id;
        row[1] = message;
        model.addRow(row);
    }
    
    private void CarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CarTextFieldActionPerformed

    private void removeSensorMsgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSensorMsgBtnActionPerformed
        int selectedRow = sensorMessagesJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        
        int reqId = (int) sensorMessagesJTable.getValueAt(selectedRow, 0);
        carDriverOrganization.getWorkQueue().getWorkRequestList().remove(reqId);
//        ((DefaultTableModel)sensorMessagesJTable.getModel()).removeRow(selectedRow);
        fetchSensorMessages();
    }//GEN-LAST:event_removeSensorMsgBtnActionPerformed

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

        CarTestWorkRequest request = (CarTestWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        Car car = request.getCar();
        String notificationCategory = String.format("car.%s-%s.driver", car.getCarCode(), car.getName());
        userProcessContainer.add("sendBusDriverNotificationJPanel", new NotificationsJPanel(userProcessContainer, business, notificationCategory));
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_sendNotificationJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CarTextField;
    private javax.swing.JTextField destinationjTextField;
    private javax.swing.JButton emailjButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton removeSensorMsgBtn;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton sendNotificationJButton;
    private javax.swing.JTable sensorMessagesJTable;
    private javax.swing.JTextField sourcejTextField;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewDetailsjButton1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}