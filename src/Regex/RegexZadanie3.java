package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
    public class RegexZadanie3 {
        public static void main(String[] args) {
            Pattern emailRegex = Pattern.compile("(\\p{L}*\\s\\p{L}*\\s*);(\\s*[0-9]*);(\\s*[0-9]*\\s*\\p{L}*)");
            String textWithEmails =
                    "Tomasz Lis; 55; 5000zl \n Jakub Gąbka; 17;1000000 zł \n  Kamil Durczok    ;45; 0zł ";
            Matcher matcher = emailRegex.matcher(textWithEmails);
            boolean found;
            do {
                found = matcher.find();
                if (found) {
                    System.out.printf("Dopasowanie %s [%d:%d]%n", matcher.group(), matcher.start(), matcher.end());
                    System.out.printf("Imie %s [%d:%d]%n", matcher.group(1), matcher.start(1), matcher.end(1));
                    System.out.printf("Wiek %s [%d:%d]%n", matcher.group(2), matcher.start(2), matcher.end(2));
                    System.out.printf("KAsa %s [%d:%d]%n", matcher.group(3), matcher.start(3), matcher.end(3));
                }
            }while (found) ;
                found = matcher.find();

    }


}
//"(?<Name>\\p{L}*\\s\\p{L}*)\\s*;\\s*(?<Age>[0-9]+) *;\\s*(?<Money>[0-9]+ *\\p{L}*)" - rowniez poprawny wynik