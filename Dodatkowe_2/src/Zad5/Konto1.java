package Zad5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Konto1 {

    public static void main(String[] args) {
        ArrayList<Pracownik> pracownicy = new ArrayList<>();
        Kadry kadry = new Kadry(pracownicy, pracownicy.size());

        kadry.importujZPlikuTekstowego("kadry1");
        kadry.wypisz();
        kadry.zapiszDoPliku("kadry2");
        kadry.odczytajZPliku("kadry2");
        kadry.wypisz();
        kadry.sredniZarobek();
        System.out.println(Arrays.toString(kadry.dajDzialy()));
        kadry.sredniZarobek(3);


    }
}


