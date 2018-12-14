package Zad5;

import java.io.Serializable;
import java.util.Formatter;

public class Pracownik implements Serializable {

    private String imie;
    private String nazwisko;
    private double placa;
    private char plec;
    private int dzial;

    public Pracownik(String imie, String nazwisko, double placa, char plec, int dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.placa = placa;
        this.plec = plec;
        this.dzial = dzial;
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        formatter.format("%1$12s %2$12s %3$3s %4$3d %5$8.2f zł ", this.imie, this.nazwisko, this.plec, this.dzial, this.placa);
        return formatter.toString();
    }

    boolean czyPracujeWDziale(int nrDzialu) {
        if (this.dzial == nrDzialu) return true;
        return false;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getPlaca() {
        return placa;
    }

    public char getPlec() {
        return plec;
    }

    public int getDzial() {
        return dzial;
    }
}
