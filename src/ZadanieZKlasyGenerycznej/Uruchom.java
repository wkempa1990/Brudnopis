package ZadanieZKlasyGenerycznej;

import ZadanieZKlasyGenerycznej.HalinaOdJablek;
import ZadanieZKlasyGenerycznej.SadJablkowy;

public class Uruchom {
    public static void main(String[] args) {
        WynikZadania proces = new WynikZadania<>(
                new SadJablkowy(), new WyciskanieJablek(), new HalinaOdJablek()
        );
        proces.uruchomProces(100);
        System.out.println(proces.sprawdzKase());
    }
}
