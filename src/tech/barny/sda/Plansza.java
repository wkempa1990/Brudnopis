package tech.barny.sda;

public class Plansza {
    private Pole[][] plansza;


    public Pole[][] obecnyStan() {
        Pole[][] kopia = new Pole[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                kopia[x][y] = plansza[x][y];
            }
        }
        return kopia;
    }

   @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pole[] rzad : plansza){
            sb.append(String.format("|%s|%s|%s|%n",
                    rzad[0],rzad[1],rzad[2]));
        }
        return sb.toString();
    }

    public Plansza() {
        plansza = stwórzPustąPlanszę();
    }

    public boolean wykonajRuch(Współrzędne ruch, Pole znak) {
        int wiersz = ruch.getX();
        int kolumna = ruch.getY();
        if (plansza[wiersz][kolumna] == Pole.PUSTE) {
            plansza[wiersz][kolumna] = znak;
            return true;
        } else {
            return false;
        }
    }

    public boolean jestPełna() {
        for (Pole[] rząd : plansza) {
            for (Pole pole : rząd) {
                if (pole == Pole.PUSTE) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean wygrał(Pole znak) {
        return trzyWKolumnie(znak) ||
                trzyWRzędzie(znak) ||
                trzyPoPrzekątnej(znak);
    }

    private Pole[][] stwórzPustąPlanszę() {
        Pole[][] pustaPlansza = {
                {Pole.PUSTE, Pole.PUSTE, Pole.PUSTE},
                {Pole.PUSTE, Pole.PUSTE, Pole.PUSTE},
                {Pole.PUSTE, Pole.PUSTE, Pole.PUSTE}
        };
        return pustaPlansza;
    }

    private boolean trzyWRzędzie(Pole znak) {
        for (Pole[] rząd : plansza) {
            if (
                    rząd[0] == znak &&
                            rząd[1] == znak &&
                            rząd[2] == znak
            ) {
                return true;
            }
        }
        return false;
    }

    private boolean trzyWKolumnie(Pole znak) {
        for (int k = 0; k < 3; k++) {
            int licznik = 0;
            for (int w = 0; w < 3; w++) {
                if (plansza[w][k] == znak) {
                    licznik++;
                    if (licznik == 3) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

    private boolean trzyPoPrzekątnej(Pole znak) {
        return (plansza[0][0] == znak && plansza[1][1] == znak && plansza[2][2] == znak) ||
                (plansza[0][2] == znak && plansza[1][1] == znak && plansza[2][0] == znak);

    }

}
