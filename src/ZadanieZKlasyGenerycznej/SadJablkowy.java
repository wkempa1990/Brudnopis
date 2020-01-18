package ZadanieZKlasyGenerycznej;

import ZadanieZKlasyGenerycznej.Jablko;

public class SadJablkowy implements Zadanie<Jablko> {
    @Override
    public Jablko dajOwoca() {
        return new Jablko();
    }
}

