package Czas;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class NowaData{
    public static void main(String[] args) {
        DateTimeFormatter własnyFormatter = DateTimeFormatter.ofPattern("(uuuu) - (MM) - (dd) - (gg) - (EE)");
        String wDzwinymFormacie = LocalDate.now().format(własnyFormatter);
        System.out.println(wDzwinymFormacie);
    }
}
