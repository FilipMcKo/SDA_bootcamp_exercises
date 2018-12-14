package Zad5;

import java.io.*;
import java.util.*;

public class Kadry implements Serializable {

    private ArrayList<Pracownik> pracownicy;
    private int zatrudnienie;
    private Scanner scanner;

    public Kadry(ArrayList<Pracownik> pracownicy, int zatrudnienie) {
        this.pracownicy = pracownicy;
        this.zatrudnienie = zatrudnienie;
    }

    public void wypisz() {
        System.out.println("Liczba pracowników: " + this.zatrudnienie);
        for (Pracownik pracus : this.pracownicy) {
            System.out.println(pracus.toString());
        }
    }

    public void dodajPracownika(Pracownik pracownik) {
        if (zatrudnienie < 100) {
            this.pracownicy.add(pracownik);
            zatrudnienie++;
        } else {
            System.out.println("Osiągnięto maksymalne zatrudnienie (100 osoób).");
        }
    }

    public void dodajPracownikaInteraktywnie() {
        if (zatrudnienie >= 100) {
            System.out.println("Osiągnięto maksymalne zatrudnienie (100 osoób).");
        } else {
            System.out.println("Podaj dane nowego pracownika: ");
            Scanner scanner = new Scanner(System.in);
            System.out.print("  Podaj imię: ");
            String imie = scanner.nextLine();
            System.out.print("  Podaj nazwisko: ");
            String nazwisko = scanner.nextLine();
            System.out.print("  Podaj płeć (K/M): ");
            char plec = scanner.nextLine().toUpperCase().charAt(0);
            while (plec != 'M' && plec != 'K') {
                System.out.print("  Podano zły symbol.\n  Podaj płeć (K/M): ");
                plec = scanner.nextLine().toUpperCase().charAt(0);
            }
            System.out.print("  Podaj dział (nr): ");               //na koniec porobić jakieś try catche zeby input zawsze był wporzo
            int dzial = scanner.nextInt();
            System.out.print("  Podaj płacę: ");
            double placa = scanner.nextDouble();

            this.pracownicy.add(new Pracownik(imie, nazwisko, placa, plec, dzial));
            zatrudnienie++;

        }
    }

    public void sredniZarobek() {
        double sredniZarobek = 0;
        for (Pracownik pracus : this.pracownicy) {
            sredniZarobek += pracus.getPlaca();
        }
        sredniZarobek /= this.pracownicy.size();
        System.out.printf("Srednia płaca w firmie wynosi %.2f zł \n", sredniZarobek);
    }

    public void sredniZarobek(int dzial) {
        double sredniZarobek = 0;
        int rozmiarDzialu = 0;

        for (Pracownik pracus : this.pracownicy) {
            if (pracus.getDzial() == dzial) {
                sredniZarobek += pracus.getPlaca();
                rozmiarDzialu++;
            }
        }
        sredniZarobek /= rozmiarDzialu;
        System.out.printf("Srednia płaca w dziale %d wynosi %.2f zł \n", dzial, sredniZarobek);
    }

    public int[] dajDzialy() {
        TreeSet<Integer> dzialy = new TreeSet<>();
        for (Pracownik pracownik : pracownicy) dzialy.add(pracownik.getDzial());
        int[] temp = new int[dzialy.size()];
        int i = 0;
        for (Integer integer : dzialy) temp[i++] = integer;

        return temp;

    }

    public void importujZPlikuTekstowego(String nazwaPliku) {
        String imie;
        String nazwisko;
        double placa;
        char plec;
        int dzial;

        try {
            scanner = new Scanner(new File(nazwaPliku + ".txt"));
            while (scanner.hasNext()) {
                imie = scanner.next();
                nazwisko = scanner.next();
                placa = scanner.nextDouble();
                plec = scanner.next().charAt(0);
                dzial = scanner.nextInt();

                dodajPracownika(new Pracownik(imie, nazwisko, placa, plec, dzial));
            }
        } catch (Exception e) {
            System.out.println("Could not find file");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public void zapiszDoPliku(String nazwaPliku) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nazwaPliku + ".bin"))) {
            outputStream.writeObject(this.pracownicy);
            outputStream.writeInt(this.zatrudnienie);
            System.out.println("Poprawnie zapisano do pliku .bin");
        } catch (FileNotFoundException e) {
            System.out.println("zapiszDoPliku: FileNotFoundException");
        } catch (IOException e) {
            System.out.println("zapiszDoPliku: IOException");
            e.printStackTrace();
        }

    }

    public void odczytajZPliku(String nazwaPliku) {

        ArrayList<Pracownik> deserializedPracownicy = new ArrayList<>();
        int deserializedZatrudnienie = 0;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nazwaPliku + ".bin"))) {
            deserializedPracownicy = (ArrayList<Pracownik>) inputStream.readObject();
            deserializedZatrudnienie = inputStream.readInt();
            this.pracownicy.addAll(deserializedPracownicy);
            this.zatrudnienie+=deserializedZatrudnienie;
            System.out.println("Poprawnie wczytano z pliku .bin");

        } catch (FileNotFoundException e) {
            System.out.println("odczytajZPliku: FileNotFoundException");
        } catch (IOException e) {
            System.out.println("odczytajZPliku: IOException");
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            System.out.println("odczytajZPliku: ClassNotFoundException");
        }


    }
}
