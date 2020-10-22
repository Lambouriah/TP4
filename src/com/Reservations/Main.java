package com.Reservations;

public class Main {

    public static void main(String[] args) {
    Vols v = new Vols(); //creer un vol
    v.setNum(1234);

        System.out.println("premier vol: "+v.getNum() );

        //Ajouter un vol a une compagnie
    Compagnie c= new Compagnie();
    c.addVols(v);
        System.out.println("vol ajouté");
        c.setNom("air algerie");
       System.out.println(v.getCompagnie());



    }
}
