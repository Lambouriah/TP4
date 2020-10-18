package com.lamiathomas;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Vol {
    private int num;
    private ZonedDateTime date_dep;
    private ZonedDateTime date_arr;
    private ZonedDateTime duree;
    private Aeroport aeroport;


    public Vol(int num, ZonedDateTime date_dep, ZonedDateTime date_arr, ZonedDateTime duree) {
        this.num = num;
        this.date_dep = date_dep;
        this.date_arr = date_arr;
        this.duree = duree;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ZonedDateTime getDate_dep() {
        return date_dep;
    }

    public void setDate_dep(ZonedDateTime date_dep) {
        this.date_dep = date_dep;
    }

    public ZonedDateTime getDate_arr() {
        return date_arr;
    }

    public void setDate_arr(ZonedDateTime date_arr) {
        this.date_arr = date_arr;
    }

    public long getDuree(ZonedDateTime date_arr, ZonedDateTime date_dep, ChronoUnit unit) {

        return unit.between(date_arr, date_dep); //dérivé

    }

    public void setDuree(ZonedDateTime duree) {
        this.duree = duree;

    }


    public void ouvrir(){


    }
    public void fermer(){

    }
}
