package com.Reservations;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;

public class Trajet {
    private Duration duree;
    private int nbEscale;
    private Vols vols;
    private Collection<Saut> sauts = new ArrayList<>();

    public Trajet() {
    }

    public Duration getDuree() {
        return duree;
    }

    public void setDuree(Duration duree) { //derivé
        this.duree = duree;
    }

    public int getNbEscale() {
        return nbEscale;
    }

    public void setNbEscale(int nbEscale) { //dérivé
        this.nbEscale = nbEscale;
    }

    public Vols getVols() {
        return vols;
    }

    public void setVols(Vols vols) {
        this.vols = vols;
    }

    public Collection<Saut> getSauts() {
        return sauts;
    }

    public void setSauts(Collection<Saut> sauts) {
        this.sauts = sauts;
    }
}
