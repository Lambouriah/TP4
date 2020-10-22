package com.Reservations;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Escale {
    private ZonedDateTime Earrive;
    private ZonedDateTime Edepart;
    private ZonedDateTime Eduree;

    private Aeroport aeroport; //classe association
    private Vols vol; //classe association

    public Escale(ZonedDateTime earrive, ZonedDateTime edepart, ZonedDateTime eduree, Aeroport aeroport, Vols vol) {
        Earrive = earrive;
        Edepart = edepart;
        Eduree = eduree;
        this.aeroport = aeroport;
        this.vol = vol;
    }

    public ZonedDateTime getEarrive() {
        return Earrive;
    }

    public void setEarrive(ZonedDateTime earrive) {
        Earrive = earrive;
    }

    public ZonedDateTime getEdepart() {
        return Edepart;
    }

    public void setEdepart(ZonedDateTime edepart) {
        Edepart = edepart;
    }

    public long getEduree(ZonedDateTime edepart, ZonedDateTime earrive, ChronoUnit unit) {
        return unit.between(earrive,edepart);
    }

    public void setEduree(ZonedDateTime eduree) {
        Eduree = eduree;
    }

    public Aeroport getAeroport() {
        return aeroport;
    }

    public void setAeroport(Aeroport aeroport) {
        this.aeroport = aeroport;
    }

    public Vols getVol() {
        return vol;
    }

    public void setVol(Vols vol) {
        this.vol = vol;
    }
}

