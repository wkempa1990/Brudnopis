package Czas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data11 {
    public static void main(String[] args) {
        DateTimeFormatter nazwa = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime jakaśData = LocalDateTime.of(2017, 2, 15, 20, 15);
        String dataTekst = jakaśData.format(nazwa);
        System.out.println(dataTekst);
        LocalDateTime innadata= LocalDateTime.parse("2011-12-03T10:15:30",nazwa);
        System.out.println(innadata);
        String data = LocalDate.now().format(DateTimeFormatter.ISO_WEEK_DATE);
        System.out.println(data);
    }}
