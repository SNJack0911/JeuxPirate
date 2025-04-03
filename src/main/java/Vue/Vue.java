package Vue;

import component_manager.CarteStructurel;
import component_manager.CategorieCarte;
import component_manager.GestionnaireCartes;
import component_manager.GestionnaireEffets;
import components.Carte_Ihm;
import components.Point_de_vie;
import components.Zone_d_interaction;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Vue extends javax.swing.JFrame {

    private Zone_d_interaction zoneInteraction = null;
    private Carte_Ihm carte ; 
    private GestionnaireCartes gestionnaire = new GestionnaireCartes();
    //private GestionnaireEffets effets = new GestionnaireEffets();

    public Vue() {
        
        initComponents();
        zoneInteraction = zone_d_interaction1;
        carte = carte_4; //pour vérif les zones
	setNbViesRestantes(4);
        imageEnnemie.setImage("/les_pngBlackSmoke/blackSmoke00.png");
        gestionnaire.ajouterCarte(carte_1);

// Ajouter la carte graphique à un composant parent, etc.

        //gestionnaire.affecterEffetTrainée(carte_1);
        gestionnaire.ajouterCarte(carte_2);
        //gestionnaire.affecterEffetTrainée(carte_2);
        gestionnaire.ajouterCarte(carte_3);
        //gestionnaire.affecterEffetTrainée(carte_3);
        gestionnaire.ajouterCarte(carte_4);
        //gestionnaire.affecterEffetTrainée(carte_4);
        gestionnaire.ajouterZone(zone_d_interaction1);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        //Tentative de coloration échoué de background
        //GradientPaint gp = new GradientPaint(0, 0, new Color(60, 30, 10),0, getHeight(), new Color(20, 10, 5));
        //g2.setPaint(gp);
        //g2.fillRect(0, 0, getWidth(), getHeight());
    }

    public GestionnaireCartes getGestionnaire() {
            return gestionnaire;
        }

    public void verifierZoneInteraction(Rectangle boundsCarte) {
	zone_d_interaction1.verifierCarte(carte);
        Rectangle boundsZone = zoneInteraction.getBounds();
        if (boundsZone.intersects(boundsCarte)) {
            //JOptionPane.showMessageDialog(this, "Carte déposée dans la zone !");    // debuggage
        }
    }

    public void setNbViesRestantes(int n) {
        Component[] composants = JaugePoint_de_vie.getComponents();
        for (int i = 0; i < composants.length; i++) {
            if (composants[i] instanceof Point_de_vie coeur) {
                coeur.setEtat(i < n); // les premiers pleins, le reste vides
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        carte_6 = new components.Carte_Ihm();
        jPanel2 = new javax.swing.JPanel();
        ZonePopularitéJoueur1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        carte_1 = new components.Carte_Ihm();
        carte_2 = new components.Carte_Ihm();
        carte_3 = new components.Carte_Ihm();
        carte_4 = new components.Carte_Ihm();
        JaugePoint_de_vie = new javax.swing.JPanel();
        point_de_vie7 = new components.Point_de_vie();
        point_de_vie5 = new components.Point_de_vie();
        point_de_vie3 = new components.Point_de_vie();
        point_de_vie8 = new components.Point_de_vie();
        point_de_vie9 = new components.Point_de_vie();
        JaugePopularité = new javax.swing.JPanel();
        Main_Joueur = new javax.swing.JPanel();
        carte_5 = new components.Carte_Ihm();
        JaugePopularité1 = new javax.swing.JPanel();
        zone_d_interaction1 = new components.Zone_d_interaction();
        jPanel5 = new javax.swing.JPanel();
        JaugePoint_de_vie2 = new javax.swing.JPanel();
        point_de_vie10 = new components.Point_de_vie();
        point_de_vie6 = new components.Point_de_vie();
        point_de_vie4 = new components.Point_de_vie();
        point_de_vie11 = new components.Point_de_vie();
        point_de_vie12 = new components.Point_de_vie();
        jPanel3 = new javax.swing.JPanel();
        imageEnnemie = new components.ImagePanel();
        imagePanel1 = new components.ImagePanel();

        setMinimumSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Zone de Popularité");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        javax.swing.GroupLayout carte_6Layout = new javax.swing.GroupLayout(carte_6);
        carte_6.setLayout(carte_6Layout);
        carte_6Layout.setHorizontalGroup(
            carte_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        carte_6Layout.setVerticalGroup(
            carte_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        jPanel1.add(carte_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(230, 0, 290, 160);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(450, 210, 110, 140);

        ZonePopularitéJoueur1.setBackground(new java.awt.Color(153, 153, 153));
        ZonePopularitéJoueur1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ZonePopularitéJoueur1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Zone de Popularité");
        ZonePopularitéJoueur1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 6, -1, -1));

        javax.swing.GroupLayout carte_1Layout = new javax.swing.GroupLayout(carte_1);
        carte_1.setLayout(carte_1Layout);
        carte_1Layout.setHorizontalGroup(
            carte_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        carte_1Layout.setVerticalGroup(
            carte_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        ZonePopularitéJoueur1.add(carte_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 120));

        javax.swing.GroupLayout carte_2Layout = new javax.swing.GroupLayout(carte_2);
        carte_2.setLayout(carte_2Layout);
        carte_2Layout.setHorizontalGroup(
            carte_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        carte_2Layout.setVerticalGroup(
            carte_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        ZonePopularitéJoueur1.add(carte_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 120));

        javax.swing.GroupLayout carte_3Layout = new javax.swing.GroupLayout(carte_3);
        carte_3.setLayout(carte_3Layout);
        carte_3Layout.setHorizontalGroup(
            carte_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        carte_3Layout.setVerticalGroup(
            carte_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        ZonePopularitéJoueur1.add(carte_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 90, 120));

        javax.swing.GroupLayout carte_4Layout = new javax.swing.GroupLayout(carte_4);
        carte_4.setLayout(carte_4Layout);
        carte_4Layout.setHorizontalGroup(
            carte_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        carte_4Layout.setVerticalGroup(
            carte_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        ZonePopularitéJoueur1.add(carte_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 90, 120));

        getContentPane().add(ZonePopularitéJoueur1);
        ZonePopularitéJoueur1.setBounds(30, 210, 420, 140);

        JaugePoint_de_vie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout point_de_vie7Layout = new javax.swing.GroupLayout(point_de_vie7);
        point_de_vie7.setLayout(point_de_vie7Layout);
        point_de_vie7Layout.setHorizontalGroup(
            point_de_vie7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        point_de_vie7Layout.setVerticalGroup(
            point_de_vie7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        JaugePoint_de_vie.add(point_de_vie7);

        javax.swing.GroupLayout point_de_vie5Layout = new javax.swing.GroupLayout(point_de_vie5);
        point_de_vie5.setLayout(point_de_vie5Layout);
        point_de_vie5Layout.setHorizontalGroup(
            point_de_vie5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        point_de_vie5Layout.setVerticalGroup(
            point_de_vie5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        JaugePoint_de_vie.add(point_de_vie5);

        javax.swing.GroupLayout point_de_vie3Layout = new javax.swing.GroupLayout(point_de_vie3);
        point_de_vie3.setLayout(point_de_vie3Layout);
        point_de_vie3Layout.setHorizontalGroup(
            point_de_vie3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        point_de_vie3Layout.setVerticalGroup(
            point_de_vie3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        JaugePoint_de_vie.add(point_de_vie3);

        javax.swing.GroupLayout point_de_vie8Layout = new javax.swing.GroupLayout(point_de_vie8);
        point_de_vie8.setLayout(point_de_vie8Layout);
        point_de_vie8Layout.setHorizontalGroup(
            point_de_vie8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        point_de_vie8Layout.setVerticalGroup(
            point_de_vie8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        JaugePoint_de_vie.add(point_de_vie8);

        javax.swing.GroupLayout point_de_vie9Layout = new javax.swing.GroupLayout(point_de_vie9);
        point_de_vie9.setLayout(point_de_vie9Layout);
        point_de_vie9Layout.setHorizontalGroup(
            point_de_vie9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        point_de_vie9Layout.setVerticalGroup(
            point_de_vie9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        JaugePoint_de_vie.add(point_de_vie9);

        getContentPane().add(JaugePoint_de_vie);
        JaugePoint_de_vie.setBounds(0, 160, 150, 40);

        JaugePopularité.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(JaugePopularité);
        JaugePopularité.setBounds(570, 350, 30, 180);

        Main_Joueur.setBackground(new java.awt.Color(204, 255, 204));
        Main_Joueur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout carte_5Layout = new javax.swing.GroupLayout(carte_5);
        carte_5.setLayout(carte_5Layout);
        carte_5Layout.setHorizontalGroup(
            carte_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );
        carte_5Layout.setVerticalGroup(
            carte_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        Main_Joueur.add(carte_5);

        getContentPane().add(Main_Joueur);
        Main_Joueur.setBounds(30, 350, 440, 180);

        JaugePopularité1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(JaugePopularité1);
        JaugePopularité1.setBounds(130, 0, 30, 160);

        javax.swing.GroupLayout zone_d_interaction1Layout = new javax.swing.GroupLayout(zone_d_interaction1);
        zone_d_interaction1.setLayout(zone_d_interaction1Layout);
        zone_d_interaction1Layout.setHorizontalGroup(
            zone_d_interaction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        zone_d_interaction1Layout.setVerticalGroup(
            zone_d_interaction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(zone_d_interaction1);
        zone_d_interaction1.setBounds(590, 190, 80, 80);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(470, 350, 100, 180);

        JaugePoint_de_vie2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout point_de_vie10Layout = new javax.swing.GroupLayout(point_de_vie10);
        point_de_vie10.setLayout(point_de_vie10Layout);
        point_de_vie10Layout.setHorizontalGroup(
            point_de_vie10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        point_de_vie10Layout.setVerticalGroup(
            point_de_vie10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        JaugePoint_de_vie2.add(point_de_vie10);

        javax.swing.GroupLayout point_de_vie6Layout = new javax.swing.GroupLayout(point_de_vie6);
        point_de_vie6.setLayout(point_de_vie6Layout);
        point_de_vie6Layout.setHorizontalGroup(
            point_de_vie6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        point_de_vie6Layout.setVerticalGroup(
            point_de_vie6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        JaugePoint_de_vie2.add(point_de_vie6);

        javax.swing.GroupLayout point_de_vie4Layout = new javax.swing.GroupLayout(point_de_vie4);
        point_de_vie4.setLayout(point_de_vie4Layout);
        point_de_vie4Layout.setHorizontalGroup(
            point_de_vie4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        point_de_vie4Layout.setVerticalGroup(
            point_de_vie4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        JaugePoint_de_vie2.add(point_de_vie4);

        javax.swing.GroupLayout point_de_vie11Layout = new javax.swing.GroupLayout(point_de_vie11);
        point_de_vie11.setLayout(point_de_vie11Layout);
        point_de_vie11Layout.setHorizontalGroup(
            point_de_vie11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        point_de_vie11Layout.setVerticalGroup(
            point_de_vie11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        JaugePoint_de_vie2.add(point_de_vie11);

        javax.swing.GroupLayout point_de_vie12Layout = new javax.swing.GroupLayout(point_de_vie12);
        point_de_vie12.setLayout(point_de_vie12Layout);
        point_de_vie12Layout.setHorizontalGroup(
            point_de_vie12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        point_de_vie12Layout.setVerticalGroup(
            point_de_vie12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        JaugePoint_de_vie2.add(point_de_vie12);

        getContentPane().add(JaugePoint_de_vie2);
        JaugePoint_de_vie2.setBounds(570, 310, 152, 36);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(520, 0, 120, 160);

        javax.swing.GroupLayout imageEnnemieLayout = new javax.swing.GroupLayout(imageEnnemie);
        imageEnnemie.setLayout(imageEnnemieLayout);
        imageEnnemieLayout.setHorizontalGroup(
            imageEnnemieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        imageEnnemieLayout.setVerticalGroup(
            imageEnnemieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        getContentPane().add(imageEnnemie);
        imageEnnemie.setBounds(0, 0, 130, 160);

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(imagePanel1);
        imagePanel1.setBounds(600, 350, 100, 100);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JaugePoint_de_vie;
    private javax.swing.JPanel JaugePoint_de_vie2;
    private javax.swing.JPanel JaugePopularité;
    private javax.swing.JPanel JaugePopularité1;
    private javax.swing.JPanel Main_Joueur;
    private javax.swing.JPanel ZonePopularitéJoueur1;
    private components.Carte_Ihm carte_1;
    private components.Carte_Ihm carte_2;
    private components.Carte_Ihm carte_3;
    private components.Carte_Ihm carte_4;
    private components.Carte_Ihm carte_5;
    private components.Carte_Ihm carte_6;
    private components.ImagePanel imageEnnemie;
    private components.ImagePanel imagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private components.Point_de_vie point_de_vie10;
    private components.Point_de_vie point_de_vie11;
    private components.Point_de_vie point_de_vie12;
    private components.Point_de_vie point_de_vie3;
    private components.Point_de_vie point_de_vie4;
    private components.Point_de_vie point_de_vie5;
    private components.Point_de_vie point_de_vie6;
    private components.Point_de_vie point_de_vie7;
    private components.Point_de_vie point_de_vie8;
    private components.Point_de_vie point_de_vie9;
    private components.Zone_d_interaction zone_d_interaction1;
    // End of variables declaration//GEN-END:variables

}

