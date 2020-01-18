package Regex;

import java.util.function.Predicate;
import java.util.regex.*;

class RegexExample {
    public static void main(String[] args) {
        boolean matches = Pattern.matches("\\d{2}-\\d{3}", "14252");
        System.out.println(matches);
        Pattern regex = Pattern.compile("\\d{2}-\\d{3}");
        Predicate<String> matchPr = regex.asMatchPredicate();
        boolean test1 = matchPr.test("25-141");
        Predicate<String> predicate = regex.asPredicate();
        boolean test2 = matchPr.test("a35-352");
        System.out.println(test1);
        System.out.println(test2);
    }
}


