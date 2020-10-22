package com.Reservations;

import java.time.Duration;

public class Saut {
    private Duration duree;
    private Trajet trajet;
    private float distance; //inf a 1000km

    public Saut() {

    }


    public Duration getDuree() {
        return duree;
    }

    public void setDuree(Duration duree) {
        this.duree = duree;
    }

    public Trajet getTrajet() {
        return trajet;
    }

    public void setTrajet(Trajet trajet) {
        this.trajet = trajet;
    }


}

