package com.lamiathomas;

import java.util.ArrayList;
import java.util.List;

public class Compagnie {
    private String nom;
    private List<Vol> vols = new ArrayList<Vol>(); //agrégation
    //private Vol vol;

        public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Compagnie(String nom) {
        this.nom = nom;
    }

}
