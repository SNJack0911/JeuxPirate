package com.ilu4.jeuxpirate.noyau;

import java.util.Map;

public class Effet implements IEffet {

    private Joueur player;
    private Map<String, Integer> effet;

    @Override
    public void appliqueEffet() {
        for (String stat : effet.keySet()) {
            if (player.applyStats(stat, effet.get(stat))){
                System.out.println("Effet appliqué : " + stat + " " + effet.get(stat));
            }else{
                throw new IllegalArgumentException("Statistique non reconnue : " + stat);
            }
        }
    }
}
