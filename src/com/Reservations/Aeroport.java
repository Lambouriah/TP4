package com.Reservations;

import java.util.ArrayList;
import java.util.Collection;

public class Aeroport {
    private String nomA;
    private Collection<Ville> ville = new ArrayList<>();
    private Collection<Vols> vols = new ArrayList<>();


    public Aeroport() {
    }

    public Collection<Ville> getVille() {
        return ville;
    }

    public void setVille(Collection<Ville> ville) {
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

    public Collection<Vols> getVols() {
        return vols;
    }

    public void setVols(Collection<Vols> vols) {
        this.vols = vols;
    }
}
