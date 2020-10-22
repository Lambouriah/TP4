package com.Reservations;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
    private String nom,ref,contact;
    private float paiement;
    private Collection<Reservation> reservations = new ArrayList<>();

    public Client(String nom, String ref, String contact, float paiement) {
        this.nom = nom;
        this.ref = ref;
        this.contact = contact;
        this.paiement = paiement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public float getPaiement() {
        return paiement;
    }

    public void setPaiement(float paiement) {
        this.paiement = paiement;
    }
}
