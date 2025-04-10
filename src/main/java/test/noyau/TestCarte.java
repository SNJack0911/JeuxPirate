package test.noyau;

import noyau.Carte;
import noyau.Effet;
import util.CarteCSV;

import java.io.InputStream;
import java.util.List;

public class TestCarte {

    public static void main(String[] args) {
        testCarteCreation();
        testAppliqueEffet();
        testChargementDepuisCSV();
    }

    // Test Carte creation
    public static void testCarteCreation() {
        Effet effet = new Effet();
        Carte carte = new noyau.CarteAttack("BoostCard", "Boost the HP of a pirate", List.of(effet));

        if (carte.getNom().equals("BoostCard") && carte.getDescription().equals("Boost the HP of a pirate")) {
            System.out.println("testCarteCreation PASSED");
        } else {
            System.out.println("testCarteCreation FAILED");
        }
    }

    // Test appliqueEffet
    public static void testAppliqueEffet() {
        //TODO
    }

    // Test chargement depuis CSV
    public static void testChargementDepuisCSV() {
        InputStream is = CarteCSV.class.getClassLoader().getResourceAsStream("cartes.csv");
        if (is == null) {
            System.out.println("testChargementDepuisCSV ERROR: cartes.csv not found in resources");
            return;
        }
        List<Carte> cartes = CarteCSV.lireCartesDepuisCSV(is);
        if (cartes != null && !cartes.isEmpty()) {
            System.out.println("testChargementDepuisCSV PASSED");
            for (Carte carte : cartes) {
                System.out.println("Carte: " + carte.getNom() + ", Description: " + carte.getDescription());
            }
        } else {
            System.out.println("testChargementDepuisCSV FAILED");
        }
    }
}
