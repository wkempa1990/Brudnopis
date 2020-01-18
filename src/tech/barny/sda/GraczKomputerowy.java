package tech.barny.sda;

public class GraczKomputerowy extends Gracz {
    public Współrzędne następnyRuch(Pole[][] plansza) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (plansza[x][y] == Pole.PUSTE) {
                    return new Współrzędne(x, y);
                }
            }
        }
        return null;
    }
}
