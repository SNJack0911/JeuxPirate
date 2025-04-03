package components;

import Vue.Vue;
import component_manager.CarteStructurel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Carte_Ihm extends javax.swing.JPanel {

    private Point origine = null;
    private boolean isSelected = false;
    
//    private Carte carteLogique;
 /*   
    private static BufferedImage[] fumeeImages = new BufferedImage[5];
    private GestionnaireEffets effets;
    private Timer fumeeTimer;
    private int fumeeIndex = 0; // Pour alterner les images

    static {
        try {
            for (int i = 0; i < 5; i++) {
                fumeeImages[i] = ImageIO.read(new File("resources/smoke" + i + ".png"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
    public Carte_Ihm() {
        //carteLogique = carte;
        //this.effets = effets;
        initComponents();
        setOpaque(false);
        setSize(75, 110); // dimensions extérieures
	setMaximumSize(new Dimension(91, 124));
	setPreferredSize(new Dimension(91, 124));
        //setMaximumSize(new Dimension(136, 190));
	//setPreferredSize(new Dimension(136, 190));

    }
/*    public Carte getCarteLogique() {
        return carteLogique;
    }
*/
    // Méthode pour obtenir le centre de la carte
    public Point getCentreCarte() {
        return new Point(getX() + getWidth() / 2, getY() + getHeight() / 2);
    }
  
   @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;//.create(); // On clone le contexte graphique
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Active le lissage des bords

        // VARIABLE ----------------
        int largeur = getWidth();
        int hauteur = getHeight();
        int marge = 5; // padding
        int arrondiExterieur = 40;
        int arrondiInterieur = 20;

        // Effet visuel jaune : entre les deux contours
        if (isSelected) {
            g2.setColor(Color.YELLOW);
            g2.fillRoundRect(0, 0,  85, 120, arrondiExterieur, arrondiExterieur);

            // Creuse l’intérieur pour recréer l’espace entre les cadres
            g2.setColor(getBackground());
            g2.fillRoundRect(marge, marge, 75, 110, arrondiInterieur, arrondiInterieur);
        }

        // Encadrement extérieur vert foncé
        g2.setColor(Color.GREEN.darker());
        g2.setStroke(new BasicStroke(2));
        g2.drawRoundRect(0, 0, 85, 120, arrondiExterieur, arrondiExterieur);

        // Encadrement intérieur
        g2.drawRoundRect(marge, marge, 75, 110, arrondiInterieur, arrondiInterieur);

        //g2.dispose(); // Libère les ressources graphiques (important avec g.create())
    }

    /*
   //c'était un test raté
    public void laisserTrainée() {
        JLabel copie = new JLabel();
        copie.setBounds(getBounds());
        copie.setOpaque(false);
        copie.setBackground(new Color(255, 255, 0, 60)); // Jaune très léger
        copie.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 2));

        Container root = getParent();
        root.add(copie);
        root.setComponentZOrder(copie, 0);
        root.repaint();

        // Suppression après 300ms
        new Timer(300, e -> {
            root.remove(copie);
            root.repaint();
        }).start();
    }
 */   

public void deplacerVers(int xFinal, int yFinal) {
    Timer timer = new Timer(10, null);
    timer.addActionListener(e -> {
        int x = getX();
        int y = getY();
        int dx = (xFinal - x) / 5;
        int dy = (yFinal - y) / 5;

        if (Math.abs(xFinal - x) < 2 && Math.abs(yFinal - y) < 2) {
            setLocation(xFinal, yFinal);
            timer.stop();
        } else {
            setLocation(x + dx, y + dy);
        }
    });
    timer.start();
}


    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(78, 113));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        if (origine != null) {
        int thisX = this.getLocation().x;
        int thisY = this.getLocation().y;

        int xMoved = evt.getX() - origine.x;
        int yMoved = evt.getY() - origine.y;

        int X = thisX + xMoved;
        int Y = thisY + yMoved;

        this.setLocation(X, Y);
        this.repaint();
        // regle affichage des élements en dessous de la carte
        for (Component comp : getParent().getComponents()) {
            if (comp instanceof Carte_Ihm && comp != this) {
                comp.repaint(); // Force les autres cartes à se redessiner si touchées
            }
        }
        /*
	if (fumeeImages.length > 0) {
            int index = (int) (Math.random() * fumeeImages.length);
            Point position = new Point(getX() + getWidth() / 2, getY() + getHeight() / 2);
            effets.ajouterFumee(fumeeImages[index], position);
        }
        */
    }
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        origine = null;
	this.isSelected = false;
        repaint();
        /*
            // Arrêter le timer de fumée
        if (fumeeTimer != null) {
            fumeeTimer.stop();
            fumeeTimer = null;
        }
        */
        Container root = SwingUtilities.getWindowAncestor(this);
        if (root instanceof Vue vue) {
             vue.getGestionnaire().verifierToutesZones(this); // C’est bien la méthode du gestionnaire
        }
//        particule.spawnParticules();
	//setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_formMouseReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.origine = evt.getPoint();
	this.isSelected = true;
        repaint();
        /*
            // Lancer un timer qui ajoute des fumées toutes les 200ms
        if (fumeeTimer == null) {
            fumeeTimer = new Timer(200, e -> {
                if (fumeeImages.length > 0) {
                    fumeeIndex = (fumeeIndex + 1) % fumeeImages.length;
                    int offsetX = (int) (Math.random() * 20 - 10); // Variation aléatoire
                    int offsetY = (int) (Math.random() * 20 - 10);
                    Point position = new Point(getX() + getWidth() / 2 + offsetX, getY() + getHeight() / 2 + offsetY);
                    effets.ajouterFumee(fumeeImages[fumeeIndex], position);
                }
            });
            fumeeTimer.start();
        }
*/
        // Met la carte tout en haut pour pas qu’elle passe sous les autres
        SwingUtilities.getWindowAncestor(this).setComponentZOrder(this, 0);
        //laisserTrainée();
	//setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

//try {
//    AudioInputStream audioIn = AudioSystem.getAudioInputStream(new //File("son.wav"));
//    Clip clip = AudioSystem.getClip();
//    clip.open(audioIn);
//    clip.start();
//} catch (Exception ex) {
//    ex.printStackTrace();
//}

}
