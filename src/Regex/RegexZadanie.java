package Regex;

import java.util.regex.*;
public class RegexZadanie {
    public static void main(String[]args){
        Pattern separator = Pattern.compile("[\\s.]+");
        String x = "Ala \r ma kota \n ale   \n psa. \t nie. \r ";
        System.out.println(x);
        String [] words = separator.split(x);
        String zdanie2 =String.join("-", words);
        System.out.println(zdanie2);
    }
}
