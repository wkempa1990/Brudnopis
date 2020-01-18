package Czas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Zadanie {
    public static void main(String[] args) {
           LocalDate dataurodzenia = LocalDate.of(2020,11,25);
           long days = LocalDate.now().until(dataurodzenia, ChronoUnit.DAYS);
        System.out.printf("Dni do nastepnych urodzin: %d%n", days);
        LocalDate primaaprilis = LocalDate.of(2019,4,1);
        long days1 = primaaprilis.until(LocalDate.now(), ChronoUnit.WEEKS);
        System.out.printf("Dni do nastepnych urodzin: %d%n", days1);
        LocalTime godzina = LocalTime.of(16,00);
       long czas = LocalTime.now().until(godzina, ChronoUnit.MILLIS);
        System.out.printf("Milisekundy do zakonczenia zajec: %d%n", czas);
    }
}
