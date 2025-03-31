package component_manager;

import components.Carte_;
import components.Zone_d_interaction;
import java.util.ArrayList;
import java.util.List;

public class GestionnaireCartes {

    private final List<Carte_> cartes = new ArrayList<>();
    private final List<Zone_d_interaction> zones = new ArrayList<>();

    public void ajouterCarte(Carte_ carte) {
        cartes.add(carte);
    }

    public void ajouterZone(Zone_d_interaction zone) {
        zones.add(zone);
    }

    public void verifierToutesZones(Carte_ carte) {
        for (Zone_d_interaction zone : zones) {
            zone.verifierCarte(carte); // délégué à la zone
        }
    }

    public List<Carte_> getCartes() {
        return cartes;
    }

    public List<Zone_d_interaction> getZones() {
        return zones;
    }
}
