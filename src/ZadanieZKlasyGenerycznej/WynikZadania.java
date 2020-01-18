package ZadanieZKlasyGenerycznej;

import ZadanieZKlasyGenerycznej.PaniZWarzywniaka;
import ZadanieZKlasyGenerycznej.SokHortex;

public class WynikZadania <F, S> {
    private Zadanie<F> sad ;
    private SokHortex<F ,S> hortex;
    private PaniZWarzywniaka<S> halinka;
    private double kasa = 0.0;

    public WynikZadania(Zadanie<F> sad, SokHortex<F, S> hortex, PaniZWarzywniaka<S>halinka){
        this.sad = sad;
        this.hortex =hortex;
        this.halinka=halinka;

    }
    public void uruchomProces(int i ){
        for(int x = 0; x<i;x++){
            F owoc= sad.dajOwoca();
            S sok= hortex.wyciskaj(owoc);
            double pieniadz = halinka.wezSok(sok);
            kasa +=pieniadz;
        }
    }
    public double sprawdzKase(){
        return kasa;
    }
}
