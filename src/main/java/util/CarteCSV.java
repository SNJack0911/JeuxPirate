package util;

import noyau.Carte;
import noyau.CarteAttack;
import noyau.CartePopularite;
import noyau.Effet;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CarteCSV {

    public static List<Carte> lireCartesDepuisCSV(InputStream is) {
        List<Carte> cartes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = reader.readLine()) != null) {
                List<String> parts = parseCSVLine(line);
                if (parts.size() < 3) continue;

                String nom = parts.get(0);
                String description = parts.get(1);
                String type = parts.get(2);

                Effet effet = new Effet();
                List<Effet> effets = new ArrayList<>();
                effets.add(effet);

                Carte carte;
                switch (type) {
                    case "Attaque":
                        carte = new CarteAttack(nom, description, effets);
                        break;
                    case "Defense":
                        //carte = new CarteDefense(nom, description, effets);
                        System.out.println("Type non pris en charge : " + type);
                        carte = new CarteAttack(nom, description, effets);
                        break;
                    case "Effet":
                        //carte = new CarteEffet(nom, description, effets);
                        System.out.println("Type non pris en charge : " + type);
                        carte = new CarteAttack(nom, description, effets);
                        break;
                    case "Popularité":
                        //carte = new CartePopularite(nom, description, effets);
                        carte = new CartePopularite();
                        System.out.println("Type non pris en charge : " + type);
                        break;
                    case "Popularité + Effet":
                        //carte = new CartePopularite(nom, description, effets);
                        System.out.println("Type non pris en charge : " + type);
                        carte = new CartePopularite();
                        break;
                    default:
                        System.out.println("Type inconnu : " + type);
                        continue;
                }

                cartes.add(carte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cartes;
    }

    public static void ecrireCartesDansCSV(String chemin, List<Carte> cartes) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(chemin))) {
            writer.write("Nom,Effet,Type");
            writer.newLine();

            for (Carte carte : cartes) {
                String type = getTypeFromCarte(carte);

                writer.write(String.format("%s,%s,%s",
                        carte.getNom(),
                        carte.getDescription().replace(",", " "), // basic comma-safe
                        type));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getTypeFromCarte(Carte carte) {
        if (carte instanceof CarteAttack) return "Attaque";
//        if (carte instanceof CarteDefense) return "Defense";
//        if (carte instanceof CarteEffet) return "Effet";
        if (carte instanceof CartePopularite) return "Popularité";
        return "Inconnu";
    }

    private static List<String> parseCSVLine(String line) {
        List<String> tokens = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean inQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '"') {
                inQuotes = !inQuotes; // toggle state
            } else if (c == ',' && !inQuotes) {
                tokens.add(sb.toString().trim());
                sb.setLength(0); // clear buffer
            } else {
                sb.append(c);
            }
        }
        tokens.add(sb.toString().trim()); // last token

        return tokens;
    }

}
