package Czas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Zadanie22 {
    public static void main(String[] args) {


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("uuuu_MM");

        String dateString2 = LocalDate.now().format(dtf2);
        System.out.println(dateString2);
        YearMonth tenMiesiac = YearMonth.parse(dateString2,dtf2);
        System.out.println(tenMiesiac);
    }
}
