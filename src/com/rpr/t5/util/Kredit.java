package com.rpr.t5.util;

import com.rpr.t5.Korisnik;

import java.util.List;
import java.util.stream.Collectors;

public final class Kredit {

    public static Double proracunKreditneSposobnosti(KreditnaSposobnost funkcija, Korisnik korisnik) {
        Double kredit = funkcija.izracunajKreditnuSposobnost(korisnik.getRacun());
        return kredit;
    }

    public static void ispisiSveKorisnikeBezPrekoracenja(List<Korisnik> korisnici) {
        List<Korisnik> korisniciBezPrekoracenja = korisnici.stream()
                .filter(korisnik -> korisnik.getRacun().getStanjeRacuna() > 0)
                .collect(Collectors.toList());

        System.out.println("Korisnici bez prekoracenja po racunu:");
        korisniciBezPrekoracenja.forEach(korisnik -> {
            System.out.println(korisnik.toString());
        });
    }

    public static void izvršiOdobrenjePrekoracenja(List<Korisnik> korisnici) {

         korisnici.stream()
                 .filter(korisnik -> korisnik.getRacun().getStanjeRacuna() > 10000)
                 .collect(Collectors.toList())
                 .forEach(k->k.getRacun().odobriPrekoracenje());
    }
}
