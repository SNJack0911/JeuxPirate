package ilu4.projet_pirate;
import Vue.Vue;
import javax.swing.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author choue
 */
public class Projet_Pirate {

private static Vue fenetre;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            // Création de la fenêtre principale
            fenetre = new Vue();
            fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Afficher la fenêtre
            fenetre.setVisible(true);
        });
    }
}
    
    