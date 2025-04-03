package component_manager;

import components.Carte_Ihm;
import components.Zone_d_interaction;
import java.util.ArrayList;
import java.util.List;

public class GestionnaireCartes {

    private final List<Carte_Ihm> cartes = new ArrayList<>();
    private final List<Zone_d_interaction> zones = new ArrayList<>();

    public void ajouterCarte(Carte_Ihm carte) {
        cartes.add(carte);
    }

    public void ajouterZone(Zone_d_interaction zone) {
        zones.add(zone);
    }

    public void verifierToutesZones(Carte_Ihm carte) {
        for (Zone_d_interaction zone : zones) {
            zone.verifierCarte(carte); // délégué à la zone
        }
    }

    public List<Carte_Ihm> getCartes() {
        return cartes;
    }

    public List<Zone_d_interaction> getZones() {
        return zones;
    }

/*    
    public void affecterEffetTrainée(Carte_ carte) {
        int x = carte.getX();
        int y = carte.getY();

        carte.laisserTrainée(x, y);
    }
*/
}
