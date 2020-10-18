package com.lamiathomas;

import java.time.ZonedDateTime;

public class Reservation {
    private int numR;
    private ZonedDateTime dateR;

    public Reservation(int numR, ZonedDateTime dateR) {
        this.numR = numR;
        this.dateR = dateR;
    }

    public int getNumR() {
        return numR;
    }

    public void setNumR(int numR) {
        this.numR = numR;
    }

    public ZonedDateTime getDateR() {
        return dateR;
    }

    public void setDateR(ZonedDateTime dateR) {
        this.dateR = dateR;
    }

    public void Confirmer(){

    }

    public void Annuler(){

    }
}
