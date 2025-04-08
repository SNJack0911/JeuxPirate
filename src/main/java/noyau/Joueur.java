package noyau;

import java.util.*;

public class Joueur {
    private int HP;
    private int PP;
    private String nom;
    private final List<Carte> hands = new ArrayList<>() ;
    public Joueur(int HP, int PP, String nom) {
        this.HP = HP;
        this.PP = PP;
        this.nom = nom;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP += HP;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP += PP;
    }

    public boolean applyStats(String stats, int value) {
        return switch (stats) {
            case "HP" -> {
                this.HP += value;
                yield true;
            }
            case "PP" -> {
                this.PP += value;
                yield true;
            }
            default -> false;
        };
    }
    public void playCarte(Carte carte) {
        if (hands.contains(carte)) {
            hands.remove(carte);
            carte.appliqueEffet();
        } else {
            throw new IllegalArgumentException("Carte non trouvée dans la main du joueur");
        }
    }
    public void addCarte(Carte carte) {
        hands.add(carte);
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "HP=" + HP +
                ", PP=" + PP +
                ", nom='" + nom + '\'' +
                '}';
    }
}
