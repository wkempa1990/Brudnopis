package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
    public class RegexZadanie2 {
        public static void main(String[] args) {
            Pattern emailRegex = Pattern.compile("(?<user>[\\w.]+)@(?<subdomain>\\w+)\\.(?<uberdomain>[a-zA-Z]{2,3})");
            String textWithEmails =
                    "kamikaze87@outlook.com is the email " +
                            "of lkfsadjlkfadsjlk@n " +
                            "petersonXX@onet.pl and ";
            Matcher matcher = emailRegex.matcher(textWithEmails);
            boolean found;
            do {
                found = matcher.find();
                if (found) {
                    // System.out.println(matcher.group());
                   // System.out.println(matcher.start());
                  //  System.out.println(matcher.end());

                    System.out.printf("Użytkownik %s [%d:%d]%n", matcher.group("user"), matcher.start("subdomain"), matcher.end("uberdomain"));
                System.out.printf("Użytkownik %s [%d:%d]%n", matcher.group(2), matcher.start(2), matcher.end(2));
                    System.out.printf("Użytkownik %s [%d:%d]%n", matcher.group(3), matcher.start(3), matcher.end(3));




                  //  System.out.println(matcher.group(1));
                   // System.out.println(matcher.start(1));
                   // System.out.println(matcher.end(1));

                   // System.out.println(matcher.group(2));
                   // System.out.println(matcher.start(2));
                   // System.out.println(matcher.end(2));

                   // System.out.println(matcher.group(3));
                  //  System.out.println(matcher.start(3));
                    //System.out.println(matcher.end(3));


                }
            } while (found);
            found = matcher.find();
        }
    }

