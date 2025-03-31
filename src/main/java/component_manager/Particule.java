/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component_manager;

import java.awt.Color;

public class Particule {
    public int x, y;
    public float alpha = 1.0f; // opacité
    public Color couleur;

    public Particule(int x, int y, Color couleur) {
        this.x = x;
        this.y = y;
        this.couleur = couleur;
    }

    public void update() {
        y -= 1; // Monte un peu
        alpha -= 0.05f; // Disparaît progressivement
    }

    public boolean estMorte() {
        return alpha <= 0;
    }
}

