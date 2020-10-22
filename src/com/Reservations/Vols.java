package com.Reservations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Vols {
    private int num;
    //private ZonedDateTime date_dep;
    //private ZonedDateTime date_arr;
    //private ZonedDateTime duree;
    private Aeroport depart;
    private Aeroport arrivee;
    private Compagnie compagnie;
    private Trajet trajet;
    private List<Aeroport> aeroports = new ArrayList<>(); //agregation
    private Collection<Escale> escales = new ArrayList<>();

    public Vols() {
    }

    public Aeroport getDepart() {
        return depart;
    }

    public void setDepart(Aeroport depart) {
        this.depart = depart;
    }

    public Aeroport getArrivee() {
        return arrivee;
    }

    public void setArrivee(Aeroport arrivee) {
        this.arrivee = arrivee;
    }

    public Compagnie getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

    public Vols(int num) /*ZonedDateTime date_dep, ZonedDateTime date_arr, ZonedDateTime duree*/ {
        this.num = num;
       /* this.date_dep = date_dep;
        this.date_arr = date_arr;
        this.duree = duree; */
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    /*public ZonedDateTime getDate_dep() {
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
*/

    public void ouvrir(){


    }
    public void fermer(){

    }

    @Override
    public boolean equals(Object obj) {

            try{
                Vols v=((Vols) obj);
                return v.equals(this.num);

            }catch(Exception e){
                return false;

            }
    }
}
