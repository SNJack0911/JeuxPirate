package components;

import component_manager.Particule;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;


public class ParticulePanel extends javax.swing.JPanel {

    private final List<Particule> particules = new ArrayList<>();

    public void spawnParticules() {
        for (int i = 0; i < 6; i++) {
            particules.add(new Particule(getX() + getWidth()/2, getY() + getHeight()/2, new Color(255, 150, 0)));
        }

        Timer timer = new Timer(30, e -> {
            particules.forEach(Particule::update);
            particules.removeIf(Particule::estMorte);
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Particule p : particules) {
            g2.setColor(new Color(p.couleur.getRed(), p.couleur.getGreen(), p.couleur.getBlue(), (int)(p.alpha * 255)));
            g2.fillOval(p.x - getX(), p.y - getY(), 4, 4);
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
