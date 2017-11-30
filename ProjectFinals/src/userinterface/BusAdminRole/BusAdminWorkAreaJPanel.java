/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BusAdminRole;

import Business.Bus.Bus;
import Business.Bus.BusDirectory;
import Business.BusDriver.BusDriverDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BusAdminOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author anita
 */
public class BusAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BusAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private BusAdminOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private BusDriverDirectory busDriverDirectory;
    private BusDirectory busDirectory;
    private Bus bus;
    private EcoSystem business;
    public BusAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,BusAdminOrganization organization, Enterprise enterprise,BusDirectory busDirectory,BusDriverDirectory busDriverDirectory,Bus bus,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.busDirectory=busDirectory;
        this.busDriverDirectory=busDriverDirectory;
        this.bus=bus;
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
        manageBusJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Aminstrative Role");

        manageBusJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageBusJButton.setText("Manage Buses");
        manageBusJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBusJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(manageBusJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(43, 43, 43)
                .addComponent(manageBusJButton)
                .addContainerGap(222, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageBusJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBusJButtonActionPerformed

        ViewBusJPanel vbjp = new ViewBusJPanel(userProcessContainer,userAccount,enterprise,busDirectory,bus,business);
        userProcessContainer.add("bussaddJPanel",vbjp );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageBusJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageBusJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}