package ZadanieZKlasyGenerycznej;

import ZadanieZKlasyGenerycznej.Jablko;
import ZadanieZKlasyGenerycznej.SokHortex;
import ZadanieZKlasyGenerycznej.SokJablkowy;

public class WyciskanieJablek implements SokHortex<Jablko, SokJablkowy> {
    @Override
    public SokJablkowy wyciskaj(Jablko owoc) {
        return new SokJablkowy();
    }
}
