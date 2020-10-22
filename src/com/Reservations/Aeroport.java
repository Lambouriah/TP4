package com.Reservations;

import java.util.ArrayList;
import java.util.Collection;

public class Aeroport {
    private String nomA;
    private Ville ville;
    private Collection<Vols> vols = new ArrayList<>();
    public Aeroport() {
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public String getNomA() {
        return nomA;
    }

    public void setNomA(String nomA) {
        this.nomA = nomA;
    }

    public Aeroport(String nomA) {
        this.nomA = nomA;
    }
}
