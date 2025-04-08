package com.ilu4.jeuxpirate.noyau;

import java.util.*;

public abstract class Carte implements ICarte {
    private String nom;
    private String description;
    private List<Effet> effet;
    public Carte(String nom, String description,List<Effet> effet){
        this.nom = nom;
        this.description = description;
        this.effet = effet;
    }
    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void appliqueEffet() {
        for (Effet e : effet) {
            e.appliqueEffet();
        }
    }
}
