package com.Reservations;

import java.time.Duration;

public class Trajet {
    private Duration duree;
    private int nbEscale;
    private Vols vols;

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
}
