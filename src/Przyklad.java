import java.time.LocalDate;

public class Przyklad {
    public static void main(String[] args) {
        Generyczna<LocalDate> pudelkoNaDate = new Generyczna<>(LocalDate.now());
        pudelkoNaDate = new Generyczna<>();// jesli na czerwona trzeba wywolac konstruktor alt+enter
        pudelkoNaDate.setContent(LocalDate.now());
        LocalDate zawartosc = pudelkoNaDate.getContent();
        System.out.println(zawartosc);
    }
}
