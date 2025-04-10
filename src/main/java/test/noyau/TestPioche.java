package test.noyau;

import noyau.Carte;
import noyau.CarteAttack;
import noyau.Pioche;
import noyau.Effet;

import java.util.ArrayList;
import java.util.List;

public class TestPioche {

    public static void main(String[] args) {
        testPiocheCreation();
        testPiocher();
        testEstVide();
        testPiocherAll();
        testPiocherUntilEmptyAndBeyond();
    }

    public static Pioche createSamplePioche() {
        List<Effet> effets = new ArrayList<>();
        effets.add(new Effet());

        ArrayList<Carte> cartes = new ArrayList<>();
        cartes.add(new CarteAttack("Attaque 1", "Desc 1", effets));
        cartes.add(new CarteAttack("Attaque 2", "Desc 2", effets));
        cartes.add(new CarteAttack("Attaque 3", "Desc 3", effets));
        return new Pioche(cartes);
    }

    public static void testPiocheCreation() {
        Pioche pioche = createSamplePioche();
        if (!pioche.estVide()) {
            System.out.println("testPiocheCreation PASSED");
        } else {
            System.out.println("testPiocheCreation FAILED");
        }
    }

    public static void testPiocher() {
        Pioche pioche = createSamplePioche();
        Carte carte = pioche.piocher();
        if (carte != null && carte.getNom() != null) {
            System.out.println("testPiocher PASSED: " + carte.getNom());
        } else {
            System.out.println("testPiocher FAILED");
        }
    }

    public static void testEstVide() {
        Pioche pioche = new Pioche(new ArrayList<>());
        if (pioche.estVide()) {
            System.out.println("testEstVide PASSED");
        } else {
            System.out.println("testEstVide FAILED");
        }
    }

    public static void testPiocherAll() {
        Pioche pioche = createSamplePioche();
        int count = 0;
        while (!pioche.estVide()) {
            pioche.piocher();
            count++;
        }

        if (count == 3 && pioche.estVide()) {
            System.out.println("testPiocherAll PASSED");
        } else {
            System.out.println("testPiocherAll FAILED (cards drawn: " + count + ")");
        }
    }

    public static void testPiocherUntilEmptyAndBeyond() {
        // Creer une pioche avec une seule carte
        List<Effet> effets = new ArrayList<>();
        effets.add(new Effet());
        ArrayList<Carte> cartes = new ArrayList<>();
        cartes.add(new CarteAttack("Solo Card", "Test", effets));

        Pioche pioche = new Pioche(cartes);

        // Premiere pioche
        Carte first = pioche.piocher();
        if (first != null && !pioche.estVide()) {
            System.out.println("testPiocherUntilEmptyAndBeyond FAILED (should be empty after 1 card)");
            return;
        }

        // Deuxieme pioche ( ne devrait rien retourner)
        try {
            Carte second = pioche.piocher();
            if (second == null) {
                System.out.println("testPiocherUntilEmptyAndBeyond PASSED (null returned safely)");
            } else {
                System.out.println("testPiocherUntilEmptyAndBeyond FAILED (unexpected card)");
            }
        } catch (IllegalStateException e) {
            System.out.println("testPiocherUntilEmptyAndBeyond PASSED (exception as expected)");
        } catch (Exception e) {
            System.out.println("testPiocherUntilEmptyAndBeyond FAILED (unexpected exception)");
        }
    }

}
