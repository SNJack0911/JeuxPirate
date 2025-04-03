/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import component_manager.GestionnaireCartes;

/**
 *
 * @author choue
 */
public class VueJeu extends javax.swing.JPanel {
    private Zone_d_interaction zoneInteraction = null;
    private Carte_Ihm carte ; 
    private GestionnaireCartes gestionnaire = new GestionnaireCartes();
    
    /**
     * Creates new form VueJeu
     */
    public VueJeu() {
        initComponents();
        zoneInteraction = zone_d_interaction1;
        zoneInteraction = zone_d_interaction2;
        zoneInteraction = zone_d_interaction3;
        zoneInteraction = zone_d_interaction4;
        zoneInteraction = zone_d_interaction5;
        zoneInteraction = zone_d_interaction6;
        zoneInteraction = zone_d_interaction7;
        
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagePersonnage1 = new components.ImagePanel();
        jPanel1 = new javax.swing.JPanel();
        zone_d_interaction2 = new components.Zone_d_interaction();
        zone_d_interaction3 = new components.Zone_d_interaction();
        zone_d_interaction7 = new components.Zone_d_interaction();
        zone_d_interaction1 = new components.Zone_d_interaction();
        zone_d_interaction4 = new components.Zone_d_interaction();
        zone_d_interaction5 = new components.Zone_d_interaction();
        ImagePersonnage2 = new components.ImagePanel();
        zone_d_interaction6 = new components.Zone_d_interaction();

        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(480, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagePersonnage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(ImagePersonnage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 130, 140));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        zone_d_interaction2.setBackground(new java.awt.Color(153, 153, 255));
        zone_d_interaction2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(zone_d_interaction2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 200));

        zone_d_interaction3.setBackground(new java.awt.Color(153, 153, 255));
        zone_d_interaction3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(zone_d_interaction3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 140, 200));

        zone_d_interaction7.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout zone_d_interaction7Layout = new javax.swing.GroupLayout(zone_d_interaction7);
        zone_d_interaction7.setLayout(zone_d_interaction7Layout);
        zone_d_interaction7Layout.setHorizontalGroup(
            zone_d_interaction7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        zone_d_interaction7Layout.setVerticalGroup(
            zone_d_interaction7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(zone_d_interaction7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 440, 200));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 720, 200));

        zone_d_interaction1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        zone_d_interaction1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(zone_d_interaction1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 460, 140));

        zone_d_interaction4.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout zone_d_interaction4Layout = new javax.swing.GroupLayout(zone_d_interaction4);
        zone_d_interaction4.setLayout(zone_d_interaction4Layout);
        zone_d_interaction4Layout.setHorizontalGroup(
            zone_d_interaction4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        zone_d_interaction4Layout.setVerticalGroup(
            zone_d_interaction4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        add(zone_d_interaction4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 130, 140));

        zone_d_interaction5.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout zone_d_interaction5Layout = new javax.swing.GroupLayout(zone_d_interaction5);
        zone_d_interaction5.setLayout(zone_d_interaction5Layout);
        zone_d_interaction5Layout.setHorizontalGroup(
            zone_d_interaction5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        zone_d_interaction5Layout.setVerticalGroup(
            zone_d_interaction5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        add(zone_d_interaction5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 130, 140));

        ImagePersonnage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(ImagePersonnage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 140));

        javax.swing.GroupLayout zone_d_interaction6Layout = new javax.swing.GroupLayout(zone_d_interaction6);
        zone_d_interaction6.setLayout(zone_d_interaction6Layout);
        zone_d_interaction6Layout.setHorizontalGroup(
            zone_d_interaction6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        zone_d_interaction6Layout.setVerticalGroup(
            zone_d_interaction6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        add(zone_d_interaction6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 460, 140));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ImagePanel ImagePersonnage1;
    private components.ImagePanel ImagePersonnage2;
    private javax.swing.JPanel jPanel1;
    private components.Zone_d_interaction zone_d_interaction1;
    private components.Zone_d_interaction zone_d_interaction2;
    private components.Zone_d_interaction zone_d_interaction3;
    private components.Zone_d_interaction zone_d_interaction4;
    private components.Zone_d_interaction zone_d_interaction5;
    private components.Zone_d_interaction zone_d_interaction6;
    private components.Zone_d_interaction zone_d_interaction7;
    // End of variables declaration//GEN-END:variables
}
