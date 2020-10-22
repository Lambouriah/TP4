package com.Reservations;

import java.util.ArrayList;
import java.util.Collection;

public class Passagers {
    private String nomP;
    private Collection<Reservation> reservations = new ArrayList<>();

    public Passagers(String nomP) {
        this.nomP = nomP;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }
}
