package com.Reservations;

import java.util.ArrayList;
import java.util.Collection;

public class Ville {
    private String nomV;
     private Collection<Aeroport> aeroports = new ArrayList<Aeroport>();

    public String getNomV() {
        return nomV;
    }

    public void setNomV(String nomV) {
        this.nomV = nomV;
    }

    public Ville(String nomV) {
        this.nomV = nomV;
    }
}
