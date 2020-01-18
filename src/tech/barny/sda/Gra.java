package tech.barny.sda;

import java.util.Scanner;

public class Gra {
    private Plansza plansza = new Plansza();
    private Gracz graczX = new Gracz();
    private Gracz graczO = new Gracz();

    public Gra(boolean graczXkomputer, boolean graczYkomputer){
        graczX= graczXkomputer ? new GraczKomputerowy() : new Gracz();
        graczO = graczYkomputer ? new GraczKomputerowy() : new Gracz();
    }

    public void uruchom() {
        while (true) {
            System.out.println("Kolej gracza X:");
            boolean udaloSieX;
            do {
                Współrzędne współrzędneX = graczX.następnyRuch(plansza.obecnyStan());
                udaloSieX = plansza.wykonajRuch(współrzędneX, Pole.KRZYŻYK);
                if (!udaloSieX) {
                    System.out.println("ruch niepoprawny . sprobuj jeszczeraz");
                }
            } while (!udaloSieX);
            System.out.println(plansza);
            if (plansza.wygrał(Pole.KRZYŻYK)) {
                System.out.println("Gracz X wygral:");
                break;
            }
            if (plansza.jestPełna()) {
                System.out.println("Brak wygranej:Remis");
                break;
            }
            System.out.println("Kolej gracza O:");
            boolean udaloSieY;
            do {
                Współrzędne współrzędneO = graczO.następnyRuch(plansza.obecnyStan());
                udaloSieY = plansza.wykonajRuch(współrzędneO, Pole.KÓŁKO);
                if (!udaloSieY) {
                    System.out.println("ruch niepoprawny . sprobuj jeszczeraz");
                }
            } while (!udaloSieY);
            System.out.println(plansza);
            if (plansza.wygrał(Pole.KÓŁKO)) {
                System.out.println("gracz O wygral:");
                break;
            }
            if (plansza.jestPełna()) {
                System.out.println("Brak wygranej:Remis");
                break;
            }

        }
    }
}




