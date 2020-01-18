package Czas;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Dzien {
    public static void main(String[] args) {
        LocalDate dataurodzenia = LocalDate.of(1990,11,25);
        System.out.println(dataurodzenia);
        LocalTime czasurodzenia = LocalTime.of(10, 22, 33);
        System.out.println(czasurodzenia);
        LocalDateTime data = LocalDateTime.of(dataurodzenia, czasurodzenia);
        ZonedDateTime data1 = ZonedDateTime.now();
        System.out.println(data);
        System.out.println(data1);
        DayOfWeek dzienurodznia = dataurodzenia.getDayOfWeek();
        System.out.println(dzienurodznia);
        LocalDate plusWeeks = dataurodzenia.plusWeeks(33);
        System.out.println(plusWeeks);
        Period okres = Period.of(1,2,3);
        System.out.println(okres);
       int i =  dataurodzenia.compareTo(LocalDate.now());
        System.out.println(i);
       boolean equal= dataurodzenia.isEqual(LocalDate.now());
       boolean before= dataurodzenia.isBefore(LocalDate.now());
       boolean after = dataurodzenia.isAfter(LocalDate.now());
       System.out.println(equal);
        System.out.println(before);
        System.out.println(after);
        long until = dataurodzenia.until(LocalDate.now(), ChronoUnit.YEARS);
        System.out.println(until);
        long weeksAlive = dataurodzenia.until(LocalDate.now(), ChronoUnit.WEEKS);
        System.out.println(weeksAlive);


    }
}
