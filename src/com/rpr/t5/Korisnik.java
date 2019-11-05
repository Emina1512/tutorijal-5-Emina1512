package com.rpr.t5;

public class Korisnik extends Osoba {
    private Racun racun;

    public Korisnik(String ime, String prezime) {
        super(ime, prezime);
    }

    public boolean dodajRacun(Racun r) {
        if (racun == null) {
            racun = r;
            return true;
        } else {
            return false;
        }
    }

    public Racun getRacun() {
        return racun;
    }
}
