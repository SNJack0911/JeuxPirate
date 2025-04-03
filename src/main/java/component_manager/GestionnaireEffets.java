/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component_manager;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;

public class GestionnaireEffets extends JComponent { // Jcomponent pour repaint
    private final ArrayList<Fumee> fumeeList = new ArrayList<>();

    private static class Fumee {
        BufferedImage image;
        Point position;
        float alpha = 1.0f;

        public Fumee(BufferedImage img, Point pos) {
            this.image = img;
            this.position = pos;
        }
    }

    private final Timer animationTimer;

    public GestionnaireEffets() {
        animationTimer = new Timer(50, e -> {
            Iterator<Fumee> it = fumeeList.iterator();
            while (it.hasNext()) {
                Fumee f = it.next();
                f.alpha -= 0.05f;
                if (f.alpha <= 0) it.remove();
            }
            repaint();
        });
        animationTimer.setRepeats(true);
        animationTimer.start();
    }

    public void ajouterFumee(BufferedImage img, Point pos) {
        fumeeList.add(new Fumee(img, pos));
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (Fumee f : fumeeList) {
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, f.alpha));
            g2.drawImage(f.image, f.position.x, f.position.y, null);
        }
    }
}
