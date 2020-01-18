package Regex;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        boolean matches = Pattern.matches("\\d{2}-\\d{3}","81-589");
        System.out.println(matches);
        Pattern regex = Pattern.compile("\\d{2}-\\d{3}");
    }
}
//([A-Za-z]+)@([A-Za-z]+)((\.([A-Za-z]{2,3})){1,2}) - kod do sprawdzania maila