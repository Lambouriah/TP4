package com.Reservations;

import java.util.ArrayList;
import java.util.Collection;

public class Compagnie {
    private String nom;
    private Collection<Vols> vols = new ArrayList<>(); //agrégation
    //private Vol vol;


    public Compagnie() {
        //const vide
    }

    public Compagnie(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Collection<Vols> getVols() {
        return vols;
    }

    public void setVols(Collection<Vols> vols) {
        this.vols = vols;
    }
    public void addVols(Vols vols){
        this.vols.add(vols);
    }

    public void removeVols(Vols vols){
        this.vols.remove(vols);
    }
}
