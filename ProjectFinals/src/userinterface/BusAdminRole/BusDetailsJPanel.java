/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BusAdminRole;

import Business.Bus.Bus;
import Business.Bus.BusDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.BusAdminOrganization;
import Business.UserAccount.UserAccount;
import Business.Validator.Validators1;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anita
 */
public class BusDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BusDetailsJPanel
     */
     private JPanel userProcessContainer;
    private BusAdminOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private BusDirectory busDirectory;
    private Bus bus;
    public BusDetailsJPanel(JPanel userProcessContainer,BusDirectory busDirectory,Bus bus) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
       
        this.busDirectory=busDirectory;
        this.bus=bus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dNamejLabel = new javax.swing.JLabel();
        dNamejTextField = new javax.swing.JTextField();
        createjButton = new javax.swing.JButton();
        BusTypejLabel = new javax.swing.JLabel();
        busTypejTextField = new javax.swing.JTextField();
        nosSeatBusjLabel = new javax.swing.JLabel();
        busSeatjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BSourcejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BDestinationjTextField = new javax.swing.JTextField();
        CostjLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        Cost1jTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("BUS  INFORMATION");

        dNamejLabel.setText("Bus Name:-");

        createjButton.setText("Create");
        createjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButtonActionPerformed(evt);
            }
        });

        BusTypejLabel.setText("Bus Type:-");

        nosSeatBusjLabel.setText("Number of Seat's:-");

        jLabel2.setText("Bus Source:-");

        jLabel3.setText("Bus Destination:-");

        CostjLabel.setText("Cost:-");

        jLabel4.setText("Journey Start Date");

        jLabel5.setText("Journey End Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backjButton1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dNamejLabel)
                            .addComponent(BusTypejLabel)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(busTypejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(nosSeatBusjLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(busSeatjTextField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addComponent(BSourcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(CostjLabel))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BDestinationjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(Cost1jTextField))))))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dNamejLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nosSeatBusjLabel)
                        .addComponent(busSeatjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BusTypejLabel)
                    .addComponent(busTypejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(BSourcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BDestinationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(backjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(createjButton))
                                .addGap(172, 172, 172))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CostjLabel)
                                    .addComponent(Cost1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backjButton1ActionPerformed

    private void createjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButtonActionPerformed
        Bus bus=busDirectory.addBus();
        System.out.println("control is here");
    	
    	StringBuilder errorMessage = new StringBuilder();
    	   
    	if (Validators1.isValidString(dNamejTextField.getText())) {
    		bus.setBusName(dNamejTextField.getText());
    	} else {
    		// error message + new line character
    		errorMessage.append("Please enter valid bus name").append('\n');
    	}
        
        
        if (Validators1.isValidString(BSourcejTextField.getText())) {
    		bus.setBusSource(BSourcejTextField.getText());
    	} else {
    		// error message + new line character
    		errorMessage.append("Please enter valid bus source").append('\n');
    	}
        
        if (Validators1.isValidString(BDestinationjTextField.getText())) {
    		bus.setBusDestination(BDestinationjTextField.getText());
    	} else {
    		// error message + new line character
    		errorMessage.append("Please enter valid Bus Destination").append('\n');
    	}
       
         if (Validators1.isValidString(busSeatjTextField.getText())
				&& Validators1.isValidInteger(busSeatjTextField.getText())) {
			bus.setNosSeat(Integer.parseInt(busSeatjTextField.getText()));
		} else {
    		// error message + new line character
    		errorMessage.append("Please enter valid Bus seat").append('\n');
    	} 
       
         
         
         if (Validators1.isValidString(busTypejTextField.getText())) {
    		bus.setBusType(busTypejTextField.getText());
    	} else {
    		// error message + new line character
    		errorMessage.append("Please enter valid bus Type").append('\n');
    	}
        
         
//        if (Validators1.isValidString(StartTimejSpinner.getText())
//				&& Validators1.isValidInteger(StartTimejSpinner.getText())) {
//			bus.setStartTime(Integer.parseInt(StartTimejSpinner.getText()));
//		} else {
//    		// error message + new line character
//    		errorMessage.append("Please enter valid Bus start time").append('\n');
//    	} 
//       
//        if (Validators1.isValidString(EndTimejSpinner.g)
//				&& Validators1.isValidInteger(EndTimejSpinner.getText())) {
//			bus.setEndTime(Integer.parseInt(EndTimejSpinner.getText()));
//		} else {
//    		// error message + new line character
//    		errorMessage.append("Please enter valid Bus End Time").append('\n');
//    	} 
//       
         if (Validators1.isValidString(Cost1jTextField.getText())
				&& Validators1.isValidInteger(Cost1jTextField.getText())) {
			bus.setCost(Integer.parseInt(Cost1jTextField.getText()));
		} else {
    		// error message + new line character
    		errorMessage.append("Please enter valid Bus cost").append('\n');
    	} 
       
        
             Date enddate=jDateChooser2.getDate();
             bus.setEndDate(enddate);

             Date startDate=jDateChooser1.getDate();
             bus.setStartDate(startDate);
        
       
         
     
        
        
        
        JOptionPane.showMessageDialog(null,"Bus Details added sucessfully","Information",JOptionPane.INFORMATION_MESSAGE);
        reset();
        
        
        
       
    }//GEN-LAST:event_createjButtonActionPerformed

    
    public void reset(){
        BSourcejTextField.setText("");
        BDestinationjTextField.setText("");
        busTypejTextField.setText("");
        busSeatjTextField.setText("");
        Cost1jTextField.setText("");
        dNamejTextField.setText("");
        jDateChooser1.setDateFormatString("");
        jDateChooser2.setDateFormatString("");
//      StartTimejTextField.setText("");
//        EndTimejTextField.setText("");
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BDestinationjTextField;
    private javax.swing.JTextField BSourcejTextField;
    private javax.swing.JLabel BusTypejLabel;
    private javax.swing.JTextField Cost1jTextField;
    private javax.swing.JLabel CostjLabel;
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField busSeatjTextField;
    private javax.swing.JTextField busTypejTextField;
    private javax.swing.JButton createjButton;
    private javax.swing.JLabel dNamejLabel;
    private javax.swing.JTextField dNamejTextField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nosSeatBusjLabel;
    // End of variables declaration//GEN-END:variables
}
