/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PassengerRole;

import Business.Passenger.Passenger;
import Business.Passenger.PassengerDirectory;
import Business.Validator.Validators1;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anita
 */
public class PassDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PassDetailsJPanel
     */
    private JPanel userProcessContainer;
    private PassengerDirectory passengerDirectory;
    private Passenger passenger;
    public PassDetailsJPanel(JPanel userProcessContainer,PassengerDirectory passengerDirectory,Passenger passenger) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.passengerDirectory=passengerDirectory;
        this.passenger=passenger;
        
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
        NamejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        phNosjTextField = new javax.swing.JTextField();
        CreatejButton = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Name");

        jLabel2.setText("Phone Number");

        CreatejButton.setText("Create");
        CreatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatejButtonActionPerformed(evt);
            }
        });

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
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(backjButton1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreatejButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(phNosjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addComponent(NamejTextField)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phNosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreatejButton)
                    .addComponent(backjButton1))
                .addContainerGap(137, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatejButtonActionPerformed
       
        System.out.println("control is here");
    	
    	StringBuilder errorMessage = new StringBuilder();
    	   
    	if (Validators1.isValidString(NamejTextField.getText())) {
    		passenger.setpName(NamejTextField.getText());
    	} else {
    		// error message + new line character
    		errorMessage.append("Please enter valid first name").append('\n');
    	}
    	
        if (Validators1.isValidString(phNosjTextField.getText())
				&& Validators1.isValidInteger(phNosjTextField.getText()) && Validators1.isValidPhoneNumber(phNosjTextField.getText())) {
                passenger.setPhoneNos(Integer.parseInt(phNosjTextField.getText()));
                
                } else {
    		// error message + new line character
    		errorMessage.append("Please enter valid 10 digits Phone Number").append('\n');
        }
        
   
         
         
         
		if (errorMessage.length() == 0) {
			JOptionPane.showMessageDialog(null, "Profile created succesfully", "Profile Created",JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, errorMessage.toString(), "Validation Failed",JOptionPane.ERROR_MESSAGE);
		}
 
 
        
        
         
        
    }//GEN-LAST:event_CreatejButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreatejButton;
    private javax.swing.JTextField NamejTextField;
    private javax.swing.JButton backjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField phNosjTextField;
    // End of variables declaration//GEN-END:variables
}
