/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TrainAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PassengerAdminEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PassengerOrganization;
import Business.Train.Train;
import Business.Train.TrainDirectory;
import Business.UserAccount.UserAccount;
import Business.Validator.Validators1;
import Business.WorkQueue.TrainWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anita
 */
public class CreateTrainRouteJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateTrainJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private TrainDirectory trainDirectory;
    private EcoSystem business;
    public CreateTrainRouteJPanel(JPanel userProcessContainer,Enterprise enterprise,UserAccount userAccount,EcoSystem business,TrainDirectory trainDirectory) {
        initComponents();
        this.trainDirectory=trainDirectory;
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
        this.business=business;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tnamejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        trainSourcejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        trainDestinationjTextField = new javax.swing.JTextField();
        Cost = new javax.swing.JLabel();
        costjTextField = new javax.swing.JTextField();
        createjButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        Seats = new javax.swing.JLabel();
        seatsjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 153));
        jLabel1.setText("Train Details");

        jLabel2.setText("Train Name");

        jLabel4.setText("Train Source");

        jLabel5.setText("Train Destination");

        trainDestinationjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainDestinationjTextFieldActionPerformed(evt);
            }
        });

        Cost.setText("Cost");

        costjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costjTextFieldActionPerformed(evt);
            }
        });

        createjButton.setText("CREATE");
        createjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButtonActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        Seats.setText("Seats");

        seatsjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsjTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/TrainAdminRole/train1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(Cost)
                            .addComponent(Seats))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainDestinationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainSourcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(34, 34, 34)
                        .addComponent(createjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(trainSourcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(trainDestinationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cost)
                    .addComponent(costjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seats)
                    .addComponent(seatsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(createjButton))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void trainDestinationjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainDestinationjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trainDestinationjTextFieldActionPerformed

    private void costjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costjTextFieldActionPerformed

    private void createjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButtonActionPerformed
       System.out.println("control is here");
    	
    	StringBuilder errorMessage = new StringBuilder();
        
        Train t=new Train();
    	
    	if (Validators1.isValidString(tnamejTextField.getText())) {
    		t.setTrainName(tnamejTextField.getText());
    	} else {
    		// error message + new line character
    		errorMessage.append("Please enter valid Train name").append('\n');
    	}
    	if (Validators1.isValidString(costjTextField.getText())
				&& Validators1.isValidInteger(costjTextField.getText())) {
			t.setCost(Integer.parseInt(costjTextField.getText()));
		} else {
    		// error message + new line character
    		errorMessage.append("Please enter valid Cost").append('\n');
    	} 
        
        if (Validators1.isValidString(trainSourcejTextField.getText())) {
    		t.setTrainSource(trainSourcejTextField.getText());
    	} else {
    		// error message + new line character
    		errorMessage.append("Please enter valid Train source").append('\n');
    	}
        
        if (Validators1.isValidString(trainDestinationjTextField.getText())) {
    		t.setTrainDestination(trainDestinationjTextField.getText());
    	} else {
    		// error message + new line character
    		errorMessage.append("Please enter valid Train Destination").append('\n');
    	}
        
        if (Validators1.isValidInteger(seatsjTextField.getText())) {
            t.setNosSeat(Integer.parseInt(seatsjTextField.getText()));
        } else {
            // error message + new line character
            errorMessage.append("Please enter valid Seats").append('\n');
        }
        
        
        TrainWorkRequest request = new TrainWorkRequest();
        
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setTrain(t);
        
        Enterprise ent=null;
        
        
        
        for (Network network: business.getNetworkList()){
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof PassengerAdminEnterprise){
                    ent = enterprise;
        }
        }
        }
        
        
        Organization org = null;
       // Enterprise ent = (PassengerAdminEnterprise)enterprise;
        
        
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof PassengerOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
        
        
        
        
        
         if (errorMessage.length() == 0) {
            trainDirectory.addTrain(t);
            
			JOptionPane.showMessageDialog(null, "Train Route created succesfully", "Profile Created",JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, errorMessage.toString(), "Validation Failed",JOptionPane.ERROR_MESSAGE);
		}
        reset();
    }//GEN-LAST:event_createjButtonActionPerformed
public void reset(){
    tnamejTextField.setText("");
    trainDestinationjTextField.setText("");
    trainSourcejTextField.setText("");
    costjTextField.setText("");
    seatsjTextField.setText("");
}
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void seatsjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatsjTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cost;
    private javax.swing.JLabel Seats;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField costjTextField;
    private javax.swing.JButton createjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField seatsjTextField;
    private javax.swing.JTextField tnamejTextField;
    private javax.swing.JTextField trainDestinationjTextField;
    private javax.swing.JTextField trainSourcejTextField;
    // End of variables declaration//GEN-END:variables
}
