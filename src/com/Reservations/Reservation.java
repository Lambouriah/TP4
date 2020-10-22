package com.Reservations;

import java.time.ZonedDateTime;

public class Reservation {
    private int numR;
    private Client client;
    private Passagers passagers;
    private EtatReservation etatReservation;
    private ZonedDateTime dateR;

    public Reservation(int numR, ZonedDateTime dateR) {
        this.numR = numR;
        //this.dateR = dateR;
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

    public void payer (){
        //this.EtatReservation=this.EtatReservation.payer(this); //creer cette classe

    }

    public void Annuler(){
       // this.EtatReser=this.EtatReservation.Annuler(this);

    }
    private float prix(float montant){
        return montant;
    }

    private void Rembourser(){
        //this.EtatReservation=this.EtatReservation.Rembourser(this);
    }
    public void enregistrer(){
        //this.EtatReservation=this.EtatReservation.enregistrer(this);

    }
}
