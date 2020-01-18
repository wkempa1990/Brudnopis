package Kurs;

public class Samochod {

    String nazwa;
    int rocznik;
    int paliwo;
    int model;

    public Samochod(String nazwa, int rocznik, int paliwo, int model) {
        this.model = model;
        this.nazwa = nazwa;
        this.paliwo = paliwo;
        this.rocznik = rocznik;
    }

    public String getAuto() {
        String auto;

        auto = "Nazwa" + "  " + nazwa + model + "\nrok" + " " + rocznik + " " + paliwo;


        return auto;

    }
}

