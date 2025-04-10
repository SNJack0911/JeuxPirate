package test.noyau;
import noyau.CartePopularite;
import noyau.Pirate;
import noyau.Carte;

public class TestPirate {

    public static void main(String[] args) {
        testAddHP();
        testAddPP();
        testApplyStats();
        testSupprimerCarteMain();
    }

    // Test for adding HP
    public static void testAddHP() {
        Pirate p = new Pirate("Jack Sparrow");
        p.addHP(3); // HP should become 5
        if (p.getHP() == 5) {
            System.out.println("testAddHP PASSED");
        } else {
            System.out.println("testAddHP FAILED");
        }

        p.addHP(-10); // HP should become 0 (cannot be less than 0)
        if (p.getHP() == 0) {
            System.out.println("testAddHP PASSED");
        } else {
            System.out.println("testAddHP FAILED");
        }
    }

    // Test for adding PP
    public static void testAddPP() {
        Pirate p = new Pirate("Jack Sparrow");
        p.addPP(3); // PP should become 3
        if (p.getPP() == 3) {
            System.out.println("testAddPP PASSED");
        } else {
            System.out.println("testAddPP FAILED");
        }

        p.addPP(-5); // PP should become 0 (cannot be less than 0)
        if (p.getPP() == 0) {
            System.out.println("testAddPP PASSED");
        } else {
            System.out.println("testAddPP FAILED");
        }
    }

    // Test for applyStats method
    public static void testApplyStats() {
        Pirate p = new Pirate("Jack Sparrow");
        boolean resultHP = p.applyStats("HP", -3); // Should reduce HP
        boolean resultPP = p.applyStats("PP", 3); // Should add PP

        if (resultHP && p.getHP() == 2 && resultPP && p.getPP() == 3) {
            System.out.println("testApplyStats PASSED");
        } else {
            System.out.println("testApplyStats FAILED");
        }

        boolean invalidStat = p.applyStats("InvalidStat", 5);
        if (!invalidStat) {
            System.out.println("testApplyStats PASSED (invalid stat correctly handled)");
        } else {
            System.out.println("testApplyStats FAILED (invalid stat not handled)");
        }
    }

    // Test for supprimerCarteMain
    public static void testSupprimerCarteMain() {
        Pirate p = new Pirate("Jack Sparrow");
        Carte carte = new CartePopularite();
        p.addCarte(carte);

        try {
            p.supprimerCarteMain(carte);
            if (p.getNbCarte() == 0) {
                System.out.println("testSupprimerCarteMain PASSED");
            } else {
                System.out.println("testSupprimerCarteMain FAILED");
            }
        } catch (Exception e) {
            System.out.println("testSupprimerCarteMain FAILED (exception thrown)");
        }

        // Test removing a non-existing card
        try {
            p.supprimerCarteMain(carte);
            System.out.println("testSupprimerCarteMain FAILED (non-existent card removed)");
        } catch (IllegalArgumentException e) {
            System.out.println("testSupprimerCarteMain PASSED (correct exception thrown)");
        }
    }
}
